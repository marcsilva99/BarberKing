package com.example.barberking.Marcação.Asgard

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.barberking.R

class AsgardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asgard)


        val barbeiro1 = findViewById(R.id.Asgardbarb1) as TextView
        barbeiro1.setOnClickListener {
            val intent = Intent(this, Barbeiro1Activity::class.java)
            startActivity(intent)
        }

        val barbeiro2 = findViewById(R.id.Asgardbarb2) as TextView
        barbeiro2.setOnClickListener {
            val intent = Intent(this, Barbeiro2Activity::class.java)
            startActivity(intent)
        }
    }
}