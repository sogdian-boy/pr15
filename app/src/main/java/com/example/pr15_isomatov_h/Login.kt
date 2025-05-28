package com.example.pr15_isomatov_h

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun goMain(view: View) {
        val User = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val Pass = findViewById<EditText>(R.id.editTextTextPassword)

        when {
            User.text.isEmpty()->{
                val alert = AlertDialog.Builder(this)
                    .setTitle("Ошибка")
                    .setMessage("Заполните поле: Email")
                    .setPositiveButton("Ok",null)
                    .create()
                    .show()
                User.requestFocus()
            }

            Pass.text.isEmpty()->{
                val alert = AlertDialog.Builder(this)
                    .setTitle("Ошибка")
                    .setMessage("Заполните поле: Пароль")
                    .setPositiveButton("Ok",null)
                    .create()
                    .show()
                Pass.requestFocus()
            }
            else->{
                var intend = Intent(this@Login,Main::class.java)
                startActivity(intend)
                finish()
            }
    }
    }
}