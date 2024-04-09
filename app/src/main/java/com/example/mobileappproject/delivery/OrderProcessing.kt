package com.example.mobileappproject.delivery

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mobileappproject.R
import com.example.mobileappproject.databinding.ActivityProcessOrderingBinding
import com.example.mobileappproject.delivery.fragments.FragmentOrderProcessing

class OrderProcessing : AppCompatActivity() {
    private lateinit var binding :  ActivityProcessOrderingBinding

    private val fragObject  = FragmentOrderProcessing()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityProcessOrderingBinding.inflate(layoutInflater)
        setContentView(binding.root)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        fragObject.show(supportFragmentManager,fragObject.tag)
    }
    
}