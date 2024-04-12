package com.example.mobileappproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobileappproject.databinding.ActivityFiftySevenBinding
import com.example.mobileappproject.databinding.ActivityFiftySixBinding

class Fifty_Seven : AppCompatActivity() {
    private val binding: ActivityFiftySevenBinding by lazy {
        ActivityFiftySevenBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnorg.setOnClickListener{
            val intent= Intent(this@Fifty_Seven, Fifty_Eight::class.java )
            startActivity(intent)
        }
    }
}