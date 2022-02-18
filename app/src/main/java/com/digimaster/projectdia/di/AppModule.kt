package com.digimaster.projectdia.di

import com.digimaster.projectdia.di.remote.AppRemoteDataSource
import com.digimaster.projectdia.di.remote.AppRemoteDataSourceImpl
import com.digimaster.projectdia.di.repository.AppRepository
import com.digimaster.projectdia.di.repository.AppRepositoryImpl
import com.digimaster.projectdia.di.service.AppRetrofit
import com.digimaster.projectdia.di.service.AppService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    @Provides
    @Singleton
    fun provideRepository(appRemoteDataSource: AppRemoteDataSource): AppRepository {
        return AppRepositoryImpl(appRemoteDataSource)
    }
    @Provides
    @Singleton
    fun provideRemoteDataSource(appService: AppService): AppRemoteDataSource {
        return AppRemoteDataSourceImpl(appService)
    }
    @Provides
    @Singleton
    fun provideAppService(): AppService {
        return AppRetrofit.appService
    }

}