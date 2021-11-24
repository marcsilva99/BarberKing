package com.example.barberking


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginn)

        val register = findViewById(R.id.tvRegister) as TextView
        register.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        val login = findViewById(R.id.btLogin) as TextView
        login.setOnClickListener {
            val intent = Intent(this, MainnActivity::class.java)
            startActivity(intent)
        }

    }
}