package com.example.mobileappproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobileappproject.databinding.ActivityFiftyFiveBinding
import com.example.mobileappproject.databinding.ActivityFiftySixBinding

class Fifty_Six : AppCompatActivity() {
    private val binding: ActivityFiftySixBinding by lazy {
        ActivityFiftySixBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnorg.setOnClickListener{
            val intent= Intent(this@Fifty_Six, Fifty_Seven::class.java )
            startActivity(intent)
        }
    }
}