package com.example.barberking

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class barb4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barb4)

        val barb4info = findViewById(R.id.barb4info) as ImageView
        barb4info.setOnClickListener {
            val intent = Intent(this, barb4infoActivity::class.java)
            startActivity(intent)
        }

        val barb4barbeiro = findViewById(R.id.barb4barbeiro) as ImageView
        barb4barbeiro.setOnClickListener {
            val intent = Intent(this, barb4barbeirosActivity::class.java)
            startActivity(intent)
        }
    }
}