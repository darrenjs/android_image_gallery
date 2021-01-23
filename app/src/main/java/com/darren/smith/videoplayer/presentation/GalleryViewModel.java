package com.darren.smith.videoplayer.presentation;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.darren.smith.videoplayer.domain.GalleryRepository;

import java.util.ArrayList;
import java.util.List;


/**
 * All data stored in ViewModel will survive configuration changes (for example: changing of orientation).
 * When activities and fragments destroyed ViewModel will be alive.
 *
 * Every screen should have own ViewModel.
 *
 * Don't store Activity context or Views in ViewModel, because of memory leaks will occur
 */
public class GalleryViewModel extends ViewModel {

    private final GalleryRepository repository;

    /**
     * @param repository instance of GalleryRepository created and injected by  Koin di. Look di/module.kt
     */
    public GalleryViewModel(GalleryRepository repository) {
        this.repository = repository;
    }


    /**
     * LiveData will notify subscribers when data was changed.
     * So Fragments will call public ViewModel methods and listen LiveData, but ViewModel won't know how use it
     */
    final MutableLiveData<List<String>> imageListData = new MutableLiveData<>();

    public List<String> getImages() {
        if (imageListData.getValue() == null) return new ArrayList<>();
        return imageListData.getValue();
    }


    public void loadGalleryImages() {
        List<String> result = repository.getGalleryImages();
        imageListData.setValue(result);

    }

}
