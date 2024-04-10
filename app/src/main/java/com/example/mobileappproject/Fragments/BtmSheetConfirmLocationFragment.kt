package com.example.mobileappproject.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.mobileappproject.R
import com.example.mobileappproject.Utils.MoveFragments
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class BtmSheetConfirmLocationFragment : BottomSheetDialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_btm_sheet_confirm_location, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnEditLocation = view.findViewById<Button>(R.id.btnEditLocation)
        val btnConfirmLocation = view.findViewById<Button>(R.id.btnConfirmLocation)


        // to edit location fragment
        btnEditLocation.setOnClickListener {
            MoveFragments.replaceFragmentOnPaymentHostActivity(requireActivity().supportFragmentManager, EditLocationFragment_43())
            dismiss()

        }

        // on confirming location, move to main payment page and dismiss BSV
        btnConfirmLocation.setOnClickListener {
            MoveFragments.replaceFragmentOnPaymentHostActivity(requireActivity().supportFragmentManager, Payment2Fragment_34())
            dismiss()
        }


    }

    }
