package com.example.logicraft.Common

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.example.logicraft.R

class BooleanExpressionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boolean_expression)

        val backButton: ImageView = findViewById(R.id.backButton)

        // Set an OnClickListener for the back button
        backButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                // Perform the back button's action here
                onBackPressed() // This is the standard way to navigate back
            }
        })
    }
}