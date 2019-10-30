package com.chsltutorials.monitoramentometrolondres.di

import com.chsltutorials.monitoramentometrolondres.model.mapper.LineStatusModelToLineStatusMapper
import com.chsltutorials.monitoramentometrolondres.model.repository.IStatusRepository
import com.chsltutorials.monitoramentometrolondres.model.repository.StatusRepositoryImpl
import com.chsltutorials.monitoramentometrolondres.model.service.StatusService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun providesStatusRepository(statusService: StatusService,
                                 mapper: LineStatusModelToLineStatusMapper
    ):
            IStatusRepository = StatusRepositoryImpl(statusService, mapper)
}