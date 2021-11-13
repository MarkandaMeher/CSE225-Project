package com.example.ca2cse224

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.*

class Q1ca2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q1ca2)


        val imageView = findViewById<ImageView>(R.id.imageView)
        val Rl1 = findViewById<RelativeLayout>(R.id.Rl1)
        val Rl2 = findViewById<RelativeLayout>(R.id.Rl2)

        val Login = findViewById<Button>(R.id.Login)
        val Signup = findViewById<Button>(R.id.Signup)

        val twitter = findViewById<ImageButton>(R.id.twitter)
        val fb = findViewById<ImageButton>(R.id.fb)
        val google = findViewById<ImageButton>(R.id.google)

        val UserName = findViewById<EditText>(R.id.UserName)
        val Password = findViewById<EditText>(R.id.Password)

        val RememberMe = findViewById<CheckBox>(R.id.RememberMe)

        val Done = findViewById<Button>(R.id.Done)

        val ForgetPass = findViewById<TextView>(R.id.ForgetPassword)

        Login.setOnClickListener {
            Login.setBackgroundColor(Color.parseColor("#0000FF"))
            Signup.setBackgroundColor(Color.parseColor("#FFFFFF"))
            Done.setText("Done")



        }
        Signup.setOnClickListener {
            Login.setBackgroundColor(Color.parseColor("#FFFFFF"))
            Signup.setBackgroundColor(Color.parseColor("#0000FF"))
            Done.setText("Submit")

        }


        twitter.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/?lang=en"))
            startActivity(intent)
        }
        fb.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/login/"))
            startActivity(intent)
        }
        google.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/account/about/"))
            startActivity(intent)
        }



        Done.setOnClickListener {

            if (UserName.text.toString().isEmpty() || Password.text.toString().isEmpty()) {
                    Toast.makeText(applicationContext,"Fill All the Details!",Toast.LENGTH_SHORT).show()

            } else {

                    var i = Intent(this,Q1part2::class.java)

                var x = UserName.getText()
                val y : String
                if (RememberMe.isChecked){
                    y = "Your ID & Password is Saved"
                }
                else{
                    y = "Your ID & Password is not Saved"
                }

                var b  = Bundle()
                b.putString("Name","${x}")
                b.putString("CheckBox","${y}")
                i.putExtra("info", b)
                startActivity(i)

            }


        }


            ForgetPass.setOnClickListener {
                var j = Intent(this,Q1part3::class.java)
                startActivity(j)
            }


    }


}