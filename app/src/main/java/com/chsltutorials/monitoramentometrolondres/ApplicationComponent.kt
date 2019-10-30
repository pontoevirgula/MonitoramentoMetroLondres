package com.chsltutorials.monitoramentometrolondres

import com.chsltutorials.monitoramentometrolondres.di.*
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [AppModule::class,
    NetworkModule::class,
    RepositoryModule::class,
    MappersModule::class,
    InteractorsModule::class])

interface ApplicationComponent {
    fun inject(app: App)
}