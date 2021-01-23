package com.darren.smith.videoplayer.presentation;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.bumptech.glide.Glide;
import com.darren.smith.videoplayer.R;

import kotlin.Lazy;

import static com.darren.smith.videoplayer.presentation.UiUtils.isTablet;
import static org.koin.android.viewmodel.compat.ViewModelCompat.viewModel;


/**
 * Represents the screen with preview images.
 * Access to business logic, data, and not ui computations should get via GalleryViewModel
 */
public class GalleryFragment extends Fragment {

    //instance of GalleryViewModel created and injected by  Koin di. Look di/module.kt
    private final Lazy<GalleryViewModel> galleryViewModel = viewModel(this, GalleryViewModel.class);

    private MediaPlayer mediaPlayer;
    private RecyclerView recyclerView;
    private SwipeRefreshLayout refreshLayout;

    private final GalleryAdapter adapter = new GalleryAdapter();

    private GalleryViewModel vm() {
        return galleryViewModel.getValue();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_gallery, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View root, @Nullable Bundle savedInstanceState) {
        initRecyclerView(root);
        initRefreshLayout(root);
        initImagesLiveData();
        initRingtone();

        vm().loadGalleryImages();
    }

    private void initRecyclerView(View root) {
        recyclerView = root.findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);

        final int spanCount = getPreviewsCountPerRow();
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), spanCount));
    }


    private int getPreviewsCountPerRow() {
        if (isTablet(requireContext())) {
            return UiUtils.isPortrait(requireContext()) ? 3 : 4;
        } else {
            return UiUtils.isPortrait(requireContext()) ? 2 : 3;
        }
    }

    private void initRefreshLayout(View root) {
        refreshLayout = root.findViewById(R.id.refreshLayout);
        refreshLayout.setOnRefreshListener(() -> vm().loadGalleryImages());
    }

    private void initRingtone() {

        try {
            AssetFileDescriptor afd = requireContext().getAssets().openFd("ringtone.mp3");

            mediaPlayer = new MediaPlayer();
            mediaPlayer.setOnCompletionListener(mp -> adapter.stopPlaying());
            mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
            mediaPlayer.prepare();
        } catch (Exception e) {
            Log.e("MediaPlayer", "Can't open ringtone.mp3", e);
            Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
            mediaPlayer = MediaPlayer.create(requireContext(), notification);

            if (mediaPlayer != null) {
                mediaPlayer.setOnCompletionListener(mp -> adapter.stopPlaying());
            }
        }
    }

    private void initImagesLiveData() {
        vm().imageListData.observe(getViewLifecycleOwner(), images -> {
            adapter.notifyDataSetChanged();
            refreshLayout.setRefreshing(false);
        });
    }

    final class GalleryAdapter extends Adapter<GalleryAdapter.PreviewViewHolder> {

        private int currentPlayingPosition = -1;

        @NonNull
        @Override
        public PreviewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(requireContext()).inflate(R.layout.item_gallery_preview, parent, false);
            return new PreviewViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull PreviewViewHolder holder, int position) {
            holder.bind(vm().getImages().get(position));
        }

        @Override
        public int getItemCount() {
            return vm().getImages().size();
        }

        public void stopPlaying() {
            final PreviewViewHolder holder = (PreviewViewHolder) recyclerView.findViewHolderForAdapterPosition(currentPlayingPosition);
            currentPlayingPosition = -1;
            if (holder != null) {
                holder.updateControlsVisibility();
            }
        }


        final class PreviewViewHolder extends ViewHolder {

            private final ImageView previewImageView;
            private final ImageView playImageView;
            private final FrameLayout progressLayout;
            private final ConstraintLayout constraintLayout;

            private String path;

            public PreviewViewHolder(@NonNull View v) {
                super(v);
                constraintLayout = v.findViewById(R.id.constraintLayout);
                previewImageView = v.findViewById(R.id.previewImageView);
                progressLayout = v.findViewById(R.id.progressLayout);
                playImageView = v.findViewById(R.id.playImageView);
                playImageView.setOnClickListener(v1 -> onPlayClick());
            }

            void bind(String path) {
                this.path = path;

                Glide.with(previewImageView)
                        .load(path)
                        .centerCrop()
                        .into(previewImageView);


                updateControlsVisibility();
            }

            void updateControlsVisibility() {
                if (getAdapterPosition() == currentPlayingPosition) {
                    playImageView.setVisibility(View.GONE);
                    progressLayout.setVisibility(View.VISIBLE);
                    progressLayout.setBackgroundResource(R.drawable.shape_teal_border);
                } else {
                    playImageView.setVisibility(View.VISIBLE);
                    progressLayout.setVisibility(View.GONE);
                    progressLayout.setBackground(null);
                }
            }


            private void onPlayClick() {
                if (mediaPlayer == null) return;
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                    stopPlaying();
                    initRingtone();
                }

                currentPlayingPosition = getAdapterPosition();
                mediaPlayer.start();
                updateControlsVisibility();
            }
        }
    }
}
