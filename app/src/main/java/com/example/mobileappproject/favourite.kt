package com.example.task
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.content.Intent
import com.example.mobileappproject.R
import com.example.mobileappproject.databinding.FragmentFavouriteBinding


class favourite : Fragment() {

    private var _binding: FragmentFavouriteBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFavouriteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.yourFavourite.setOnClickListener {
            // Start RecommendedOptionActivity
            val intent = Intent(requireContext(), yourFavourite::class.java)
            startActivity(intent)
        }




    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
