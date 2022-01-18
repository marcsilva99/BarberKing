package com.example.barberking

import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore

class AsgardActivity : AppCompatActivity() {

    private val dbFirestore: DocumentReference =
        FirebaseFirestore.getInstance().collection("Agendamento").document("Asgard")



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asgard)


                dbFirestore.collection("Agendamento")
                    .whereEqualTo("Asgard", true)
                    .get()
                    .addOnSuccessListener { documents ->
                        for (document in documents) {




                        val ll_main = findViewById(R.id.ll_main_layout) as LinearLayout

                        // creating the button
                        val button_dynamic = Button(this)

                        // setting layout_width and layout_height using layout parameters
                        button_dynamic.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
                        button_dynamic.text = "${document.id} => ${document.data}"

                        // add Button to LinearLayout
                        ll_main.addView(button_dynamic)



                    }
                }
            }


    }
