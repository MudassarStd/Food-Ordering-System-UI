package com.example.mobileappproject.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.mobileappproject.R
import com.example.mobileappproject.Utils.MoveFragments


class VoucherPromosFragment_33 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_voucher_promos_33, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btn = view.findViewById<Button>(R.id.btnVoucherOk)
        btn.setOnClickListener {
            MoveFragments.replaceFragmentOnPaymentHostActivity(requireActivity().supportFragmentManager, Payment2Fragment_34())
        }

    }
}