package com.digimaster.projectdia.di.remote

import com.digimaster.projectdia.di.service.AppService
import com.digimaster.projectdia.model.getalljob.DayLimaResponse
import io.reactivex.Single
import javax.inject.Inject

class AppRemoteDataSourceImpl @Inject constructor(private val service: AppService):AppRemoteDataSource {
    override fun getAllJob(): Single<DayLimaResponse> {
        return service.getAllJob()
    }

}