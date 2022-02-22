package com.example.barberking.Marcação.Asgard.B1D

import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.barberking.MainnActivity
import com.example.barberking.R
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import kotlinx.android.synthetic.main.activity_d3_b1.*

class D3B1 : AppCompatActivity() {
    private val dbFirestore: DocumentReference =
        FirebaseFirestore.getInstance().collection("Agendamento")
            .document("Asgard").collection("Barbeiro1").document("Fevereiro").collection("Dias")
            .document("3")

    private var check = "true"
    private var check2 = "true"
    private var check3 = "true"
    private var check4 = "true"
    private var check5 = "true"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d3_b1)

        dbFirestore.collection("Horas").document("10:00 11:00").get().addOnSuccessListener { document ->
            if(document.data?.getValue("livre").toString() == "true"){
                check = "true"
            }else{
                check = "false"
                h1011.setBackgroundColor(Color.parseColor("#808080"))
                h1011.setTextColor(Color.parseColor("#FFFFFF"))

            }
        }

        dbFirestore.collection("Horas").document("11:00 12:00").get().addOnSuccessListener { document ->
            if(document.data?.getValue("livre").toString() == "true"){
                check2= "true"
            }else{
                check2 = "false"
                h1112.setBackgroundColor(Color.parseColor("#808080"))
                h1112.setTextColor(Color.parseColor("#FFFFFF"))

            }
        }

        dbFirestore.collection("Horas").document("14:00 15:00").get().addOnSuccessListener { document ->
            if (document.data?.getValue("livre").toString() == "true") {
                check3 = "true"
            } else {
                check3 = "false"
                h1415.setBackgroundColor(Color.parseColor("#808080"))
                h1415.setTextColor(Color.parseColor("#FFFFFF"))

            }
        }

        dbFirestore.collection("Horas").document("15:00 16:00").get().addOnSuccessListener { document ->
            if (document.data?.getValue("livre").toString() == "true") {
                check4 = "true"
            } else {
                check4 = "false"
                h1516.setBackgroundColor(Color.parseColor("#808080"))
                h1516.setTextColor(Color.parseColor("#FFFFFF"))

            }
        }

        dbFirestore.collection("Horas").document("16:00 17:00").get().addOnSuccessListener { document ->
            if (document.data?.getValue("livre").toString() == "true") {
                check5 = "true"
            } else {
                check5 = "false"
                h1617.setBackgroundColor(Color.parseColor("#808080"))
                h1617.setTextColor(Color.parseColor("#FFFFFF"))

            }
        }
    }

    fun onClick(view: View) {
        when (view.id) {

            R.id.h1011 -> {
                if(check == "true"){
                    val builder = AlertDialog.Builder(this)
                    val view = layoutInflater.inflate(R.layout.confirmar, null)
                    builder.setView(view)
                    builder.setPositiveButton(
                        "Confirmar",
                        DialogInterface.OnClickListener { _, _ ->

                            val data = hashMapOf("livre" to false)

                            dbFirestore.collection("Horas").document("10:00 11:00")
                                .set(data, SetOptions.merge())

                            Toast.makeText(this, "Agendado com succeso!", Toast.LENGTH_SHORT).show()


                            val intent = Intent(this, MainnActivity::class.java)
                            intent.flags =
                                Intent.FLAG_ACTIVITY_CLEAR_TASK.or(
                                    Intent.FLAG_ACTIVITY_NEW_TASK)
                            startActivity(intent)




                        })
                    builder.setNegativeButton(
                        "Fechar",
                        DialogInterface.OnClickListener { _, _ -> })
                    builder.show()

                }
                else{
                    Toast.makeText(this, "Desculpe, a data já está reservada.", Toast.LENGTH_SHORT).show()
                }
            }
            R.id.h1112 -> {
                if(check2 == "true"){
                    val builder = AlertDialog.Builder(this)
                    val view = layoutInflater.inflate(R.layout.confirmar, null)
                    builder.setView(view)
                    builder.setPositiveButton(
                        "Confirmar",
                        DialogInterface.OnClickListener { _, _ ->

                            val data = hashMapOf("livre" to false)

                            dbFirestore.collection("Horas").document("11:00 12:00")
                                .set(data, SetOptions.merge())

                            Toast.makeText(this, "Agendado com succeso!", Toast.LENGTH_SHORT).show()

                            val intent = Intent(this, MainnActivity::class.java)
                            intent.flags =
                                Intent.FLAG_ACTIVITY_CLEAR_TASK.or(
                                    Intent.FLAG_ACTIVITY_NEW_TASK)
                            startActivity(intent)


                        })
                    builder.setNegativeButton(
                        "Fechar",
                        DialogInterface.OnClickListener { _, _ -> })
                    builder.show()

                }
                else{
                    Toast.makeText(this, "Desculpe, a data já está reservada.", Toast.LENGTH_SHORT).show()
                }
            }
            R.id.h1415 -> {
                if(check3 == "true"){
                    val builder = AlertDialog.Builder(this)
                    val view = layoutInflater.inflate(R.layout.confirmar, null)
                    builder.setView(view)
                    builder.setPositiveButton(
                        "Confirmar",
                        DialogInterface.OnClickListener { _, _ ->

                            val data = hashMapOf("livre" to false)

                            dbFirestore.collection("Horas").document("14:00 15:00")
                                .set(data, SetOptions.merge())

                            Toast.makeText(this, "Agendado com succeso!", Toast.LENGTH_SHORT).show()

                            val intent = Intent(this, MainnActivity::class.java)
                            intent.flags =
                                Intent.FLAG_ACTIVITY_CLEAR_TASK.or(
                                    Intent.FLAG_ACTIVITY_NEW_TASK)
                            startActivity(intent)


                        })
                    builder.setNegativeButton(
                        "Fechar",
                        DialogInterface.OnClickListener { _, _ -> })
                    builder.show()

                }
                else{
                    Toast.makeText(this, "Desculpe, a data já está reservada.", Toast.LENGTH_SHORT).show()
                }
            }
            R.id.h1516 -> {
                if(check4 == "true"){
                    val builder = AlertDialog.Builder(this)
                    val view = layoutInflater.inflate(R.layout.confirmar, null)
                    builder.setView(view)
                    builder.setPositiveButton(
                        "Confirmar",
                        DialogInterface.OnClickListener { _, _ ->

                            val data = hashMapOf("livre" to false)

                            dbFirestore.collection("Horas").document("15:00 16:00")
                                .set(data, SetOptions.merge())

                            Toast.makeText(this, "Agendado com succeso!", Toast.LENGTH_SHORT).show()

                            val intent = Intent(this, MainnActivity::class.java)
                            intent.flags =
                                Intent.FLAG_ACTIVITY_CLEAR_TASK.or(
                                    Intent.FLAG_ACTIVITY_NEW_TASK)
                            startActivity(intent)


                        })
                    builder.setNegativeButton(
                        "Fechar",
                        DialogInterface.OnClickListener { _, _ -> })
                    builder.show()

                }
                else{
                    Toast.makeText(this, "Desculpe, a data já está reservada.", Toast.LENGTH_SHORT).show()
                }
            }
            R.id.h1617 -> {
                if(check5 == "true"){
                    val builder = AlertDialog.Builder(this)
                    val view = layoutInflater.inflate(R.layout.confirmar, null)
                    builder.setView(view)
                    builder.setPositiveButton(
                        "Confirmar",
                        DialogInterface.OnClickListener { _, _ ->

                            val data = hashMapOf("livre" to false)

                            dbFirestore.collection("Horas").document("16:00 17:00")
                                .set(data, SetOptions.merge())

                            Toast.makeText(this, "Agendado com succeso!", Toast.LENGTH_SHORT).show()

                            val intent = Intent(this, MainnActivity::class.java)
                            intent.flags =
                                Intent.FLAG_ACTIVITY_CLEAR_TASK.or(
                                    Intent.FLAG_ACTIVITY_NEW_TASK)
                            startActivity(intent)


                        })
                    builder.setNegativeButton(
                        "Fechar",
                        DialogInterface.OnClickListener { _, _ -> })
                    builder.show()

                }
                else{
                    Toast.makeText(this, "Desculpe, a data já está reservada.", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}