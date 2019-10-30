package com.chsltutorials.monitoramentometrolondres.model.repository

import com.chsltutorials.monitoramentometrolondres.model.entity.LineStatus
import com.chsltutorials.monitoramentometrolondres.model.mapper.LineStatusModelToLineStatusMapper
import com.chsltutorials.monitoramentometrolondres.model.service.StatusService
import io.reactivex.Single
import javax.inject.Inject

interface IStatusRepository {

    fun getLinesStatus(): Single<List<LineStatus>>
}


class StatusRepositoryImpl @Inject constructor(
    private val statusService: StatusService,
    private val mapper: LineStatusModelToLineStatusMapper
) : IStatusRepository {

    override fun getLinesStatus(): Single<List<LineStatus>> {
        return statusService.getStatus()
            .flattenAsObservable { it }
            .map { mapper.map(it) }
            .toList()
    }
}

