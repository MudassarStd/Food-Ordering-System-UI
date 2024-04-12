package com.example.mobileappproject.delivery.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.mobileappproject.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class FragmentOrderPreparing : BottomSheetDialogFragment() {

//    val fragOrderProcessingObject = FragmentOrderProcessing()
    private val fragOrderDeliveringObject = FragmentOrderDelivering()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_order_preparing, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val deli = view.findViewById<ImageView>(R.id.iv3)
        deli.setOnClickListener {
            dismiss()
            fragOrderDeliveringObject.show(requireActivity().supportFragmentManager, fragOrderDeliveringObject.tag)
        }
    }
}