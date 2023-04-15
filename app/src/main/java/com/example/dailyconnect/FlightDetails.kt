package com.example.dailyconnect

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FlightDetails : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.flightdetails)

        val f1b = findViewById<Button>(R.id.buttonf1)
        f1b.setOnClickListener {
            val intent1 = Intent(this@FlightDetails, SecureCheckoutActivity::class.java)
            startActivity(intent1)
        }

        val f2b = findViewById<Button>(R.id.buttonf2)
        f2b.setOnClickListener {
            val intent2 = Intent(this@FlightDetails, SecureCheckoutActivity::class.java)
            startActivity(intent2)
        }

        val f3b = findViewById<Button>(R.id.buttonf3)
        f3b.setOnClickListener {
            val intent3 = Intent(this@FlightDetails, SecureCheckoutActivity::class.java)
            startActivity(intent3)
        }

        val f4b = findViewById<Button>(R.id.buttonf4)
        f4b.setOnClickListener {
            val intent4 = Intent(this@FlightDetails, SecureCheckoutActivity::class.java)
            startActivity(intent4)
        }
    }
}