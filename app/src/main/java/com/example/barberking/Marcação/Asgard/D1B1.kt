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
import com.google.firebase.firestore.auth.User
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_d1_b1.*

class D1B1 : AppCompatActivity() {
    private val dbFirestore: DocumentReference = FirebaseFirestore.getInstance().collection("Agendamento")
        .document("Asgard").collection("Barbeiro1").document("Fevereiro").collection("Dias").document("1")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d1_b1)


        h1011.setOnClickListener {
            h1011.setTextColor(
                Color.parseColor("#363A43")
            )
            h1011.setTypeface(h1011.typeface, Typeface.BOLD)
            h1011.background = ContextCompat.getDrawable(
                this@D1B1,
                R.drawable.selected_option_border_bg
            )
        }
    }
}