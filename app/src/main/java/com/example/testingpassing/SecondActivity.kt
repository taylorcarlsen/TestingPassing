package com.example.testingpassing

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var secondText: TextView
    lateinit var secondButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        secondText = findViewById(R.id.secondText)
        secondButton = findViewById(R.id.secondButton)

        secondText.text = intent.getCharSequenceExtra("MainText")
    }
}