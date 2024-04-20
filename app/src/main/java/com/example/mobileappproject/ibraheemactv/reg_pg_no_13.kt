package com.example.mobileappproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class reg_pg_no_13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg_pg_no13)
        val btn = findViewById<TextView>(R.id.tvBtnPg13)

        btn.setOnClickListener {
            startActivity(Intent(this, reg_pg_no_14::class.java))
        }
    }
}