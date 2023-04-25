package com.example.dailyconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Address : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_address)

        val button = findViewById<Button>(R.id.add_new)
        button.setOnClickListener {
            val intent = Intent(this@Address, GroceriesAddAddress::class.java)
            startActivity(intent)
        }
        val button2 = findViewById<Button>(R.id.checkout_groceries)
        button2.setOnClickListener {
            val intent = Intent(this@Address, GroceriesConfirmation::class.java)
            startActivity(intent)
        }
    }
}