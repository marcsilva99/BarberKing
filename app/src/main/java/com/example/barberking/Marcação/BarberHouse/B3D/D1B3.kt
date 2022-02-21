package com.example.barberking.Marcação.BarberHouse.B3D

import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ActionMode
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import com.example.barberking.R
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import com.google.firebase.firestore.auth.User
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_d1_b3.*

class D1B3 : AppCompatActivity() {
    private val dbFirestore: DocumentReference =
        FirebaseFirestore.getInstance().collection("Agendamento")
            .document("BarberHouse").collection("Barbeiro3").document("Fevereiro").collection("Dias")
            .document("1")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d1_b3)

    }

    fun onClick(view: View) {
        when (view.id) {

            R.id.h1011 -> {
                val builder = AlertDialog.Builder(this)
                val view = layoutInflater.inflate(R.layout.confirmar, null)
                builder.setView(view)
                builder.setPositiveButton("Confirmar", DialogInterface.OnClickListener { _, _ ->

                    h1011.setBackgroundColor(Color.parseColor("#FF0000"))

                    val data = hashMapOf("livre" to false)

                    dbFirestore.collection("Horas").document("10:00 11:00")
                        .set(data, SetOptions.merge())

                    Toast.makeText(this, "Agendado com sucesso!", Toast.LENGTH_SHORT).show()

                })
                builder.setNegativeButton("Fechar", DialogInterface.OnClickListener { _, _ -> })
                builder.show()

            }
            R.id.h1112 -> {
                val builder = AlertDialog.Builder(this)
                val view = layoutInflater.inflate(R.layout.confirmar, null)
                builder.setView(view)
                builder.setPositiveButton("Confirmar", DialogInterface.OnClickListener { _, _ ->

                    h1112.setBackgroundColor(Color.parseColor("#FF0000"))

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