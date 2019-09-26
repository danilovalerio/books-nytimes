package com.example.booksnytimes.presentation.books

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.booksnytimes.R
import com.example.booksnytimes.data.model.Book
import kotlinx.android.synthetic.main.activity_books.*

class BooksActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        toolbarMain.title = getString(R.string.books_title)
        setActionBar(toolbarMain)

        //com o with acessamos o RecyclerView e vemos seu conteúdo
        with(recyclerBooks){
            layoutManager = LinearLayoutManager(this@BooksActivity, RecyclerView.VERTICAL, false)
            setHasFixedSize(true) //para melhor performance
            adapter = BooksAdapter(getBooks())
        }

    }

    fun getBooks() : List<Book> {
        return listOf<Book>(
            Book("Titulo 1", "Autor 1"),
            Book("Titulo 3", "Autor 3"),
            Book("Titulo 2", "Autor 2"),
            Book("Titulo 4", "Autor 4")
        )
    }
}