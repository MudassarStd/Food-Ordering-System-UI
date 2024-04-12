package com.example.mobileappproject.umaractv

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import com.example.mobileappproject.R

class Activity_Umar51 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.umar_51)

      val btn = findViewById<Button>(R.id.btnUmar51)

        btn.setOnClickListener {
            startActivity(Intent(this, Activity_Umar52::class.java))
        }


    }
}