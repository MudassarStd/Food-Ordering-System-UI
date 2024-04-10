package com.example.mobileappproject.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.inflate
import com.example.mobileappproject.R

class RVPaymentMethodsAdapter(val paymentMethods : List<String>, val logos : List<Int>) : Adapter<ViewHolderPaymentMethods>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderPaymentMethods {
        val inflate = LayoutInflater.from(parent.context)
        val view = inflate.inflate(R.layout.payment_methods_list_sample_layout_38, parent, false)
        return ViewHolderPaymentMethods(view)
    }

    override fun getItemCount(): Int {
        return paymentMethods.size
    }

    override fun onBindViewHolder(holder: ViewHolderPaymentMethods, position: Int) {
        holder.txt.text = paymentMethods[position]
        holder.img.setImageResource(logos[position])
        holder.rb.isChecked = position == 1
    }


}
class ViewHolderPaymentMethods(sampleView : View) : RecyclerView.ViewHolder(sampleView)
{
    val txt = sampleView.findViewById<TextView>(R.id.tvPaymentMethodNameDropDown)
    val img = sampleView.findViewById<ImageView>(R.id.ivPaymentMethodDropDownLogo)
    val rb = sampleView.findViewById<RadioButton>(R.id.rbPaymentMethodDropDown)


}
