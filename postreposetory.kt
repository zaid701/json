package com.example.recycle

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import retrofit2.Retrofit
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class postreposetory {

        fun getpost(): Flow<List<Post>> = flow {

                val response=retrofitBuilder.api.getpo()
            emit(response)

        }.flowOn(Dispatchers.IO)

    }
