package com.example.barberking.Marcação.Asgard.B1D

import android.content.DialogInterface
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.barberking.R
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import kotlinx.android.synthetic.main.activity_d1_b1.*

class D1B1 : AppCompatActivity() {
    private val dbFirestore: DocumentReference =
        FirebaseFirestore.getInstance().collection("Agendamento")
            .document("Asgard").collection("Barbeiro1").document("Fevereiro").collection("Dias")
            .document("1")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d1_b1)

    }

        fun onClick(view: View) {
        when (view.id) {

            R.id.h1011 -> {
//                val teste = dbFirestore.collection("Horas").document("10:00 11:00")
//                    .get()
//                if(teste == false){

                val builder = AlertDialog.Builder(this)
                val view = layoutInflater.inflate(R.layout.confirmar, null)
                    builder.setView(view)
                    builder.setPositiveButton("Confirmar", DialogInterface.OnClickListener { _, _ ->

                        h1011.setBackgroundColor(Color.parseColor("#cc0000"))
                        h1011.setTextColor(Color.parseColor("#FFFFFF"))

                        val data = hashMapOf("livre" to false)

                        dbFirestore.collection("Horas").document("10:00 11:00")
                            .set(data, SetOptions.merge())



                    })
                    builder.setNegativeButton("Fechar", DialogInterface.OnClickListener { _, _ -> })
                    builder.show()


//            }
            }
            R.id.h1112 -> {
                val builder = AlertDialog.Builder(this)
                val view = layoutInflater.inflate(R.layout.confirmar, null)
                builder.setView(view)
                builder.setPositiveButton("Confirmar", DialogInterface.OnClickListener { _, _ ->

                    h1112.setBackgroundColor(Color.parseColor("#782B2B"))
                    h1112.setTextColor(Color.parseColor("#782B2B"))

                    val data = hashMapOf("livre" to false)

                    dbFirestore.collection("Horas").document("11:00 12:00")
                        .set(data, SetOptions.merge())

                    Toast.makeText(this, "Agendado com sucesso!", Toast.LENGTH_SHORT).show()


                })
                builder.setNegativeButton("Fechar", DialogInterface.OnClickListener { _, _ -> })
                builder.show()
            }
            R.id.h1415 -> {
                val builder = AlertDialog.Builder(this)
                val view = layoutInflater.inflate(R.layout.confirmar, null)
                builder.setView(view)
                builder.setPositiveButton("Confirmar", DialogInterface.OnClickListener { _, _ ->

                    h1415.setBackgroundColor(Color.parseColor("#FF0000"))

                    val data = hashMapOf("livre" to false)

                    dbFirestore.collection("Horas").document("14:00 15:00")
                        .set(data, SetOptions.merge())

                    Toast.makeText(this, "Agendado com sucesso!", Toast.LENGTH_SHORT).show()


                })
                builder.setNegativeButton("Fechar", DialogInterface.OnClickListener { _, _ -> })
                builder.show()
            }
            R.id.h1516 -> {
                val builder = AlertDialog.Builder(this)
                val view = layoutInflater.inflate(R.layout.confirmar, null)
                builder.setView(view)
                builder.setPositiveButton("Confirmar", DialogInterface.OnClickListener { _, _ ->

                    h1516.setBackgroundColor(Color.parseColor("#FF0000"))

                    val data = hashMapOf("livre" to false)

                    dbFirestore.collection("Horas").document("15:00 16:00")
                        .set(data, SetOptions.merge())

                    Toast.makeText(this, "Agendado com sucesso!", Toast.LENGTH_SHORT).show()


                })
                builder.setNegativeButton("Fechar", DialogInterface.OnClickListener { _, _ -> })
                builder.show()
            }
            R.id.h1617 -> {
                val builder = AlertDialog.Builder(this)
                val view = layoutInflater.inflate(R.layout.confirmar, null)
                builder.setView(view)
                builder.setPositiveButton("Confirmar", DialogInterface.OnClickListener { _, _ ->

                    h1617.setBackgroundColor(Color.parseColor("#FF0000"))

                    val data = hashMapOf("livre" to false)

                    dbFirestore.collection("Horas").document("16:00 17:00")
                        .set(data, SetOptions.merge())

                    Toast.makeText(this, "Agendado com sucesso!", Toast.LENGTH_SHORT).show()


                })
                builder.setNegativeButton("Fechar", DialogInterface.OnClickListener { _, _ -> })
                builder.show()
            }
        }
    }
}