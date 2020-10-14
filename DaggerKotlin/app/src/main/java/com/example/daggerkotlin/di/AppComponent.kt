package com.example.daggerkotlin.di

import com.example.daggerkotlin.C4FApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

//scope
@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        ActivityBindingModule::class
    ]
)
public interface AppComponent : AndroidInjector<C4FApp> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun appplication(app: C4FApp): Builder
        fun build(): AppComponent
    }

}