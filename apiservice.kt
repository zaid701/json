package com.example.recycle
import retrofit2.Retrofit
import retrofit2.http.GET

interface apiservice {
    @GET("posts")
    suspend fun getpo():List<Post>
}