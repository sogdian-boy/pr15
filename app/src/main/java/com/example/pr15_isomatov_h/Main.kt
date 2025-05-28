package com.example.pr15_isomatov_h

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun GoBack(view: View) {
        val intent = Intent(this@Main,SplashScreen::class.java)
        startActivity(intent)
        finish()
    }

    fun exitAccount(view: View){
        fun GoBack(view: View) {
            val intent = Intent(this@Main,Login::class.java)
            startActivity(intent)
            finish()
        }
    }
}