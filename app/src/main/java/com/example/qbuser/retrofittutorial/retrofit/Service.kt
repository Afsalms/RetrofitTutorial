package com.example.qbuser.retrofittutorial.retrofit

import com.example.qbuser.retrofittutorial.models.Country
import retrofit2.http.GET
import java.util.*

interface RetrofitService {

   @GET("countries")
   fun getAllCountries(): Observable<ArrayList<Country>>
}

