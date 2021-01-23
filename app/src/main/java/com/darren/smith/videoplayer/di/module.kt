package com.darren.smith.videoplayer.di

import com.darren.smith.videoplayer.data.DataSource
import com.darren.smith.videoplayer.data.GalleryRepositoryImpl
import com.darren.smith.videoplayer.data.StubDataSource
import com.darren.smith.videoplayer.domain.GalleryRepository
import com.darren.smith.videoplayer.presentation.GalleryViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {

    //creates GalleryViewModel instance for injection
    viewModel { GalleryViewModel(get()) }


    //creates singleton DataSource instance for injection
    single<DataSource> { StubDataSource()  }

    //creates singleton GalleryRepository instance for injection
    single<GalleryRepository> { GalleryRepositoryImpl(get())  }
}