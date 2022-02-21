package com.example.barberking.Marcação.Asgard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.barberking.Marcação.Asgard.B2D.D1B2
import com.example.barberking.Marcação.Asgard.B2D.D2B2
import com.example.barberking.Marcação.Asgard.B2D.D3B2
import com.example.barberking.R


class Barbeiro2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barbeiro2)

        val D1 = findViewById(R.id.D1) as TextView
        D1.setOnClickListener {
            val intent = Intent(this, D1B2::class.java)
            startActivity(intent)
        }
        val D2 = findViewById(R.id.D2) as TextView
        D2.setOnClickListener {
            val intent = Intent(this, D2B2::class.java)
            startActivity(intent)
        }
        val D3 = findViewById(R.id.D2) as TextView
        D3.setOnClickListener {
            val intent = Intent(this, D3B2::class.java)
            startActivity(intent)
        }
    }
}