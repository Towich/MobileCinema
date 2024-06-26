package com.towich.kinopoiskDev

import android.app.Application
import com.towich.kinopoiskDev.di.component.AppComponent
import com.towich.kinopoiskDev.di.component.DaggerAppComponent


class App : Application(){
    val appComponent: AppComponent by lazy {
        // Creates an instance of AppComponent using its Factory constructor
        // We pass the applicationContext that will be used as Context in the graph
        DaggerAppComponent.factory().create(applicationContext)
    }
}