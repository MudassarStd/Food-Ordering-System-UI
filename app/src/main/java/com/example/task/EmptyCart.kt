package com.example.task

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.task.databinding.ActivityEmptyCartBinding

class EmptyCart : AppCompatActivity() {
    private lateinit var binding: ActivityEmptyCartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmptyCartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        
        binding.yourFavourite.setOnClickListener {
            val intent = Intent(this, YourCart::class.java)
            startActivity(intent)
        }
    }
}



