package com.example.mvvmmodel

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitItem {
fun getInstance():Retrofit{
    return Retrofit.Builder()
        .baseUrl("https://rickandmortyapi.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

}
}