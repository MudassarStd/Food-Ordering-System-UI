package com.example.mobileappproject.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import androidx.recyclerview.widget.RecyclerView.inflate
import com.example.mobileappproject.R
import java.text.SimpleDateFormat
import java.util.*

class ChatRVAdapter(val recipients : List<String>, val messages : List<String>) : Adapter<ChatViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val inflate = LayoutInflater.from(parent.context)
        val view = inflate.inflate(R.layout.rv_chat_fragment_sample_layout, parent, false)
        return ChatViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        holder.msg.text = messages[position]
        holder.nam.text = recipients[position]
        holder.msgTime.text = getCurrentTime()
    }

    override fun getItemCount(): Int {
        return recipients.size
    }

    // custom method
    fun getCurrentTime(): String {
        val currentTime = Calendar.getInstance().time
        val format = SimpleDateFormat("hh:mm a", Locale.getDefault())
        return format.format(currentTime)
    }

}

class ChatViewHolder(sampleView : View) : ViewHolder(sampleView)
{
    val nam = sampleView.findViewById<TextView>(R.id.tvContactName)
    val msg = sampleView.findViewById<TextView>(R.id.tvContactMessage)
    val msgTime = sampleView.findViewById<TextView>(R.id.tvMessageTime)
}
