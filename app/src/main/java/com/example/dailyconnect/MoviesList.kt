package com.example.dailyconnect

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MoviesList : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.movieslist)

        val avatar = findViewById<Button>(R.id.avatar)
        avatar.setOnClickListener {
            val intent1 =
                android.content.Intent(this@MoviesList, TimingsPage::class.java)
            startActivity(intent1)
        }
        val rrr = findViewById<Button>(R.id.rrr)
        rrr.setOnClickListener {
            val intent2 =
                android.content.Intent(this@MoviesList, TimingsPage::class.java)
            startActivity(intent2)
        }
        val lionKing = findViewById<Button>(R.id.lionking)
        lionKing.setOnClickListener {
            val intent3 = android.content.Intent(
                this@MoviesList,
                TimingsPage::class.java
            )
            startActivity(intent3)
        }
        val tp = findViewById<Button>(R.id.topGun)
        tp.setOnClickListener {
            val intent4 = android.content.Intent(
                this@MoviesList,
                TimingsPage::class.java
            )
            startActivity(intent4)
        }
    }
}
