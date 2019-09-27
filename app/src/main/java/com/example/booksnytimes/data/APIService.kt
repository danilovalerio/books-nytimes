package com.example.booksnytimes.data

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
/**
 * responsável pela inicialização do RETROFIT
 * Está classe é singletone(object companion) para ser instânciada uma única vez
 */
object APIService {

    private fun initRetrofit(): Retrofit {
        return val retrofit = Retrofit.Builder()
            .baseUrl("https://api.nytimes.com/svc/books/v3/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }

    //inicialização do retrofit
    val service = initRetrofit().create(NYTServices::class.java)



}