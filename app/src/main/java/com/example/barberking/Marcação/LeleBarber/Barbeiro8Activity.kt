package com.example.barberking.Marcação.LeleBarber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import com.example.barberking.R
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore


class Barbeiro8Activity : AppCompatActivity() {
    private val dbFirestore: DocumentReference = FirebaseFirestore.getInstance().collection("Agendamento")
        .document("LeleBarber").collection("Barbeiro8").document("Fevereiro")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barbeiro1)

        dbFirestore.get()
            .addOnSuccessListener { documents ->
                if (documents != null){
                    val ll_main = findViewById(R.id.linearLayout) as LinearLayout

                    val button_dynamic = Button(this)
                    button_dynamic.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
                    button_dynamic.text = "${documents.id}"

                    ll_main.addView(button_dynamic)

                }
                dbFirestore.collection("Dias").get()
                    .addOnSuccessListener { documents ->
                        for(document in documents)
                            if (documents != null){
                                val ll_main = findViewById(R.id.ll_main_layout) as LinearLayout

                                val button_dynamic = Button(this)
                                button_dynamic.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
                                button_dynamic.text = "${document.id}"

                                ll_main.addView(button_dynamic)

                            }
                    }
            }
            .addOnFailureListener {
                Toast.makeText(
                    baseContext, "Erro na Base de Dados.",
                    Toast.LENGTH_SHORT
                ).show()
            }
    }
}