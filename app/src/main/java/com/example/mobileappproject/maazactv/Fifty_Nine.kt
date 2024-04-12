package com.example.mobileappproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobileappproject.databinding.ActivityFiftyEightBinding
import com.example.mobileappproject.databinding.ActivityFiftyNineBinding

class Fifty_Nine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding: ActivityFiftyNineBinding by lazy {
            ActivityFiftyNineBinding.inflate(layoutInflater)
        }
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}