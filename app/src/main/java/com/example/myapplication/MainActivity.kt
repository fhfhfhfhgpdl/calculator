package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val cal = findViewById<TextView>(R.id.littletext)
        val result = findViewById<TextView>(R.id.resulttext)
        val add = findViewById<Button>(R.id.addbutton)
        val sub = findViewById<Button>(R.id.subbutton)
        val mul = findViewById<Button>(R.id.mulbutton)
        val div = findViewById<Button>(R.id.divbutton)



        result.text = "0"
        cal.text = "-"



        fun add(a: Int, b: Int): Int {
            return a + b
        }

        fun sub(a: Int, b: Int): Int {
            return a - b
        }

        fun mul(a: Int, b: Int): Int {
            return a * b
        }

        fun div(a: Int, b: Int): Int {
            return a / b
        }



        add.setOnClickListener {
            val a: Int = findViewById<EditText>(R.id.number1).text.toString().toInt()
            val b: Int = findViewById<EditText>(R.id.number2).text.toString().toInt()

            cal.text = "$a + $b"
            result.text = "${add(a, b)}"
        }
        sub.setOnClickListener {
            val a: Int = findViewById<EditText>(R.id.number1).text.toString().toInt()
            val b: Int = findViewById<EditText>(R.id.number2).text.toString().toInt()

            cal.text = "$a - $b"
            result.text = "${sub(a, b)}"
        }
        mul.setOnClickListener {
            val a: Int = findViewById<EditText>(R.id.number1).text.toString().toInt()
            val b: Int = findViewById<EditText>(R.id.number2).text.toString().toInt()

            cal.text = "$a * $b"
            result.text = "${mul(a, b)}"
        }


        div.setOnClickListener {
            val a: Int = findViewById<EditText>(R.id.number1).text.toString().toInt()
            val b: Int = findViewById<EditText>(R.id.number2).text.toString().toInt()

            when (b) {
                0 -> cal.text = "div/0"

                else -> {
                    cal.text = "$a / $b"
                    result.text = "${div(a, b)}"
                }
            }
        }


    }
}
