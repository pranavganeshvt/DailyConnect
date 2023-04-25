package com.example.dailyconnect

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class FlightConfirmActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.flight_confirm)

        val login = findViewById<Button>(R.id.done)
        login.setOnClickListener{
            val intent1 = android.content.Intent (this@FlightConfirmActivity, HomePageActivity::class.java)
            startActivity(intent1)

        }
    }
}

