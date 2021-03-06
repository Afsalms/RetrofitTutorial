package com.example.qbuser.retrofittutorial.retrofit

import com.example.qbuser.retrofittutorial.models.Post
import retrofit2.Call
import retrofit2.http.GET
import java.util.*

interface RetrofitService {

   @GET("posts")
   fun getAllPosts(): Call<List<Post>>
}

