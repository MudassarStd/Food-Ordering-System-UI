package com.example.mobileappproject

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.mobileappproject.Fragments.AddNewChatFragment
import com.example.mobileappproject.Fragments.ChatFragment
import com.example.mobileappproject.Fragments.Payment2Fragment_34
import com.example.mobileappproject.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        window.statusBarColor = ContextCompat.getColor(this, R.color.PrimaryAppColor)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnMoveFromMain.setOnClickListener {
            startActivity(Intent(this, PaymentHostActivity::class.java))
        }

        binding.btnMoveFromMaintoChats.setOnClickListener {
            startActivity(Intent(this, LocationFragmentHostActivity::class.java))
        }



//        binding.bottomNavMainActivity.setOnItemSelectedListener {
//            when(it.itemId){
//                R.id.bottomNavChat -> placeFragment(frag1)
//            }
//            true
//        }
    }




}
