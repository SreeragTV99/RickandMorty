package com.example.mvvmmodel

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface ItemApi {
    @GET("/api/character")
    suspend fun getDatas(): Response<ItemList>
}