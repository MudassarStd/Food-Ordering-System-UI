package com.example.mobileappproject.Fragments

import ChangePaymentMethodFragment_38
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.mobileappproject.R
import com.example.mobileappproject.Utils.MoveFragments
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BtmSheetPaymentMethodFragment : BottomSheetDialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_btm_sheet_payment_method, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnChangePaymentMethod = view.findViewById<Button>(R.id.btnChangePaymentMethod)

        btnChangePaymentMethod.setOnClickListener {
            MoveFragments.replaceFragmentOnPaymentHostActivity(requireActivity().supportFragmentManager,ChangePaymentMethodFragment_38())
            dismiss()
        }
    }


    }

