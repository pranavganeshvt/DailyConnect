package com.example.dailyconnect

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.braintreepayments.cardform.view.CardForm

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
    }

}