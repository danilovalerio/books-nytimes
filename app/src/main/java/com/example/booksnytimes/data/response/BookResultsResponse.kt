package com.example.booksnytimes.data.response

import com.squareup.moshi.Json

/**
 * mapeamento do objeto book detais
 */
data class BookResultsResponse (
    @Json(name = "book_details")
    val bookDetailResponses: List<BookDetailsResponse>//mapeamento do details

)