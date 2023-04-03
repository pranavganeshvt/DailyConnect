package com.example.dailyconnect

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class SecureCheckoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secure_checkout)

        val checkout = findViewById<Button>(R.id.checkout)
        checkout.setOnClickListener {
            val intent1 = Intent(this@SecureCheckoutActivity, LoginPage::class.java)
            startActivity(intent1)
        }
    }
}
