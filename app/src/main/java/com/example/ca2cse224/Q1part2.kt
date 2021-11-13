package com.example.ca2cse224

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.system.exitProcess

class Q1part2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q1part2)

        val ResultName = findViewById<TextView>(R.id.ResultName)
        val CheckboxResult = findViewById<TextView>(R.id.ResultCheckbox)
        val exit = findViewById<Button>(R.id.exit)


        val i = intent
        val b = i.getBundleExtra("info")
        val x = b?.getString("Name")
        val y = b?.getString("CheckBox")


        ResultName.text = x
        CheckboxResult.text = y

        exit.setOnClickListener {
            System.exit(0)
        }

    }
}