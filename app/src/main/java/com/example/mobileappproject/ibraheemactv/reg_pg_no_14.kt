package com.example.mobileappproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class reg_pg_no_14 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg_pg_no14)
        val btn = findViewById<Button>(R.id.btnPg14)

        btn.setOnClickListener {
            startActivity(Intent(this, reg_pg_no_15::class.java))
        }
    }
}