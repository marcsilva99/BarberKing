package com.example.barberking.Marcação.BarberHouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.barberking.Marcação.Asgard.Barbeiro1Activity
import com.example.barberking.R

class BarberHouseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barber_house)


        val barbeiro3 = findViewById(R.id.barberbarb1) as TextView
        barbeiro3.setOnClickListener {
            val intent = Intent(this, Barbeiro3Activity::class.java)
            startActivity(intent)
        }

        val barbeiro4 = findViewById(R.id.barberbarb2) as TextView
        barbeiro4.setOnClickListener {
            val intent = Intent(this, Barbeiro4Activity::class.java)
            startActivity(intent)
        }

    }
}