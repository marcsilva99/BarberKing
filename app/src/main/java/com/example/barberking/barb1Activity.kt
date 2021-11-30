package com.example.barberking

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class barb1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barb1)

        val ButtonBarb1 = findViewById(R.id.tvButtonBarb1) as TextView
        ButtonBarb1.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//Barbearia+e+Tattoo+Asgard+Mafamude,+R.+de+Angola+72,+4430-014+Vila+Nova+de+Gaia/@41.1236238,-8.6201721,14z/data=!3m1!5s0xd2464cd809496a3:0x84b3417553dc28f3!4m9!4m8!1m0!1m5!1m1!1s0xd2465c8ac47c1af:0xb339e3f5967adc39!2m2!1d-8.6049595!2d41.1224684!3e0?hl=pt-PT"))
            startActivity(intent)
        }
    }
}
