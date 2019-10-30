package com.chsltutorials.monitoramentometrolondres.model.service

import com.chsltutorials.monitoramentometrolondres.model.entity.LineStatus
import io.reactivex.Single
import retrofit2.http.GET

interface StatusService {

    @GET("Line/Mode/tube/Status")
    fun getStatus(): Single<List<LineStatus>>
}