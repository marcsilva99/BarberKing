package com.example.barberking.InfoBarbearias.LeleBarber

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.barberking.MainnActivity
import com.example.barberking.R
import com.google.firebase.firestore.SetOptions

class barb1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barb1)

        val barb1info = findViewById(R.id.barb1info) as ImageView
        barb1info.setOnClickListener {
            val intent = Intent(this, barb1infoActivity::class.java)
            startActivity(intent)
        }

        val barb1barbeiro = findViewById(R.id.barb1barbeiro) as ImageView
        barb1barbeiro.setOnClickListener {
            val intent = Intent(this, barb1barbeirosActivity::class.java)
            startActivity(intent)
        }

        val show2 = findViewById(R.id.btn_showroom1) as Button
        show2.setOnClickListener {
            show()
        }






        }
    private fun show(){
        val builder = AlertDialog.Builder(this)
        val view = layoutInflater.inflate(R.layout.activity_barb1show,null)

        builder.setView(view)

        builder.show()
    }

}


