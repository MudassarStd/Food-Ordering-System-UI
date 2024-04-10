package com.example.mobileappproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mobileappproject.Fragments.Payment2Fragment_34
import com.example.mobileappproject.Utils.MoveFragments
import com.example.mobileappproject.databinding.ActivityPaymentHostBinding
import com.example.task.home

class PaymentHostActivity : AppCompatActivity() {
    private lateinit var binding : ActivityPaymentHostBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityPaymentHostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        MoveFragments.replaceFragmentOnPaymentHostActivity(supportFragmentManager, Payment2Fragment_34())
    }

//
    override fun onBackPressed() {
        val currentFragment = supportFragmentManager.findFragmentById(R.id.frameLayoutPaymentHostActivity)
        // Check if the current fragment is the one you want to replace
        if (currentFragment is Payment2Fragment_34) {
            // Replace with your custom fragment
            startActivity(Intent(this, home::class.java))
        } else {
            // Proceed with default back navigation
            super.onBackPressed()
        }
    }
}