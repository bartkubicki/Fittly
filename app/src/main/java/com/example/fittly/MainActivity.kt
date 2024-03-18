package com.example.fittly

import android.os.Bundle
import android.widget.Button
import android.app.Activity
import android.content.Intent

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find "LOG IN" button and add an event listener to it
        val loginButton: Button = findViewById(R.id.loginButton)
        loginButton.setOnClickListener {
            // "LOG IN" button click action
        }

        // Find "BMI" button and add an event listener to it
        val bmiButton: Button = findViewById(R.id.bmiButton)
        bmiButton.setOnClickListener {
            // "BMI" button click action
            val intent = Intent(this, BmiCalculatorActivity::class.java)
            startActivity(intent)
        }
    }
}