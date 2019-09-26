package com.example.booksnytimes.presentation.books

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.booksnytimes.data.model.Book

/**
 * View model tem que ser independente do seu Android
 * Totalmente isolada da activity e do fragment
 */

class BooksViewModel : ViewModel() {

    //Livedata Architecture Components fica responsável por passar dados para a activity
    val booksLiveData: MutableLiveData<List<Book>> = MutableLiveData()

    //faz a requisição dos itens "na API fake"
    fun getBooks(){
        booksLiveData.value = createFakeBooks()
    }

    fun createFakeBooks() : List<Book> {
        return listOf<Book>(
            Book("Titulo 1", "Autor 1"),
            Book("Titulo 3", "Autor 3"),
            Book("Titulo 2", "Autor 2"),
            Book("Titulo 4", "Autor 4")
        )
    }

}