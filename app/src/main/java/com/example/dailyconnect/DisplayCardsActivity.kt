package com.example.dailyconnect

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class DisplayCardsActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_cards)

        val newCardButton = findViewById<Button>(R.id.addNewCardButton)
        newCardButton.setOnClickListener{
            val intent3 = Intent(this@DisplayCardsActivity, PaymentActivity::class.java)
            startActivity(intent3)
        }

        val wellsFargo = findViewById<ImageButton>(R.id.wellsfargo)
        wellsFargo.setOnClickListener{
            val intent4 = Intent(this@DisplayCardsActivity, PaymentActivity::class.java)
            startActivity(intent4)
        }

        val chaseBank = findViewById<ImageButton>(R.id.chase)
        chaseBank.setOnClickListener{
            val intent5 = Intent(this@DisplayCardsActivity, PaymentActivity::class.java)
            startActivity(intent5)
        }

        val amexCard = findViewById<ImageButton>(R.id.amex)
        amexCard.setOnClickListener{
            val intent6 = Intent(this@DisplayCardsActivity, PaymentActivity::class.java)
            startActivity(intent6)
        }
    }
}