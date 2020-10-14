package com.example.daggerkotlin.di

import com.example.daggerkotlin.ImageLoader
import com.example.daggerkotlin.network.GithubService
import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    fun provideGithubApi() = GithubService.create()

    @Provides
    fun provideImageLoader() = ImageLoader()
}