package com.example.fittly

import android.content.Intent
import android.os.Bundle
import android.widget.Button

import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
class BmiCalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_calculator)

        val editTextHeight = findViewById<EditText>(R.id.bmiHeight)
        val editTextWeight = findViewById<EditText>(R.id.bmiWeight)

        val calculateButton: Button = findViewById(R.id.calculateButton)
        calculateButton.setOnClickListener {
            val heightStr = editTextHeight.text.toString()
            val weightStr = editTextWeight.text.toString()

            if(heightStr.isEmpty() || weightStr.isEmpty()){
                Toast.makeText(applicationContext, "Please fill both fields", Toast.LENGTH_LONG).show()
            } else {
                val height = heightStr.toDouble() / 100
                val weight = weightStr.toDouble()

                if (height > 0){
                    val bmi = weight / (height * height)

                    Toast.makeText(applicationContext, "Your BMI: ${String.format("%.2f", bmi)}", Toast.LENGTH_LONG).show()
                } else {

                    Toast.makeText(applicationContext, "Please enter the correct height!", Toast.LENGTH_LONG).show()
                }
            }
        }

        // Find "HOME" button and add an event listener to it
        val homeButton: Button = findViewById(R.id.homeButton)
        homeButton.setOnClickListener {
            // "BMI" button click action
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
