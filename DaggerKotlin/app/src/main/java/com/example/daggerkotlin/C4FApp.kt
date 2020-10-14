package com.example.daggerkotlin

import android.app.Application
import com.example.daggerkotlin.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class C4FApp : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
        DaggerAppComponent.builder()
            .appplication(this)
            .build()


}