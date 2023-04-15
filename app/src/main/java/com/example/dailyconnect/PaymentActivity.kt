package com.example.dailyconnect

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        val checkout = findViewById<Button>(R.id.button_purchase)
        checkout.setOnClickListener {
            val intent = Intent(this@PaymentActivity, MovieInfo::class.java)
            startActivity(intent)
        }
    }


}