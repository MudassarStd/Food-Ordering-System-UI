package com.example.mobileappproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobileappproject.databinding.ActivityFiftyFourBinding

class Fifty_Four : AppCompatActivity() {
    private val binding: ActivityFiftyFourBinding by lazy {
     ActivityFiftyFourBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnorg.setOnClickListener{
            val intent= Intent(this@Fifty_Four, Fifty_Five::class.java )
            startActivity(intent)
        }
    }
}