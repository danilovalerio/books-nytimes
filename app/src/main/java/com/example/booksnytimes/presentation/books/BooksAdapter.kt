package com.example.booksnytimes.presentation.books

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.booksnytimes.R
import com.example.booksnytimes.data.model.Book
import kotlinx.android.synthetic.main.item_book.view.*

class BooksAdapter(
    val books: List<Book>
) : RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        //criar o item de layout
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false)
        return BooksViewHolder(view)
    }

    override fun getItemCount() = books.count()

    override fun onBindViewHolder(viewHolder: BooksAdapter.BooksViewHolder, position: Int) {
        viewHolder.bindView(books[position])
    }

    class BooksViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val titulo = itemView.tvTitulo
        private val autor = itemView.tvAutor

        fun bindView(book: Book) {
            titulo.text = book.title
            autor.text = book.author
        }

    }
}