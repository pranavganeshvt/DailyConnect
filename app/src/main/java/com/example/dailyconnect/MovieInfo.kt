package com.example.dailyconnect

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MovieInfo : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.movie_info)

        val next1 = findViewById<Button>(R.id.done)
        next1.setOnClickListener{
            val intent4 = android.content.Intent(this@MovieInfo, HomePageActivity::class.java)
            startActivity(intent4)
        }
    }
}
