package com.example.barberking.Marcação.Asgard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.barberking.Marcação.Asgard.B1D.D1B1
import com.example.barberking.Marcação.Asgard.B1D.D2B1
import com.example.barberking.Marcação.Asgard.B1D.D3B1
import com.example.barberking.R


class Barbeiro1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barbeiro1)


        val D1 = findViewById(R.id.D1) as TextView
        D1.setOnClickListener {
            val intent = Intent(this, D1B1::class.java)
            startActivity(intent)
        }
        val D2 = findViewById(R.id.D2) as TextView
        D2.setOnClickListener {
            val intent = Intent(this, D2B1::class.java)
            startActivity(intent)
        }
        val D3 = findViewById(R.id.D3) as TextView
        D3.setOnClickListener {
            val intent = Intent(this, D3B1::class.java)
            startActivity(intent)
        }

    }
}