package com.digimaster.projectdia.di.service

import com.digimaster.projectdia.model.getalljob.DayLimaResponse
import io.reactivex.Single
import retrofit2.http.GET

interface AppService {
    @GET("api/v1/jobs")
    fun getAllJob():Single<DayLimaResponse>
}