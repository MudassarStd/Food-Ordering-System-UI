package com.example.mobileappproject.delivery.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import com.example.mobileappproject.R
import com.example.mobileappproject.delivery.OrderDelivering
import com.example.mobileappproject.delivery.OrderPreparing
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class FragmentOrderProcessing : BottomSheetDialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_order_processing, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // getting id's of views from BottomSheetDialog

        val btn = view.findViewById<Button>(R.id.btnCancelOrderProcessing)


        btn.setOnClickListener {
            dismiss()
        }

        val prep = view.findViewById<ImageView>(R.id.iv2)
        prep.setOnClickListener {
            val intent = Intent(this.context, OrderPreparing::class.java)
            startActivity(intent)
        }

        val deli = view.findViewById<ImageView>(R.id.iv3)
        deli.setOnClickListener {
            val intent = Intent(this.context, OrderDelivering::class.java)
            startActivity(intent)
        }


//        val ll1 = view.findViewById<LinearLayout>(R.id.llLine1)
//        val ll2 = view.findViewById<LinearLayout>(R.id.llLine2)
//        val ll3 = view.findViewById<LinearLayout>(R.id.llLine3)
//
//
//        val iv1 = view.findViewById<ImageView>(R.id.iv1)
//        val iv2 = view.findViewById<ImageView>(R.id.iv2)
//        val iv3 = view.findViewById<ImageView>(R.id.iv3)
//
//
//        val tv1 = view.findViewById<TextView>(R.id.tv1)
//        val tv2 = view.findViewById<TextView>(R.id.tv2)
//        val tv3 = view.findViewById<TextView>(R.id.tv3)
//
//        val msg1 = view.findViewById<ImageView>(R.id.ivMsg1)
//        val msg2 = view.findViewById<ImageView>(R.id.ivMsg2)
//        val msg3 = view.findViewById<ImageView>(R.id.ivMsg3)


        // umair bhai implement following logic for all linear layouts on Bottom Sheet Dialog

//        ll2.setOnClickListener {
//            iv1.layoutParams.width = resources.getDimensionPixelSize(R.dimen.normal_width_height)
//            iv1.layoutParams.height = resources.getDimensionPixelSize(R.dimen.normal_width_height)
//
//            msg1.visibility = View.GONE
//
//            tv1.setTypeface(null, Typeface.NORMAL)
//            tv1.textSize = resources.getDimensionPixelSize(R.dimen.text_size_small).toFloat()
//
//
//
//            iv2.layoutParams.width = resources.getDimensionPixelSize(R.dimen.larger_width_height)
//            iv2.layoutParams.height = resources.getDimensionPixelSize(R.dimen.larger_width_height)
//
//            msg2.visibility = View.VISIBLE
//
//            tv2.setTypeface(null, Typeface.BOLD)
//            tv2.textSize = resources.getDimensionPixelSize(R.dimen.text_size_medium).toFloat()
//
//        }
    }
}