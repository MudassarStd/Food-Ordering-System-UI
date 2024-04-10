package com.example.mobileappproject.delivery.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.mobileappproject.R
import com.example.mobileappproject.delivery.Delivered
import com.example.mobileappproject.delivery.OrderReview
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

        val deli = view.findViewById<TextView>(R.id.tvTitleOrderDelivering)
        val iv2OD = view.findViewById<ImageView>(R.id.iv2OD)

        iv2OD.setOnClickListener {
            dismiss()
            val intent = Intent(requireContext(), OrderReview::class.java)
            startActivity(intent)
        }
    }
}