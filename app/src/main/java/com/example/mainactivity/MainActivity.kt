package com.example.mainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton = findViewById<Button>(R.id.button)
        val myText = findViewById<TextView>(R.id.textId)


        myButton.setOnClickListener{
            if(myButton.text == "SHOW") {
                myText.visibility = View.VISIBLE
                myButton.text = "HIDE"
            } else {
                myText.visibility = View.INVISIBLE
                myButton.text = "SHOW"
            }
        }

    }
}