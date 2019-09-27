package com.example.booksnytimes.data

import com.example.booksnytimes.data.model.Book
import com.example.booksnytimes.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Interface responsável por tratar os endpoints disponíveis na API do New York Times
 */
interface NYTServices {

    @GET("lists.json") //método GET e endpoint da API
    fun getBooks(
        @Query("api-key") apiKey: String = "cMg8StZFgc418Wi1UYqnbFuVvs2gNQNn",
        @Query("list") list: String = "hardcover-fiction" //parametro requirido pela api uma list (categoria)
    ) : Call<BookBodyResponse> //mapeamento do BookBodyResponse
}