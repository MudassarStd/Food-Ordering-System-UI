package com.example.mobileappproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class reg_pg_no_10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg_pg_no10)
        val btn = findViewById<Button>(R.id.btnSignInPg10)

        btn.setOnClickListener {
            startActivity(Intent(this, reg_pg_no_11::class.java))
        }
    }
}