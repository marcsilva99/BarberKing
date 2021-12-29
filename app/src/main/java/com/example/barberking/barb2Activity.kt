package com.example.barberking

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class barb2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barb2)

        val barb2info = findViewById(R.id.barb2info) as ImageView
        barb2info.setOnClickListener {
            val intent = Intent(this, barb2infoActivity::class.java)
            startActivity(intent)
        }

        val barb2barbeiro = findViewById(R.id.barb2barbeiro) as ImageView
        barb2barbeiro.setOnClickListener {
            val intent = Intent(this, barb2barbeirosActivity::class.java)
            startActivity(intent)
        }
    }
}