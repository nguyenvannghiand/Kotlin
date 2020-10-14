package com.example.daggerkotlin.network

import com.example.daggerkotlin.model.Profile
import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.GET

interface GithubApi {
    @GET("users/thanhniencung")
    fun getProfile(): Call<Profile>

    // Rx java
    @GET("users/thanhniencung")
    fun rxGetProfille(): Single<Profile>
}