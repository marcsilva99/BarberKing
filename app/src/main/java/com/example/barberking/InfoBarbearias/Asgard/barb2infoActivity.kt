package com.example.barberking.InfoBarbearias.Asgard

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.barberking.R

class barb2infoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barb2info)

        val ButtonBarb2 = findViewById(R.id.tvButtonBarb2) as TextView
        ButtonBarb2.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//Barbearia+PenteHouse,+R.+Central+do+Olival+2720,+4417-727+Porto/@41.0630713,-8.5207902,557m/data=!3m1!1e3!4m9!4m8!1m0!1m5!1m1!1s0xd247d3008a526c1:0x9f4c038b6047a0bc!2m2!1d-8.5203986!2d41.0628686!3e0?hl=pt-PT"))
            startActivity(intent)
        }
    }
}