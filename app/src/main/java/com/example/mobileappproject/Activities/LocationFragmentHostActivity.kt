package com.example.mobileappproject

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mobileappproject.Fragments.ChatFragment
import com.example.mobileappproject.Fragments.Payment2Fragment_34
import com.example.mobileappproject.Fragments.SelectCurrentLocationFragment_40
import com.example.mobileappproject.Utils.MoveFragments
import com.example.mobileappproject.databinding.ActivityLocationFragmentHostBinding

class LocationFragmentHostActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLocationFragmentHostBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLocationFragmentHostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }




            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frameLayoutLocationFragsHostActivity, ChatFragment())
                addToBackStack(null)
                commit()
            }
        }
    }
