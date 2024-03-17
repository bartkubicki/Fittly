package com.example.fittly

import android.os.Bundle
import android.widget.Button
import android.app.Activity

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Znajdź przycisk "LOG IN" i dodaj do niego nasłuchiwacz zdarzeń
        val loginButton: Button = findViewById(R.id.loginButton)
        loginButton.setOnClickListener {
            // Obsługa kliknięcia przycisku "LOG IN"
        }

        // Znajdź przycisk "BMI" i dodaj do niego nasłuchiwacz zdarzeń
        val bmiButton: Button = findViewById(R.id.bmiButton)
        bmiButton.setOnClickListener {
            // Obsługa kliknięcia przycisku "BMI"
        }
    }
}