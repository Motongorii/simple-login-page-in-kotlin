package com.example.example_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var email_edit:EditText
    lateinit var pass_edit:EditText
    lateinit var btn_log:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email_edit = findViewById(R.id.edtemail)
        pass_edit = findViewById(R.id.edtpassword)
        btn_log = findViewById(R.id.btnlogin)

        btn_log.setOnClickListener {
            var email =  email_edit.text.toString().trim()
            var password = pass_edit.text.toString().trim()


            //validate
            if (email.isEmpty() || password.isEmpty() ) {

                Toast.makeText(this, "Cannot Submit an empty form", Toast.LENGTH_SHORT).show()

            } else {

                if (email == "tonn@gmail.com" && password == "moto@254") {
                    // navigate to another
                    var intent  = Intent(this, Dashboard::class.java)
                    startActivity(intent)

                    Toast.makeText(this, "LOGIN SUCCESS", Toast.LENGTH_SHORT).show()
                }  else {

                    Toast.makeText(this, "Wrong Username or Password. Try Again", Toast.LENGTH_SHORT).show()



                }



            }

        }
    }
}