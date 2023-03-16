package com.example.eletriccarapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var kwh_price: EditText
    lateinit var km_traveled: EditText
    lateinit var calculate: Button
    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpView()
        button()
    }

    fun setUpView() {
        kwh_price = findViewById(R.id.et_kwh_price)
        km_traveled = findViewById(R.id.et_km_traveled)
        calculate = findViewById(R.id.bt_calculate)
        result = findViewById(R.id.tv_result)
    }

    fun button(){
        calculate.setOnClickListener {
            math()
        }
    }

    fun math() {
        val price = kwh_price.text.toString().toFloat()
        val travel = km_traveled.text.toString().toFloat()

        result.text = (price / travel).toString()
        result.visibility = View.VISIBLE
    }
}