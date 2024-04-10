package com.example.mobi

import android.app.AlertDialog
import android.widget.TextView
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mobileappproject.Adapters.AddNotesAdapter
import com.example.mobileappproject.R
import com.example.mobileappproject.Utils.AddedNotesDataModel.Companion.notesList

class AddedNotesFragment : Fragment() , AddNotesAdapter.onItemClickListener{

    private lateinit var rv : RecyclerView
    private lateinit var tvEmptyMessage : TextView
    private lateinit var tvNotesTitle : TextView

    val adapter = AddNotesAdapter(notesList)


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_added_notes, container, false)
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

         rv = view.findViewById<RecyclerView>(R.id.rvAddedNotes)
         tvEmptyMessage = view.findViewById<TextView>(R.id.tvEmptyRVNotesMessage)
         tvNotesTitle = view.findViewById<TextView>(R.id.tvAddedNotesTitle)
//        val del = view.findViewById<ImageView>(R.id.ivDeleteNote)




        rv.adapter = adapter
        adapter.setOnItemClickListener(this)


        rv.layoutManager  = LinearLayoutManager(requireContext())

        if (rv.adapter?.itemCount != 0) {
            tvEmptyMessage.visibility = View.GONE
            rv.visibility = View.VISIBLE
            tvNotesTitle.visibility = View.VISIBLE
        }

    }

    override fun onItemClick(itemPosition: Int) {
        Toast.makeText(requireContext(), "click at item ${itemPosition}", Toast.LENGTH_SHORT).show()

    }

    override fun onItemLongClick(itemPosition: Int) {
        Toast.makeText(requireContext(), "long press at item ${itemPosition}", Toast.LENGTH_SHORT).show()

    }

    override fun onItemIconClick(itemPosition: Int) {

        val dialog = AlertDialog.Builder(requireContext()).setTitle("Action")
            .setMessage("Are you sure to delete '${notesList[itemPosition]}' ?")
            .setPositiveButton("Yes"){ _, _ ->

                notesList.removeAt(itemPosition)

                if(rv.adapter?.itemCount == 0)
                {
                    tvEmptyMessage.visibility = View.VISIBLE
                    rv.visibility = View.GONE
                    tvNotesTitle.visibility = View.GONE
                }

                adapter.notifyDataSetChanged()
            }
            .setNegativeButton("No"){ _, _ ->
                // just closes dialog box
            }
            .create()
        dialog.show()
    }
}