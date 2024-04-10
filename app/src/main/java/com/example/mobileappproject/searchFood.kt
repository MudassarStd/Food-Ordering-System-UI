package com.example.task

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mobileappproject.databinding.ActivitySearchFoodBinding


class searchFood : AppCompatActivity() {
    private lateinit var binding: ActivitySearchFoodBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchFoodBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.searchbar.setOnClickListener {
            val intent = Intent(this, SearchFoood2::class.java)
            startActivity(intent)
        }
    }
}



