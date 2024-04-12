package com.example.mobileappproject.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import com.example.mobileappproject.R
import com.example.mobileappproject.Utils.ChatDataModel
import com.example.mobileappproject.Utils.MoveFragments
import com.google.android.material.floatingactionbutton.FloatingActionButton

class AddNewChatFragment : Fragment() {

    private lateinit var ivBtnSendMessage : ImageView
    private lateinit var userMessage : String
    private lateinit var reciepientName : String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_add_new_chat, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ivBtnSendMessage = view.findViewById(R.id.ivBtnSendMessage)
        val etMessage = view.findViewById<EditText>(R.id.etChatMessage)
        val etReciepient = view.findViewById<EditText>(R.id.etReceipient)


        ivBtnSendMessage.setOnClickListener {
            userMessage = etMessage.text.toString()
            reciepientName = etReciepient.text.toString()

            if(userMessage.isNotEmpty() && reciepientName.isNotEmpty())
                {
                    ChatDataModel.putDataIntoLists(userMessage, reciepientName)
                }

            requireActivity().supportFragmentManager.beginTransaction().apply {
                replace(R.id.frameLayoutLocationFragsHostActivity, ChatFragment())
                commit()
            }

        }
    }


}