package com.example.logicraft.Common

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import com.example.logicraft.R

class SplashScreen : AppCompatActivity() {
    private val SPLASH_DISPLAY_LENGTH = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.splash_screen)

        Handler().postDelayed(
            {
                val intent = Intent(this, Main::class.java)
                startActivity(intent)
                finish()
            }, SPLASH_DISPLAY_LENGTH.toLong()
        )
    }
}