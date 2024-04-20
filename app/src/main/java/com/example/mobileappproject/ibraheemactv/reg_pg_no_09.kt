package com.example.mobileappproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class reg_pg_no_09 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg_pg_no09)
         val btn = findViewById<Button>(R.id.btnRegPg9)

        btn.setOnClickListener {
            startActivity(Intent(this, reg_pg_no_10::class.java))
        }
    }
}