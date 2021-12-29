package com.example.barberking

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class ProfileActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val logout = findViewById(R.id.btLogout) as TextView
        logout.setOnClickListener {
            logout()
            val intent = Intent(this, MainnActivity::class.java)
            startActivity(intent)
        }

    }
    private fun logout(){
        Firebase.auth.signOut()
    }
}