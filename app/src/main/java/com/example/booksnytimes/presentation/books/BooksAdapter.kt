package com.example.booksnytimes.presentation.books

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView
import com.example.booksnytimes.R
import com.example.booksnytimes.data.model.Book
import kotlinx.android.synthetic.main.item_book.view.*

class BooksAdapter(
    private val books: List<Book>,
    val onItemClickListener: ((book: Book) -> Unit)
) : RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        //criar o item de layout
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false)
        return BooksViewHolder(view, onItemClickListener)
    }

    override fun getItemCount() = books.count()

    override fun onBindViewHolder(viewHolder: BooksAdapter.BooksViewHolder, position: Int) {
        viewHolder.bindView(books[position])
    }

    class BooksViewHolder(itemView: View,
                          private  val onItemClickListener: ((book: Book) -> Unit)) : RecyclerView.ViewHolder(itemView) {

        private val titulo = itemView.tvTitulo
        private val autor = itemView.tvAutor

        fun bindView(book: Book) {
            titulo.text = book.title
            autor.text = book.author

            itemView.setOnClickListener{
                onItemClickListener.invoke(book)
            }
        }

    }
}