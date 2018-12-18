package com.example.qbuser.retrofittutorial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.qbuser.retrofittutorial.retrofit.RetrofitService
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.internal.schedulers.IoScheduler
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val retrofit = Retrofit.Builder().addConverterFactory(GsonConverterFactory.create(GsonBuilder)).
            addCallAdapterFactory(RxJava2CallAdapterFactory.create()).baseUrl("http:dhowberbackend.qburst.build/").build()


        val countriesApi = retrofit.create(RetrofitService::class.java)
        var response = countriesApi.getAllCountries()
        response

        )


    }
}
