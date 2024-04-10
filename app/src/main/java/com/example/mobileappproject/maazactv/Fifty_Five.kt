package com.example.mobileappproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobileappproject.databinding.ActivityFiftyFiveBinding
import com.example.mobileappproject.databinding.ActivityFiftyFourBinding

class Fifty_Five : AppCompatActivity() {
    private val binding: ActivityFiftyFiveBinding by lazy {
        ActivityFiftyFiveBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnorg.setOnClickListener{
            val intent= Intent(this@Fifty_Five, Fifty_Six::class.java )
            startActivity(intent)
        }
    }
}