package com.example.dailyconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GroceriesConfirmation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_groceries_confirmation)

        val next1 = findViewById<Button>(R.id.done)
        next1.setOnClickListener{
            val intent4 = android.content.Intent(this@GroceriesConfirmation, HomePageActivity::class.java)
            startActivity(intent4)
        }
    }
}