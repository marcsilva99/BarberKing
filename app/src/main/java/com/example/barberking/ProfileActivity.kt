package com.example.barberking

import android.content.Intent
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_loginn.*
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val logout = findViewById(R.id.btLogout) as TextView
        logout.setOnClickListener {
            logout()
            Toast.makeText(baseContext, "Até breve!",
                Toast.LENGTH_SHORT).show()
            val intent = Intent(this@ProfileActivity, MainnActivity::class.java)
            intent.flags =
                Intent.FLAG_ACTIVITY_CLEAR_TASK.or(
                    Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }

        val email3 : TextView = findViewById(R.id.email)
        email3.let{
            perfil()
        }

//        showHideBtn.setOnClickListener {
//            if(showHideBtn.text.toString().equals("Show")){
//                pwd.transformationMethod = HideReturnsTransformationMethod.getInstance()
//                showHideBtn.text = "Hide"
//            } else{
//                pwd.transformationMethod = PasswordTransformationMethod.getInstance()
//                showHideBtn.text = "Show"
//            }
//        }

    }
    private fun logout(){
        Firebase.auth.signOut()
    }

    private fun perfil() {
        val user = Firebase.auth.currentUser
        user?.let {
            val email2 = user.email
            email.text = email2
//            val pass2 = user.
//            pwd.text = pass2.toString()
        }
    }
}