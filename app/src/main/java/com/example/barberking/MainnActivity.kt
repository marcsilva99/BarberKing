package com.example.barberking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class MainnActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainn);
        auth = FirebaseAuth.getInstance()

        val login = findViewById(R.id.loginimg) as ImageView
        login.setOnClickListener {
            val user = auth.currentUser
            teste(user)
        }

        val barbearias = findViewById(R.id.barbeariasimg) as ImageView
        barbearias.setOnClickListener {
            val intent = Intent(this, BarbeariasActivity::class.java)
            startActivity(intent)
        }

        val marcacao = findViewById(R.id.calendarioimg) as ImageView
        marcacao.setOnClickListener {
            val user = auth.currentUser
            marcacao(user)
        }

    }

    private fun teste(currentUser: FirebaseUser?){
        if (currentUser != null){
            startActivity(Intent(this, ProfileActivity::class.java))
        } else{
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

    private fun marcacao(currentUser: FirebaseUser?){
        if (currentUser != null){
            startActivity(Intent(this, MarcacaoActivity::class.java))
        } else{
            Toast.makeText(baseContext, "Faça login primeiro.",
                    Toast.LENGTH_SHORT).show()
        }
    }

}