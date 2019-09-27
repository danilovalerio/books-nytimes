package com.example.booksnytimes.data.response

import com.squareup.moshi.Json

data class BookDetailsResponse (
    //@Json(name="title") //notação só para ilustrar por ser o mesmo não precisaria
    val title: String,
    val author: String, //como o nome é o mesmo do objeto não precisa da notação
    val description: String //como o nome é o mesmo do objeto não precisa da notação

)