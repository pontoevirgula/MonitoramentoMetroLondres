package com.chsltutorials.monitoramentometrolondres.di

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(val app: App) {
    @Provides
    @Singleton
    fun provideApp(): App = app

    @Provides
    @Singleton
    fun provideAppContext(app: App): App = app
    //fun provideAppContext(app: App): Context = app
}
