package com.example.barberking

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class barb3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barb3)

        val ButtonBarb3 = findViewById(R.id.tvButtonBarb3) as TextView
        ButtonBarb3.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//Barbearia+24,+R.+Com%C3%A9rcio+838/@40.9885723,-8.4844375,937m/data=!3m1!1e3!4m9!4m8!1m0!1m5!1m1!1s0xd248177b85e76b3:0x73865f80272c52a!2m2!1d-8.4840567!2d40.9884143!3e0?hl=pt-PT"))
            startActivity(intent)
        }
    }
}