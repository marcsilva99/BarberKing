package com.example.barberking.InfoBarbearias.BarberHouse

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.barberking.R


class barb4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barb4)

        val barb4info = findViewById(R.id.barb4info) as ImageView
        barb4info.setOnClickListener {
            val intent = Intent(this, barb4infoActivity::class.java)
            startActivity(intent)
        }

        val barb4barbeiro = findViewById(R.id.barb4barbeiro) as ImageView
        barb4barbeiro.setOnClickListener {
            val intent = Intent(this, barb4barbeirosActivity::class.java)
            startActivity(intent)
        }
        val show4 = findViewById(R.id.btn_showroom4) as Button
        show4.setOnClickListener {
            show()
        }


    }
    private fun show(){
        val builder = AlertDialog.Builder(this)
        val view = layoutInflater.inflate(R.layout.activity_barb4show,null)

        builder.setView(view)

        builder.show()
    }
}