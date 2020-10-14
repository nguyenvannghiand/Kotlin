package com.example.daggerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerkotlin.model.Profile
import com.example.daggerkotlin.network.GithubApi
import com.example.daggerkotlin.network.GithubService
import dagger.android.AndroidInjection
import io.reactivex.Scheduler
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers.io
import io.reactivex.schedulers.Schedulers
import io.reactivex.schedulers.Schedulers.io
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var githubApi: GithubApi

    @Inject
    lateinit var imageLoader: ImageLoader

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        githubApi.getProfile()
            .enqueue(object : Callback<Profile> {
                override fun onResponse(call: Call<Profile>, response: Response<Profile>) {
                    txtTestResult.text = response.body()?.login
                }

                override fun onFailure(call: Call<Profile>, t: Throwable) {
                    txtTestResult.text = t.message
                }
            })

        githubApi.getProfile()
            .enqueue(object : Callback<Profile> {
                override fun onResponse(call: Call<Profile>, response: Response<Profile>) {
                    response.body()?.avatar_url?.let { imageLoader.load(it, img_test) }
                }

                override fun onFailure(call: Call<Profile>, t: Throwable) {
                    txtTestResultRX.text = t.message
                }

            })

        // rx java

    }
}