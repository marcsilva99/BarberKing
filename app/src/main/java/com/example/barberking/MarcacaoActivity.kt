package com.example.barberking

import android.content.Intent
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_marcacao.*

class MarcacaoActivity : AppCompatActivity() {

    private val dbFirestore: CollectionReference =
        FirebaseFirestore.getInstance().collection("Agendamento")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marcacao)

        dbFirestore.get()
            .addOnSuccessListener { documents ->
                for (document in documents) {
                    if (document != null) {

                        val ll_main = findViewById(R.id.ll_main_layout) as LinearLayout

                        // creating the button
                        val button_dynamic = Button(this)

                        // setting layout_width and layout_height using layout parameters

                        button_dynamic.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
                        button_dynamic.text = "${document.id}"

//                        val changeButton = Button(
//                            applicationContext
//                        )
//                        changeButton.text = "Asgard"
//                        changeButton.setId(R.id.tvop1);
//
//                        changeButton.text = "BarberHouse"
//                        changeButton.setId(R.id.tvop2);
//
//                        changeButton.text = "Gentelmen"
//                        changeButton.setId(R.id.tvop3);
//
//                        changeButton.text = "LeleBarber"
//                        changeButton.setId(R.id.tvop4);
//

                        // add Button to LinearLayout
                        ll_main.addView(button_dynamic)

//                        val tvop1 = findViewById(R.id.tvop1) as TextView
//                        tvop1.setOnClickListener {
//                            startActivity(Intent(this, AsgardActivity::class.java))
//                        }
//
//                        val tvop2 = findViewById(R.id.tvop2) as TextView
//                        tvop2.setOnClickListener {
//                            startActivity(Intent(this, BarberHouseActivity::class.java))
//                        }
//
//                        val tvop3 = findViewById(R.id.tvop3) as TextView
//                        tvop3.setOnClickListener {
//                            startActivity(Intent(this, GentelmenActivity::class.java))
//                        }
//
//                        val tvop4 = findViewById(R.id.tvop4) as TextView
//                        tvop4.setOnClickListener {
//                            startActivity(Intent(this, LeleBarberActivity::class.java))
//                        }


                        button_dynamic.setOnClickListener {


                            if(button_dynamic.text == "Asgard"){
                                startActivity(Intent(this, AsgardActivity::class.java))
                            }

                        if(button_dynamic.text == "Gentelmen"){
                            startActivity(Intent(this, GentelmenActivity::class.java))
                        }

                        if(button_dynamic.text == "BarberHouse"){
                            startActivity(Intent(this, BarberHouseActivity::class.java))
                        }

                        if(button_dynamic.text == "LeleBarber"){
                            startActivity(Intent(this, LeleBarberActivity::class.java))
                        }
                        }


                    }
                }
            }
            .addOnFailureListener{
                Toast.makeText(baseContext, "Erro de base de dados.",
                    Toast.LENGTH_SHORT).show()

            }


    }
}