package com.example.qbuser.retrofittutorial.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitClient{


    val retrofit = Retrofit.Builder()
        .addConverterFactory(
            GsonConverterFactory.create())
        .baseUrl("http://10.6.16.18:8000")
        .build()
}