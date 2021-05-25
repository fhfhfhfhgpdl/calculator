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
        var calculate = 0                                          //result에 들어감
        var total = 0                       //변수명 잘못지었다... 끝내고 알아챔...


        result.text = "$calculate"
        cal.text = "-"



        fun add(a: Int, b: Int): Int {
            calculate = a + b
            return 0
        }

        fun sub(a: Int, b: Int): Int {
            calculate = a - b
            return 0
        }

        fun mul(a: Int, b: Int): Int {
            calculate = a * b
            return 0
        }

        fun div(a: Int, b: Int): Int {
            calculate = a / b
            return 0
        }



        add.setOnClickListener {
            val a: Int = Integer.parseInt(findViewById<EditText>(R.id.number1).text.toString())
            val b: Int = Integer.parseInt(findViewById<EditText>(R.id.number2).text.toString())

            total=add(a, b)
            cal.text = "$a + $b"
            result.text = "$calculate"
        }
        sub.setOnClickListener {
            val a: Int = Integer.parseInt(findViewById<EditText>(R.id.number1).text.toString())
            val b: Int = Integer.parseInt(findViewById<EditText>(R.id.number2).text.toString())

            total= sub(a, b)
            cal.text = "$a - $b"
            result.text = "$calculate"
        }
        mul.setOnClickListener {
            val a: Int = Integer.parseInt(findViewById<EditText>(R.id.number1).text.toString())
            val b: Int = Integer.parseInt(findViewById<EditText>(R.id.number2).text.toString())

            total = mul(a, b)
            cal.text = "$a * $b"
            result.text = "$calculate"
        }


        div.setOnClickListener {
            val a: Int = Integer.parseInt(findViewById<EditText>(R.id.number1).text.toString())
            val b: Int = Integer.parseInt(findViewById<EditText>(R.id.number2).text.toString())

            when (a) {
                0 -> cal.text = "div/0"

                else -> {
                    total = div(a, b)
                    cal.text = "$a / $b"
                    result.text = "$calculate"
                }
            }
        }


    }
}
