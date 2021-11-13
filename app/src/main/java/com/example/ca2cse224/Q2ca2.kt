package com.example.ca2cse224

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.text.NumberFormat
import android.widget.CompoundButton
import java.lang.StringBuilder


class Q2ca2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q2ca2)

        val Cos = findViewById<EditText>(R.id.cost_of_service)
        val option = findViewById<RadioGroup>(R.id.tip_options)
        val option20 = findViewById<RadioButton>(R.id.option_twenty_percent)
        val option18 = findViewById<RadioButton>(R.id.option_eighteen_percent)
        val option15 = findViewById<RadioButton>(R.id.option_fifteen_percent)
        val check1 = findViewById<CheckBox>(R.id.enjoy)
        val check2 = findViewById<CheckBox>(R.id.prefer)
        val check3 = findViewById<CheckBox>(R.id.eat)
        val bill = findViewById<Button>(R.id.PrintBill)
        val exit = findViewById<Button>(R.id.Exit3)
        val result = findViewById<TextView>(R.id.Result)

        var flag : Int = 2
        var flag2 : Int = 2
        var flag3 : Int = 2

        option20.setOnClickListener {
            Toast.makeText(applicationContext,"Selected : Amazing (20%) ",Toast.LENGTH_SHORT).show()
        }
        option18.setOnClickListener {
            Toast.makeText(applicationContext,"Selected : Good (18%) ",Toast.LENGTH_SHORT).show()
        }
        option15.setOnClickListener {
            Toast.makeText(applicationContext,"Selected : Ok (15%)",Toast.LENGTH_SHORT).show()
        }

        check1.setOnClickListener {
            flag += 1
            if (flag % 2 != 0)
            Toast.makeText(applicationContext,"Selected : I really enjoy the Food",Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(applicationContext,"UnSelected : I really enjoy the Food",Toast.LENGTH_SHORT).show()

        }
        check2.setOnClickListener {
            flag2 += 1
            if (flag2 % 2 != 0)
                Toast.makeText(applicationContext,"Selected : I will prefer this food to else also",Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(applicationContext,"UnSelected : I will prefer this food to else also",Toast.LENGTH_SHORT).show()

        }
        check3.setOnClickListener {
            flag3 += 1
            if (flag3 % 2 != 0)
                Toast.makeText(applicationContext,"Selected : I would like to eat more from you",Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(applicationContext,"UnSelected : I would like to eat more from you",Toast.LENGTH_SHORT).show()

        }


        bill.setOnClickListener {

                var result2 = StringBuilder()
                val stringInTextField = Cos.text.toString()
                val cost = stringInTextField.toDoubleOrNull()
                if (cost == null) {
                    Toast.makeText(applicationContext,"Please Write the Amount",Toast.LENGTH_SHORT).show()
                }
                val tipPercentage = when (option.checkedRadioButtonId) {
                    R.id.option_twenty_percent -> 0.20
                    R.id.option_eighteen_percent -> 0.18
                    else -> 0.15
                }
                var tip = tipPercentage * cost!!

                val sel = findViewById<RadioButton>(option.checkedRadioButtonId)
            val Out : String = sel.text.toString()

            result2.append("Cost of Service : $cost\n")
            result2.append("Selected service : $Out\n")
            result2.append("Tip Amount : $tip\n")
            result2.append("Selected Suggestions : \n")
            if (check1.isChecked){
                result2.append(check1.text.toString()+"\n")
            }
            if (check2.isChecked){
                result2.append(check2.text.toString()+"\n")
            }
            if (check3.isChecked){
                result2.append(check3.text.toString()+"\n")
            }

            result2.append("Thanks You!")
            result.text = result2

        }


        exit.setOnClickListener {
            System.exit(0)
        }



    }

}


