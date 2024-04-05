package com.towich.kinopoiskDev.di.component

import com.towich.kinopoiskDev.di.module.AppModule
import com.towich.kinopoiskDev.di.module.NetworkModule
import com.towich.kinopoiskDev.di.scope.AppScope
import dagger.Component
import javax.inject.Singleton

@Singleton
@AppScope
@Component(modules = [AppModule::class, NetworkModule::class])
interface ApplicationComponent {

}