package com.example.dailyconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SeatsPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seats_page)

        val proceedButton = findViewById<Button>(R.id.proceed_button)
        proceedButton.setOnClickListener{
            val intent3 = Intent(this@SeatsPageActivity, PaymentActivity::class.java)
            startActivity(intent3)
        }
    }
}