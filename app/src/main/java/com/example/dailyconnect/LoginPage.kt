package com.example.dailyconnect

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class LoginPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val login = findViewById<Button>(R.id.login);
        login.setOnClickListener{
            val intent1 = android.content.Intent (this, TimingsPage::class.java)
            startActivity(intent1)
        }
    }
}

