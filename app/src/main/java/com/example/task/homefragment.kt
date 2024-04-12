package com.example.task


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.task.databinding.FragmentHomefragmentBinding

class homefragment : Fragment() {

    private var _binding: FragmentHomefragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomefragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recommendedOptions.setOnClickListener {
            // Start RecommendedOptionActivity
            val intent = Intent(requireContext(), recommendedOption::class.java)
            startActivity(intent)
        }

        binding.topRatedProducts.setOnClickListener {
            // Start TopRatedProducts
            val intent = Intent(requireContext(), recommendedOption::class.java)
            startActivity(intent)
        }

        binding.dealAroundYou.setOnClickListener {
            // Start TopRatedProducts
            val intent = Intent(requireContext(), recommendedOption::class.java)
            startActivity(intent)
        }

        binding.searchbar.setOnClickListener {
            // Start TopRatedProducts
            val intent = Intent(requireContext(), searchFood::class.java)
            startActivity(intent)
        }

        binding.cart.setOnClickListener {
            // Start TopRatedProducts
            val intent = Intent(requireContext(), EmptyCart::class.java)
            startActivity(intent)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
