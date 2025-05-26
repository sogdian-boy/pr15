package com.example.pr15_isomatov_h

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun goMain(view: View) {
        val intent = Intent(this@Login,Main::class.java)
        startActivity(intent)
        finish()
    }
}