package com.example.barberking.InfoBarbearias.LeleBarber

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.barberking.R

class barb1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barb1)

        val barb1info = findViewById(R.id.barb1info) as ImageView
        barb1info.setOnClickListener {
            val intent = Intent(this, barb1infoActivity::class.java)
            startActivity(intent)
        }

        val barb1barbeiro = findViewById(R.id.barb1barbeiro) as ImageView
        barb1barbeiro.setOnClickListener {
            val intent = Intent(this, barb1barbeirosActivity::class.java)
            startActivity(intent)
        }




        }
    }

