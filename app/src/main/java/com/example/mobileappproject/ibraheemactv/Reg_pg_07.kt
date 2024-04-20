package com.example.mobileappproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.mobileappproject.R

class Reg_pg_07 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg_pg07)
        val btn = findViewById<TextView>(R.id.tvBtnPg7)

        btn.setOnClickListener {
            startActivity(Intent(this, reg_pg_no_08::class.java))
        }

    }
}