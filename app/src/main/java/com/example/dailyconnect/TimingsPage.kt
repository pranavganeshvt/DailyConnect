package com.example.dailyconnect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TimingsPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.timings)

        var next = findViewById<Button>(R.id.next)
        next.setOnClickListener{
            val intent2 = android.content.Intent(this, SeatsPageActivity::class.java)
            startActivity(intent2)
        }
    }
}
