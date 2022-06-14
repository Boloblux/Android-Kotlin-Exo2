package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calc(view: View) {
        var number1: Int = if (number1Input.text.toString().isEmpty()) 0 else number1Input.text.toString().toInt()
        var number2: Int = if (number2Input.text.toString().isEmpty()) 0 else number2Input.text.toString().toInt()
        var result: Int? = null

        if (number1 == 0 && number2 == 0) {
            Toast.makeText(applicationContext,"Veuillez rentrer des valeurs",Toast.LENGTH_LONG).show()
        }
        else {
            if(view.id == R.id.plus) {
                result = number1 + number2
            }
            if(view.id == R.id.minus) {
                result = number1 - number2
            }
            if(view.id == R.id.divide) {
                if (number2 == 0) {
                    Toast.makeText(applicationContext,"On ne peut pas diviser par rien",Toast.LENGTH_LONG).show()
                    result = 0
                }
                else {
                    result = number1 / number2
                }
            }
            if(view.id == R.id.multiply) {
                result = number1 * number2
            }
            resultView.setText(result.toString())
        }


    }
}
