package com.example.booksnytimes.books

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.booksnytimes.R
import kotlinx.android.synthetic.main.activity_books.*

class BooksActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        toolbarMain.title = "Livros"
        setActionBar(toolbarMain)

    }
}
