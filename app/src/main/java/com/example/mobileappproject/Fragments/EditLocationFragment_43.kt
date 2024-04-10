package com.example.mobileappproject.Fragments

import android.graphics.drawable.RotateDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.mobileappproject.R
import com.example.mobileappproject.Utils.MoveFragments

class EditLocationFragment_43 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_edit_location_43, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tvlocation = view.findViewById<TextView>(R.id.tvCardLocation)
        val tvAddressLine = view.findViewById<TextView>(R.id.tvCardAddressLine)
        val tvCity = view.findViewById<TextView>(R.id.tvCardCity)
        val tvProvince = view.findViewById<TextView>(R.id.tvCardStateProvince)
        val tvPostZipCode = view.findViewById<TextView>(R.id.tvCardPostZipCode)
        val cardLocation = view.findViewById<CardView>(R.id.cardLocationTitle)
        val btnSaveLocation = view.findViewById<Button>(R.id.btnSaveLocationAfterEdit)
        val ivDropDownIcon = view.findViewById<ImageView>(R.id.ivIconEditLocationDropDown)


        // checking text views visibility inside following lambda function

        cardLocation.setOnClickListener {
            listOf(tvlocation, tvAddressLine, tvCity, tvProvince, tvPostZipCode).forEach { textView ->
                if (textView.visibility == View.GONE) {
                    textView.visibility = View.VISIBLE
                    ivDropDownIcon.rotation = 270f
                }
                else{
                    textView.visibility = View.GONE
                    ivDropDownIcon.rotation = 180f

                }
            }
        }

        // saving location and moving to main payment
        btnSaveLocation.setOnClickListener {
            MoveFragments.replaceFragmentOnPaymentHostActivity(requireActivity().supportFragmentManager, Payment2Fragment_34())
        }


    }
}