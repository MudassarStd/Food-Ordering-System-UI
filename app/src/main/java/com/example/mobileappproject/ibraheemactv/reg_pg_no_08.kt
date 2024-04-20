package com.example.mobileappproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class reg_pg_no_08 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg_pg_no08)

        val btn = findViewById<TextView>(R.id.tvBtnPg8)

        btn.setOnClickListener {
            startActivity(Intent(this, reg_pg_no_09::class.java))
        }

    }
}