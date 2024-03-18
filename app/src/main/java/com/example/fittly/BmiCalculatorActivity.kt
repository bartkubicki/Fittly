package com.example.fittly

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class BmiCalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_calculator)

        val bmiHeightEditText: EditText = findViewById(R.id.bmiHeight)
        val bmiWeightEditText: EditText = findViewById(R.id.bmiWeight)
        val calculateButton: Button = findViewById(R.id.calculateButton)

        calculateButton.setOnClickListener {
            val heightString = bmiHeightEditText.text.toString()
            val weightString = bmiWeightEditText.text.toString()

            if (heightString.isNotEmpty() && weightString.isNotEmpty()) {
                val height = heightString.toFloat() / 100 // assuming height is entered in cm, convert it to meters
                val weight = weightString.toFloat()

                val bmi = calculateBMI(weight, height)
                val bmiMessage = interpretBMI(bmi)

                // Display the BMI value and interpretation using Toast
                Toast.makeText(
                    this,
                    "Your BMI is $bmi. $bmiMessage",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                // Show a message if height or weight is not entered
                Toast.makeText(
                    this,
                    "Please enter both height and weight.",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    private fun calculateBMI(weight: Float, height: Float): Float {
        // BMI formula: weight(kg) / height(m)^2
        return weight / (height * height)
    }

    private fun interpretBMI(bmi: Float): String {
        return when {
            bmi < 18.5 -> "You are underweight."
            bmi < 25 -> "You are within the normal weight range."
            bmi < 30 -> "You are overweight."
            else -> "You are obese."
        }
    }
}
