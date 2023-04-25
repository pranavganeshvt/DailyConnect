package com.example.dailyconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dailyconnect.databinding.ActivityCartBinding


class CartActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.confirm.setOnClickListener {
            val intent = Intent(this@CartActivity, GroceriesConfirmation::class.java)
            startActivity(intent)
        }

        binding.change.setOnClickListener {
            val intent = Intent(this@CartActivity, Address::class.java)
            startActivity(intent)
        }

    }
}