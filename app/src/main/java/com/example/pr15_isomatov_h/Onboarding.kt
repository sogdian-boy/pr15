package com.example.pr15_isomatov_h

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Onboarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)
    }

    fun login_button(view: View) {

        val intent = Intent(this@Onboarding,Login::class.java)
        startActivity(intent)
        finish()
    }
}