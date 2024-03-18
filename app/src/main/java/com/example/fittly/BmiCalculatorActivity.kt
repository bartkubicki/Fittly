package com.example.fittly

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class BmiCalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_calculator)

        val editTextHeight = findViewById<EditText>(R.id.bmiHeight)
        val editTextWeight = findViewById<EditText>(R.id.bmiWeight)

        val calculateButton: Button = findViewById(R.id.calculateButton)
        calculateButton.setOnClickListener {
            val height = editTextHeight.text.toString()
            val weight = editTextWeight.text.toString()

            val announcement = "Wzrost: $height\nWaga: $weight"
        }
    }
}
