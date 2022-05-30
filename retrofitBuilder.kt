package com.example.recycle

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object retrofitBuilder {
    private val retrofit:Retrofit by lazy {
        Retrofit.Builder().baseUrl(baseurl.baseurl).addConverterFactory(GsonConverterFactory.create()).build()
    }
    val api:apiservice by lazy {
        retrofit.create(apiservice::class.java)
    }
}