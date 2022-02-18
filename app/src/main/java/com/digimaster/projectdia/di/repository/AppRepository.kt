package com.digimaster.projectdia.di.repository

import com.digimaster.projectdia.model.getalljob.DayLimaResponse
import io.reactivex.Single

interface AppRepository {
    fun getAllJob(): Single<DayLimaResponse>
}