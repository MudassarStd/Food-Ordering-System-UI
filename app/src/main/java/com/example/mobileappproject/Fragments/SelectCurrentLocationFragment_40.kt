package com.example.mobileappproject.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.mobileappproject.R
import com.example.mobileappproject.Utils.MoveFragments


class SelectCurrentLocationFragment_40 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_select_current_location_40, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnSelectFromMap = view.findViewById<Button>(R.id.btnSelectLocationOnMap)

        btnSelectFromMap.setOnClickListener {
            MoveFragments.replaceFragmentOnPaymentHostActivity(requireActivity().supportFragmentManager, MapsFragment())
        }

    }
}
