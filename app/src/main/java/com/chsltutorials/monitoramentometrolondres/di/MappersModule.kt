package com.chsltutorials.monitoramentometrolondres.di

import com.chsltutorials.monitoramentometrolondres.model.mapper.LineStatusModelToLineStatusMapper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MappersModule {

    @Provides
    @Singleton
    fun provideLineStatusModelToLineStatusMapper(): LineStatusModelToLineStatusMapper =
        LineStatusModelToLineStatusMapper()

}
