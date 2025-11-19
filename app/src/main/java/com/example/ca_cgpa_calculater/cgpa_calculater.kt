package com.example.ca_cgpa_calculater

import ads_mobile_sdk.s1
import android.icu.text.DisplayContext
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class cgpa_calculater : ComponentActivity() {
    lateinit var s1: EditText
    lateinit var s2: EditText
    lateinit var s3: EditText
    lateinit var b: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cgpa_calculater)

        s1 = findViewById(R.id.et1)
        s2 = findViewById(R.id.et2)
        s3 = findViewById(R.id.et3)
        b = findViewById(R.id.b1)

        b.setOnClickListener {

            if (s1.text.isEmpty() || s2.text.isEmpty() || s3.text.isEmpty()) {
                Toast.makeText(this, "Please enter all values", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val c1 = s1.text.toString().toFloat()
            val c2 = s2.text.toString().toFloat()
            val c3 = s3.text.toString().toFloat()

            val cal = (c1 + c2 + c3)/3

            Toast.makeText(this, cal.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}






