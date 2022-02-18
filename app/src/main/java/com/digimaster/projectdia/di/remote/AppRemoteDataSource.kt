package com.digimaster.projectdia.di.remote

import com.digimaster.projectdia.model.getalljob.DayLimaResponse
import io.reactivex.Single

interface AppRemoteDataSource {
    fun getAllJob():Single<DayLimaResponse>
}