package com.example.dailyconnect

import android.content.DialogInterface
import android.content.Intent
import android.net.*
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.*
import android.net.*


lateinit var sendMsgBtn: Button
class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        // adding on click listener for send message button.
        sendMsgBtn = findViewById(R.id.refer)

        sendMsgBtn.setOnClickListener {
            try {
                val i = Intent(Intent.ACTION_SEND)
                i.type = "text/plain"
                i.putExtra(Intent.EXTRA_SUBJECT, "DailyConnect")
                var strShareMessage = "\nLet me recommend you this application to make your life very easy, you get a 20$ bonus for using this link\n\n"
                strShareMessage =
                    strShareMessage + "https://play.google.com/store/apps/details?id=" + packageName
                i.putExtra(Intent.EXTRA_TEXT, strShareMessage)
                startActivity(Intent.createChooser(i, "Share via"))
            } catch (e: Exception) {
                //e.toString();
            }
        }

        val button = findViewById<Button>(R.id.deals)

        button.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            //set title for alert dialog
            builder.setTitle(R.string.dialogTitle)
            //set message for alert dialog
            builder.setMessage(R.string.dialogMessage)
            builder.setIcon(android.R.drawable.ic_dialog_alert)

            //performing positive action
            builder.setPositiveButton("Ok") { dialogInterface, which ->
                Toast.makeText(applicationContext, "clicked ok", Toast.LENGTH_LONG).show()
            }

            val alertDialog: AlertDialog = builder.create()

            alertDialog.setCancelable(false)
            alertDialog.show()
        }
            val movieImage = findViewById<ImageView>(R.id.movie)
        movieImage.setOnClickListener {
            val intent1 = Intent (this@HomePageActivity, TheatresListActivity::class.java)
            startActivity(intent1)
        }

        val groceries = findViewById<ImageView>(R.id.groceries)
        groceries.setOnClickListener {
            val intent2 = Intent (this@HomePageActivity, GroceriesActivity::class.java)
            startActivity(intent2)
        }

        val flighttickets = findViewById<ImageView>(R.id.flights)
        flighttickets.setOnClickListener{
            val intent3 = Intent( this@HomePageActivity, FlightDetails::class.java)
            startActivity(intent3)
        }

    }

}