package com.example.barberking

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class barb4infoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barb4info)

        val ButtonBarb4 = findViewById(R.id.tvButtonBarb4) as TextView
        ButtonBarb4.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//Daniel+Reis+O+Barbeiro,+R.+de+Soares+dos+Reis+191,+4430-315+Vila+Nova+de+Gaia/@41.1215403,-8.6107356,936m/data=!3m2!1e3!5s0xd2464cd809496a3:0x84b3417553dc28f3!4m9!4m8!1m0!1m5!1m1!1s0xd2464d47ed9699b:0x3d763c0d7e40821f!2m2!1d-8.6101869!2d41.1213426!3e0?hl=pt-PT"))
            startActivity(intent)
        }
    }
}