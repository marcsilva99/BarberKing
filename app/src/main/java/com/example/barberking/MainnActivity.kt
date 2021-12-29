package com.example.barberking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainnActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainn);

        val login = findViewById(R.id.loginimg) as ImageView
        login.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        val barbearias = findViewById(R.id.barbeariasimg) as ImageView
        barbearias.setOnClickListener {
            val intent = Intent(this, BarbeariasActivity::class.java)
            startActivity(intent)
        }




    }
}