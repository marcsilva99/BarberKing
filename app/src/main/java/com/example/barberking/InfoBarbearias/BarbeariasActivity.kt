package com.example.barberking.InfoBarbearias

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.barberking.InfoBarbearias.Asgard.barb2Activity
import com.example.barberking.InfoBarbearias.LeleBarber.barb1Activity
import com.example.barberking.InfoBarbearias.BarberHouse.barb4Activity
import com.example.barberking.InfoBarbearias.Gentlemen.barb3Activity
import com.example.barberking.R

class BarbeariasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barbearias)

        val image_view = findViewById(R.id.imageView1) as ImageView
        image_view.setOnClickListener {
            val intent = Intent(this, barb1Activity::class.java)
            startActivity(intent)
        }

        val image_view2 = findViewById(R.id.imageView2) as ImageView
        image_view2.setOnClickListener {
            val intent = Intent(this, barb2Activity::class.java)
            startActivity(intent)
        }
        val image_view3 = findViewById(R.id.imageView3) as ImageView
        image_view3.setOnClickListener {
            val intent = Intent(this, barb3Activity::class.java)
            startActivity(intent)
        }

        val image_view4 = findViewById(R.id.imageView4) as ImageView
        image_view4.setOnClickListener {
            val intent = Intent(this, barb4Activity::class.java)
            startActivity(intent)
        }




    }
}
