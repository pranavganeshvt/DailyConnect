package com.example.dailyconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SeatsPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seats_page)

        var proceedButton = findViewById<Button>(R.id.proceed_button)
        proceedButton.setOnClickListener{
            val intent = Intent(this@SeatsPageActivity, LoginPage::class.java)
            startActivity(intent)
        }
    }
}