package com.example.daggerkotlin.network

import com.example.daggerkotlin.AppConstants
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class GithubService {
    companion object Factory{
        fun create(): GithubApi{
            var retrofit = Retrofit.Builder()
                .baseUrl(AppConstants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
            return retrofit.create(GithubApi::class.java)
        }
    }

}