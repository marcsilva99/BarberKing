package com.example.barberking

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class barb3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barb3)

        val barb3info = findViewById(R.id.barb3info) as ImageView
        barb3info.setOnClickListener {
            val intent = Intent(this, barb3infoActivity::class.java)
            startActivity(intent)
        }

        val barb3barbeiro = findViewById(R.id.barb3barbeiro) as ImageView
        barb3barbeiro.setOnClickListener {
            val intent = Intent(this, barb3barbeirosActivity::class.java)
            startActivity(intent)
        }
    }
}