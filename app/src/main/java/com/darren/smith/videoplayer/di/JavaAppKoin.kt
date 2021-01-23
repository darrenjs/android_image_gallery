package com.darren.smith.videoplayer.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level.DEBUG

/**
 * Koin is DI framework written on kotlin.
 * So we need to write some kotlin code to provide dependencies
 */
fun init(app: Application) {
    startKoin {
        androidLogger(DEBUG)
        androidContext(app)
        modules(mainModule)
    }
}