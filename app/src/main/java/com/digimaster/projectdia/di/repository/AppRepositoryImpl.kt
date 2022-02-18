package com.digimaster.projectdia.di.repository

import com.digimaster.projectdia.di.remote.AppRemoteDataSource
import com.digimaster.projectdia.model.getalljob.DayLimaResponse
import com.digimaster.projectdia.service.AppService
import io.reactivex.Single
import javax.inject.Inject

class AppRepositoryImpl @Inject constructor(private val remoteDataSource: AppRemoteDataSource):AppRepository {
    override fun getAllJob(): Single<DayLimaResponse> {
        return remoteDataSource.getAllJob()

     }
}