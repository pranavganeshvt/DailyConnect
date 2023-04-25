package com.example.dailyconnect

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView

class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.settings, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return true
    }

}