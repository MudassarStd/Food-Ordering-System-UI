package com.example.mobileappproject.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.mobileappproject.R
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class EditOrderBtmSheetFragment : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_edit_order_btm_sheet, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnOrder = view.findViewById<Button>(R.id.btnCheckOrderBSV)
        val btnCheckOrderAgain = view.findViewById<Button>(R.id.btnOrderCheckAgainBSV)

        // closes BSV
        btnOrder.setOnClickListener {
            dismiss()
        }

        // implement logic to check order again
        btnCheckOrderAgain.setOnClickListener {

        }
    }
}