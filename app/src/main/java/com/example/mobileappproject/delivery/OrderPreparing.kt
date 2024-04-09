package com.example.mobileappproject.delivery

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mobileappproject.R
import com.example.mobileappproject.databinding.ActivityOrderPreparingBinding
import com.example.mobileappproject.delivery.fragments.FragmentOrderPreparing

class OrderPreparing : AppCompatActivity() {
    private lateinit var binding :  ActivityOrderPreparingBinding

    private val fragObject  = FragmentOrderPreparing()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityOrderPreparingBinding.inflate(layoutInflater)
        setContentView(binding.root)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        fragObject.show(supportFragmentManager,fragObject.tag)
    }

}