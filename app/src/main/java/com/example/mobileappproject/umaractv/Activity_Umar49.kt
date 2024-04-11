package com.example.mobileappproject.umaractv

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mobileappproject.R

class Activity_Umar49 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.umar_49)

        val btn = findViewById<Button>(R.id.btnUmar49)

        btn.setOnClickListener {
            startActivity(Intent(this, Activity_Umar50::class.java))
        }
    }
}