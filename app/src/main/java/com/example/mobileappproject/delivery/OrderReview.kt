package com.example.mobileappproject.delivery

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mobileappproject.R

class OrderReview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_order_review)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val deli = findViewById<TextView>(R.id.delivered_review_title)
        deli.setOnClickListener {
            val intent = Intent(this@OrderReview, Delivered::class.java)
            startActivity(intent)
        }

        val deliv = findViewById<TextView>(R.id.delivered_title)
        deliv.setOnClickListener {
            val intent = Intent(this@OrderReview, Delivered::class.java)
            startActivity(intent)
        }

    }
}