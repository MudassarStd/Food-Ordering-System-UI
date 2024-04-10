package com.example.mobileappproject.Fragments

import android.content.Intent
import android.os.Bundle
import android.os.IBinder.DeathRecipient
import android.os.Message
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mobileappproject.Adapters.ChatRVAdapter
import com.example.mobileappproject.MainActivity
import com.example.mobileappproject.R
import com.example.mobileappproject.Utils.ChatDataModel
import com.example.mobileappproject.Utils.MoveFragments
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class ChatFragment : Fragment() {


        private lateinit var recipientList : MutableList<String>
        private lateinit var messageList : MutableList<String>
        private lateinit var bottomNavigationView : BottomNavigationView
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_chat, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fabBtn = view.findViewById<ImageView>(R.id.ivAddChat)
        val rvChats = view.findViewById<RecyclerView>(R.id.rvChatFragment)
        val imgPlaceholder = view.findViewById<ImageView>(R.id.ivEmptyChatPlaceholder)
        val tvTitle = view.findViewById<TextView>(R.id.tvEmptyChaTitle)
        val tvDescription = view.findViewById<TextView>(R.id.tvEmptyChatDescription)



        fabBtn.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction().apply {
                replace(R.id.frameLayoutLocationFragsHostActivity, AddNewChatFragment())
                addToBackStack(null)
                commit()
            }
        }

        // logic to check whether rvChat is empty or Not {there is any chat or not}
//        imgPlaceholder.visibility = View.GONE

        // Logic to populate chat RV
        recipientList = ChatDataModel.recList
        messageList = ChatDataModel.msgList

        if (recipientList.isNotEmpty() && messageList.isNotEmpty()) {
            listOf(tvTitle, tvDescription, imgPlaceholder).forEach { textView ->
                if (textView.visibility == View.VISIBLE) {
                    textView.visibility = View.GONE

                    rvChats.adapter = ChatRVAdapter(recipientList, messageList)
                    rvChats.layoutManager = LinearLayoutManager(requireContext())
                    rvChats.visibility = View.VISIBLE


                }
            }
        }
    }
}
