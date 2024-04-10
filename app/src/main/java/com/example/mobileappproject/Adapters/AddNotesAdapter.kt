package com.example.mobileappproject.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.mobileappproject.R

class AddNotesAdapter(val notes : List<String>) : Adapter<ViewHolderForNotes>() {

    private lateinit var i_listener : onItemClickListener

    interface onItemClickListener{
        fun onItemClick(itemPosition : Int)
        fun onItemLongClick(itemPosition: Int)
        fun onItemIconClick(itemPosition: Int)
    }


    // this method will trigger our interface in main activity
    fun setOnItemClickListener(listener: onItemClickListener)
    {
        i_listener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderForNotes {
        val inflate = LayoutInflater.from(parent.context)
        val view = inflate.inflate(R.layout.add_notes_sample_layout, parent, false)
        return ViewHolderForNotes(view, i_listener)
    }

    override fun getItemCount(): Int {
        return notes.size
    }

    override fun onBindViewHolder(holder: ViewHolderForNotes, position: Int) {
        holder.txt.text = notes[position]
    }
}

class ViewHolderForNotes(itemView : View, listener : AddNotesAdapter.onItemClickListener) : ViewHolder(itemView){
val txt = itemView.findViewById<TextView>(R.id.tvNote)

    val ivDeleteNote = itemView.findViewById<ImageView>(R.id.ivDeleteNote)


    init {
        itemView.setOnClickListener {
            listener.onItemClick(adapterPosition)
        }

        // setting up on item's icon click in RV
        ivDeleteNote.setOnClickListener {
            listener.onItemIconClick(adapterPosition)
        }

        // setting up long press on RV item click
        itemView.setOnLongClickListener {
            listener.onItemLongClick(adapterPosition)
            // returning true indicates long press is done
            true
        }
    }

}