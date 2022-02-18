package com.example.barberking.Marcação.Asgard

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.barberking.R
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_barbeiro1.*
import kotlinx.android.synthetic.main.activity_d1_b1.*
import kotlinx.android.synthetic.main.activity_jogo.*


class Barbeiro1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barbeiro1)


        val D1 = findViewById(R.id.D1) as TextView
        D1.setOnClickListener {
            val intent = Intent(this, D1B1::class.java)
            startActivity(intent)
        }

    }
}