package com.example.mobileappproject.umaractv

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mobileappproject.Fifty_Four
import com.example.mobileappproject.R

class Activity_Umar52 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.umar_52)

        val btn = findViewById<Button>(R.id.btnUmar52)

        btn.setOnClickListener {
            startActivity(Intent(this, Fifty_Four::class.java))
        }

    }
}