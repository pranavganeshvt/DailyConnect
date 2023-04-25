package com.example.dailyconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.NavHost
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.example.dailyconnect.databinding.ActivityGroceriesBinding

class GroceriesActivity : AppCompatActivity() {

    private lateinit var binding : ActivityGroceriesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGroceriesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val fragment = Fruits()
        fragmentTransaction.add(R.id.fragment_container, fragment)


        binding.fruits.setOnClickListener {
            val fragment = Fruits()
            val newTransaction = fragmentManager.beginTransaction()
            newTransaction.replace(R.id.fragment_container, fragment)
            newTransaction.addToBackStack(null)
            newTransaction.commit()
        }
        binding.vegetables.setOnClickListener {
            val fragment = Vegetables()
            val newTransaction = fragmentManager.beginTransaction()
            newTransaction.replace(R.id.fragment_container, fragment)
            newTransaction.addToBackStack(null)
            newTransaction.commit()
        }

        fragmentTransaction.commit()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.groceries, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.cart_menu -> {
                val intent = Intent(this@GroceriesActivity, CartActivity::class.java)
                startActivity(intent)
                true
            }
            else -> {false}
        }
    }
}