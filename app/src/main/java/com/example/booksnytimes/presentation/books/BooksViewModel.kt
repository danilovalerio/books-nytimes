package com.example.booksnytimes.presentation.books

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.booksnytimes.data.ApiService
import com.example.booksnytimes.data.model.Book
import com.example.booksnytimes.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

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
        //Chamada de api service no mo assíncrono (enqueue)
        /**
        ApiService.service.getBooks().enqueue(object: Callback<BookBodyResponse> {
            override fun onResponse(call: Call<BookBodyResponse>,response: Response<BookBodyResponse>) {
                Log.i("RESPONSE_API",response.isSuccessful.toString())
                if (response.isSuccessful){
                    val books: MutableList<Book> = mutableListOf()

                    //.let para verificar se é nulo
                    response.body()?.let { bookBodyResponse ->
                        for (result in bookBodyResponse.bookResults){
                            //para da result
                            val book: Book = Book(
                                title = result.bookDetailResponses[0].title,
                                author = result.bookDetailResponses[0].author
                            )
                            books.add(book)
                        }
                    }

                    booksLiveData.value = books
                }
            }

            override fun onFailure(call: Call<BookBodyResponse>, t: Throwable) {

            }
        })
        */
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