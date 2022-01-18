package com.example.barberking


import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MarcacaoActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marcacao)


        val asgard = findViewById(R.id.asgard1) as TextView
        asgard.setOnClickListener {
            val intent = Intent(this, AsgardActivity::class.java)
            startActivity(intent)
        }

        val house = findViewById(R.id.barbe1) as TextView
        house.setOnClickListener {
            val intent = Intent(this, BarberHouseActivity::class.java)
            startActivity(intent)
        }

        val gentel = findViewById(R.id.gentel1) as TextView
        gentel.setOnClickListener {
            val intent = Intent(this, GentelmenActivity::class.java)
            startActivity(intent)
        }

        val lele = findViewById(R.id.lele1) as TextView
        lele.setOnClickListener {
            val intent = Intent(this, LeleBarberActivity::class.java)
            startActivity(intent)
        }

    }
}