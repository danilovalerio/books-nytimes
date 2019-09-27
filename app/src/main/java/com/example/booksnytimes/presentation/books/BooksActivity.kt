package com.example.booksnytimes.presentation.books

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.booksnytimes.R
import com.example.booksnytimes.data.model.Book
import com.example.booksnytimes.presentation.details.BookDetailsActivity
import kotlinx.android.synthetic.main.activity_books.*

class BooksActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        toolbarMain.title = getString(R.string.books_title)
        setActionBar(toolbarMain)

        //instanciando a view model na activity
        val viewModel: BooksViewModel = ViewModelProviders.of(this).get(BooksViewModel::class.java)

        //escutando o booksLiveData para qualquer alteração realizada
        viewModel.booksLiveData.observe(this, Observer {
            //com o let entramos no it(lista de livros) caso ele não seja nulo e nomeia o it como books
            it?.let { books ->
                //com o with acessamos o RecyclerView e vemos seu conteúdo
                with(recyclerBooks){
                    layoutManager = LinearLayoutManager(this@BooksActivity, RecyclerView.VERTICAL, false)
                    setHasFixedSize(true) //para melhor performance
                    adapter = BooksAdapter(books){book ->
                        val intent = BookDetailsActivity.getStartIntent(this@BooksActivity,book.title,book.description)
                        this@BooksActivity.startActivity(intent)


                    }
                }
            }
        })

        //que está no ViewModel
        viewModel.getBooks()



    }
}
