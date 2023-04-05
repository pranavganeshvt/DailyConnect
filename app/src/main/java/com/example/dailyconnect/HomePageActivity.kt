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
            val intent = Intent (this@HomePageActivity, TheatresListActivity::class.java)
            startActivity(intent)
        }

        val groceries = findViewById<ImageView>(R.id.groceries)
        groceries.setOnClickListener {
            val intent = Intent (this@HomePageActivity, GroceriesActivity::class.java)
            startActivity(intent)
        }

    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.settings, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.option_1 -> {
                // Handle option 1 selection
                return true
            }
            R.id.option_2 -> {
                // Handle option 2 selection
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

}