package com.example.dailyconnect

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Movie
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.MovementMethod
import android.widget.Button
import android.widget.ImageButton

class DisplayCardsActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_cards)

        val newCardButton = findViewById<Button>(R.id.addNewCardButton)
        newCardButton.setOnClickListener{
            val intent3 = Intent(this@DisplayCardsActivity2, PaymentActivity::class.java)
            startActivity(intent3)
        }

        val wellsFargo = findViewById<ImageButton>(R.id.wellsfargo)
        wellsFargo.setOnClickListener{
            val intent4 = Intent(this@DisplayCardsActivity2, FlightConfirmActivity::class.java)
            startActivity(intent4)
        }

        val chaseBank = findViewById<ImageButton>(R.id.chase)
        chaseBank.setOnClickListener{
            val intent5 = Intent(this@DisplayCardsActivity2, FlightConfirmActivity::class.java)
            startActivity(intent5)
        }

        val amexCard = findViewById<ImageButton>(R.id.amex)
        amexCard.setOnClickListener{
            val intent6 = Intent(this@DisplayCardsActivity2, FlightConfirmActivity::class.java)
            startActivity(intent6)
        }
    }
}