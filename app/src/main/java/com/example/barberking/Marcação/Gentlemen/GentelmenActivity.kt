package com.example.barberking.Marcação.Gentlemen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.barberking.Marcação.Asgard.Barbeiro1Activity
import com.example.barberking.R

class GentelmenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gentelmen)

        val barbeiro5 = findViewById(R.id.gentelbarb1) as TextView
        barbeiro5.setOnClickListener {
            val intent = Intent(this, Barbeiro5Activity::class.java)
            startActivity(intent)
        }

        val barbeiro6 = findViewById(R.id.gentelbarb2) as TextView
        barbeiro6.setOnClickListener {
            val intent = Intent(this, Barbeiro6Activity::class.java)
            startActivity(intent)
        }


    }
}