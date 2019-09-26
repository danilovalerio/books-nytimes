package com.example.booksnytimes.presentation.books

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.booksnytimes.R
import kotlinx.android.synthetic.main.activity_books.*

class BooksActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        toolbarMain.title = getString(R.string.books_title)
        setActionBar(toolbarMain)

    }
}
