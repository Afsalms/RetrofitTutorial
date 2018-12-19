package com.example.qbuser.retrofittutorial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.qbuser.retrofittutorial.retrofit.RetrofitService
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.internal.schedulers.IoScheduler
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val retrofit = Retrofit.Builder()
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://jsonplaceholder.typicode.com/")
            .build()

        val a = retrofit.create(RetrofitService::class.java)
        val result = a.getAllPosts()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe ({
                    result ->
                   println("Result There are ${result.items.size} Java developers in Lagos")
            }, { error ->
                println(error.printStackTrace())
            })






    }
}
