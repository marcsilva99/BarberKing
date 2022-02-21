package com.example.barberking.Marcação.BarberHouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.example.barberking.Marcação.BarberHouse.B3D.D1B3
import com.example.barberking.Marcação.BarberHouse.B3D.D2B3
import com.example.barberking.Marcação.BarberHouse.B3D.D3B3
import com.example.barberking.R
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore


class Barbeiro3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barbeiro4)

        val D1 = findViewById(R.id.D1) as TextView
        D1.setOnClickListener {
            val intent = Intent(this, D1B3::class.java)
            startActivity(intent)
        }
        val D2 = findViewById(R.id.D2) as TextView
        D2.setOnClickListener {
            val intent = Intent(this, D2B3::class.java)
            startActivity(intent)
        }
        val D3 = findViewById(R.id.D3) as TextView
        D3.setOnClickListener {
            val intent = Intent(this, D3B3::class.java)
            startActivity(intent)
        }


    }
}