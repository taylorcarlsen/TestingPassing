package com.example.testingpassing

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    lateinit var mainText: TextView
    lateinit var mainButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainText = findViewById(R.id.mainText)
        mainButton = findViewById(R.id.mainButton)

        mainButton.setOnClickListener{
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            var text = mainText.text
            intent.putExtra("MainText",text)
            startActivity(intent)
        }
    }
}
