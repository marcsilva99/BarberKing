package com.example.barberking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LeleBarberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lele_barber)

        val barbeiro7 = findViewById(R.id.lelebarb1) as TextView
        barbeiro7.setOnClickListener {
            val intent = Intent(this, Barbeiro7Activity::class.java)
            startActivity(intent)
        }

        val barbeiro8 = findViewById(R.id.lelebarb2) as TextView
        barbeiro8.setOnClickListener {
            val intent = Intent(this, Barbeiro8Activity::class.java)
            startActivity(intent)
        }


    }
}