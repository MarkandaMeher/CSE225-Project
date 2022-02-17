package com.example.ca2cse224

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import kotlin.random.Random

class EndResult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end_result)


        val btnn = findViewById<Button>(R.id.exit4)
        val r1 = findViewById<TextView>(R.id.Result)
        val r2 = findViewById<TextView>(R.id.Result2)
        val r3 = findViewById<TextView>(R.id.Result3)
        val r4 = findViewById<TextView>(R.id.Result4)

        val bundle:Bundle? = intent.extras
        val id = bundle?.get("id_value")


        r1.text=id.toString()
        r2.text=id.toString()
        r3.text=id.toString()
        r4.text=id.toString()

        btnn.setOnClickListener {
            val vg: ViewGroup? = findViewById(R.id.custom_toast)
            val inflater = layoutInflater

            val layout: View = inflater.inflate(R.layout.custom_toast,vg)

            val tv = layout.findViewById<TextView>(R.id.txtVw)
            tv.text = "Visit Again"

            val toast = Toast(applicationContext)

            toast.setGravity(Gravity.CENTER_VERTICAL, 0 , 100)
            toast.duration = Toast.LENGTH_LONG
            toast.setView(layout)
            toast.show()

        }

}

}