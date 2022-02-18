package com.digimaster.projectdia.di

import com.digimaster.projectdia.viewmodel.DayLimaViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun injectDayLima(dayLimaViewModel: DayLimaViewModel)
}