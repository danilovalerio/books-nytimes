package com.example.booksnytimes.data

import com.example.booksnytimes.data.model.Book
import retrofit2.Call
import retrofit2.http.GET

/**
 * Interface responsável por tratar os endpoints disponíveis na API do New York Times
 */
interface NYTServices {

    @GET("lists.json") //método GET e endpoint da API
    fun listRepos() : Call<List<>>
}