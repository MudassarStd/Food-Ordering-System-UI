package com.example.mobileappproject.Fragments

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.mobi.AddedNotesFragment
import com.example.mobileappproject.R
import com.example.mobileappproject.Utils.AddedNotesDataModel
import com.example.mobileappproject.Utils.MoveFragments
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BSVaddNoteFragment : BottomSheetDialogFragment() {

    private val max_notes_characters = 300
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b_s_vadd_note, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val et = view.findViewById<EditText>(R.id.etBSVaddNote)
        val tv = view.findViewById<TextView>(R.id.tvNotesWordCount)
        val tvViewAddNotes = view.findViewById<TextView>(R.id.tvViewAddedNotes)
        val btnAddNotes = view.findViewById<Button>(R.id.btnAddNotes)


        tvViewAddNotes.setOnClickListener {
            MoveFragments.replaceFragmentOnPaymentHostActivity(requireActivity().supportFragmentManager, AddedNotesFragment())
            dismiss() // dismisses BSV
        }


        // adding notes to list in Added Notes Data Model

        btnAddNotes.setOnClickListener {
            if (et.text.toString().isNotEmpty())
            {
                AddedNotesDataModel.addNotes(et.text.toString())
                et.text.clear()
            }
        }

        // ======================== Real time text Count ========================
        et.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // Not needed for this example
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // Update the TextView with the length of the entered text
                tv.text = "${s?.length ?: 0}"
                // Check if the length exceeds the maximum limit
                if (s?.length ?: 0 > max_notes_characters) {
                    // If so, truncate the text to the maximum limit
                    et.setText(s?.subSequence(0, max_notes_characters))
                    // Move the cursor to the end of the text
                    et.setSelection(max_notes_characters)
                }
            }

            override fun afterTextChanged(s: Editable?) {
                // Not needed for this example
            }
        })

        //----------------------------------------------------------------------
    }


    }
