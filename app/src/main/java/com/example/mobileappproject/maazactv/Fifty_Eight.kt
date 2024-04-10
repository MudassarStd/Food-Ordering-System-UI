package com.example.mobileappproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobileappproject.databinding.ActivityFiftyEightBinding
import com.example.mobileappproject.databinding.ActivityFiftySevenBinding

class Fifty_Eight : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding: ActivityFiftyEightBinding by lazy {
            ActivityFiftyEightBinding.inflate(layoutInflater)
        }
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnorg.setOnClickListener{
            val intent= Intent(this@Fifty_Eight, Fifty_Nine::class.java )
            startActivity(intent)
        }
    }
}