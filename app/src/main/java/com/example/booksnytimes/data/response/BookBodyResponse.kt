package com.example.booksnytimes.data.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


/**
 * mapeamento do objeto principal que retorna na api
 */
@JsonClass(generateAdapter = true) //gera o boilerplate em tempo de execução
data class BookBodyResponse (
    @Json(name = "results") //body principal mapeado objeto da api
    val bookResults: List<BookResultsResponse> //mapeamento do results
)