package com.example.mobileappproject.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.mobileappproject.Fifty_Four
import com.example.mobileappproject.LocationFragmentHostActivity
import com.example.mobileappproject.R
import com.example.mobileappproject.Utils.MoveFragments
import com.example.mobileappproject.delivery.DeliveryHistory
import com.example.mobileappproject.umaractv.Activity_Umar49


class Payment2Fragment_34 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_payment2_34, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnPaymentDetails = view.findViewById<Button>(R.id.btnPaymentDetailsShowBottomSheet)
        val btnEditOrder = view.findViewById<Button>(R.id.btnEditOrder)
        val cardPaymentMethod = view.findViewById<CardView>(R.id.cardPaymentMethod)
        val btnChangeLocation = view.findViewById<Button>(R.id.btnChangeLocation)
        val voucher = view.findViewById<CardView>(R.id.cardVoucher)
        val addNotes = view.findViewById<CardView>(R.id.cardAddNotes)


        var orderCount = 1


//        addNotes.setOnClickListener {
//            MoveFragments.replaceFragmentOnPaymentHostActivity(requireActivity().supportFragmentManager, AddNotesFragment())
//        }

        addNotes.setOnClickListener {
            BSVaddNoteFragment().show(requireActivity().supportFragmentManager, BSVaddNoteFragment().tag)
        }

        // moving to vouchers and promo codes
        voucher.setOnClickListener {
            MoveFragments.replaceFragmentOnPaymentHostActivity(requireActivity().supportFragmentManager, VoucherPromosFragment_33())
        }


        // ===================================== Displaying Bottom Sheets =====================================

        cardPaymentMethod.setOnClickListener {
            BtmSheetPaymentMethodFragment().show(requireActivity().supportFragmentManager, BtmSheetPaymentMethodFragment().tag)
        }

        // showing bottom sheet of payment details on click
        btnPaymentDetails.setOnClickListener {
//            BottomSheetPaymentDetailsFragment().show(requireActivity().supportFragmentManager, BottomSheetPaymentDetailsFragment().tag)

            startActivity(Intent(requireContext(), DeliveryHistory::class.java))
        }

        // showing bottom sheet of order double check on click
        btnEditOrder.setOnClickListener {
//            EditOrderBtmSheetFragment().show(requireActivity().supportFragmentManager, EditOrderBtmSheetFragment().tag)
            startActivity(Intent(requireContext(), Activity_Umar49::class.java))
        }
        // -----------------------------------------------------------------------------------------------------


        // move to select location fragments host activity
        btnChangeLocation.setOnClickListener {
            MoveFragments.replaceFragmentOnPaymentHostActivity(requireActivity().supportFragmentManager, SelectCurrentLocationFragment_40())
        }

        // =================================== logic to increment / decrement order count =========================================
        val inc = view.findViewById<ImageView>(R.id.ivIncrement)
        val dec = view.findViewById<ImageView>(R.id.ivDecrement)
        val orders = view.findViewById<TextView>(R.id.tvOrderCount)


        inc.setOnClickListener {
            orders.text = (++orderCount).toString()
        }

        dec.setOnClickListener {
            if (orderCount > 0){
                orders.text = (--orderCount).toString()
            }
        }
        // -----------------------------------------------------------------------------------------------------


    }




}