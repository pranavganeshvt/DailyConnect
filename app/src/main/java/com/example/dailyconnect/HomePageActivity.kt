package com.example.dailyconnect

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val movieImage = findViewById<ImageView>(R.id.movies)

        movieImage.setOnClickListener {
            val intent = Intent (this@HomePageActivity, TimingsPage::class.java)
            startActivity(intent)
        }

    }

}