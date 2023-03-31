package com.example.dailyconnect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TimingsPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.timings)

        val next1 = findViewById<Button>(R.id.next)
        next1.setOnClickListener{
            val intent4 = android.content.Intent(this@TimingsPage, LoginPage::class.java)
            startActivity(intent4)
        }
    }
}
