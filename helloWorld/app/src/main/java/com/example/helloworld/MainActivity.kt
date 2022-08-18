package com.example.helloworld

import android.graphics.Color.red
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.example.helloworld.R.color.white

// This Kotlin file is where we're going to be handling user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Show this layout file: activity_main.xml
        setContentView(R.layout.activity_main)

        // Display customized text to show 'Hello from {name}'

        // User can tap a button to change the text color of the label
        // 1. Add a button to our layout
        // Get a reference to our button
        findViewById<Button>(R.id.button).setOnClickListener {
            // Handles button tap
            Log.i("Kevin", "Tapped on Button")
            // Get a reference to the text view
            // Set the color of the text view
            findViewById<TextView>(R.id.textView2).setTextColor(resources.getColor(R.color.white))
        }

    }
}