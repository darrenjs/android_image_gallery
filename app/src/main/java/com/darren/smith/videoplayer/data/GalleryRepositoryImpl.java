package com.darren.smith.videoplayer.data;

import com.darren.smith.videoplayer.domain.GalleryRepository;

import java.util.List;

/**
 * Implementation of GalleryRepository.
 * In this place you can combine different data sources (database, network, files system and etc.),
 * implement any kind of cache strategies,
 *
 * Repository helps to abstract from data sources.
 * All operations in repository should be performed concurrently (not in UI thread)
 */
public class GalleryRepositoryImpl implements GalleryRepository {

    private final DataSource dataSource;

    /**
     *
     * @param dataSource DataSource created and injected by  Koin di. Look di/module.kt
     */
    public GalleryRepositoryImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public List<String> getGalleryImages() {
        return dataSource.getImages();
    }

}
