package com.example.mobileappproject.delivery.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.mobileappproject.R
import com.example.mobileappproject.delivery.Delivered
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class FragmentOrderDelivering : BottomSheetDialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_order_delivering, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val deli = view.findViewById<ImageView>(R.id.iv3)
        deli.setOnClickListener {
            val intent = Intent(this.context, Delivered::class.java)
            startActivity(intent)
        }
    }
}