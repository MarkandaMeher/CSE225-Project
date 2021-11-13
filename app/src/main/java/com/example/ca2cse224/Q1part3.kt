package com.example.ca2cse224

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Q1part3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q1part3)

        val exit2 = findViewById<Button>(R.id.exit2)

        exit2.setOnClickListener {
            System.exit(0)
        }
    }
}