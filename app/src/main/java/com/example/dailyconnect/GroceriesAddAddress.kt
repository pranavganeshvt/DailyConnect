package com.example.dailyconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GroceriesAddAddress : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_groceries_add_address)

        val button = findViewById<Button>(R.id.add)
        button.setOnClickListener {
            val intent = Intent(this@GroceriesAddAddress, Address::class.java)
            startActivity(intent)
        }

    }
}