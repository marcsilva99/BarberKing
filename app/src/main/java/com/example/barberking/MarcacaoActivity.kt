package com.example.barberking

import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore

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
                        button_dynamic.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
                        button_dynamic.text = "${document.id}"

                        // add Button to LinearLayout
                        ll_main.addView(button_dynamic)



                    }
                }
            }


    }
}