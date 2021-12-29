package com.example.barberking

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.ktx.Firebase


class LoginActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginn)
        auth = FirebaseAuth.getInstance()


        val register = findViewById(R.id.registo) as TextView
        register.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        val login = findViewById(R.id.btLogin) as TextView
        login.setOnClickListener {
            doLogin()
        }

        val esqueceu = findViewById(R.id.tvEsqueceu) as TextView
        esqueceu.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val view = layoutInflater.inflate(R.layout.activity_esqueceu_pass,null)
            val email= view.findViewById<EditText>(R.id.etEmail)
            builder.setView(view)
            builder.setPositiveButton("Reset", DialogInterface.OnClickListener {_ , _ ->
                forgotPassword(email)
            })
            builder.setNegativeButton("Fechar", DialogInterface.OnClickListener {_, _ ->  })
                builder.show()
        }

    }
    private fun forgotPassword(email: EditText){
        val email = findViewById(R.id.etEmail) as EditText
        if (email.text.toString().isEmpty()){
            return
        }
        if (Patterns.EMAIL_ADDRESS.matcher(email.text.toString()).matches()){
            return
        }

        auth.sendPasswordResetEmail(email.text.toString())
                .addOnCompleteListener { task ->
                    if (task.isSuccessful){
                        Toast.makeText(this, "Email Enviado.", Toast.LENGTH_SHORT).show()
                    }
                }
    }

    private fun doLogin() {
        val email = findViewById(R.id.etEmail) as EditText
        val pass = findViewById(R.id.etPassword) as EditText
        if (email.text.toString().isEmpty()){
            email.error = "Por favor insira um email."
            email.requestFocus()
            return
        }
        if (Patterns.EMAIL_ADDRESS.matcher(email.text.toString()).matches()){
            email.error = "Por favor insira um email válido."
            email.requestFocus()
            return
        }
        if (pass.text.toString().isEmpty()){
            pass.error = "Por favor insira uma password."
            pass.requestFocus()
            return
        }
        auth.signInWithEmailAndPassword(email.text.toString(), pass.text.toString())
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        val user = auth.currentUser
                        updateUI(user)
                    } else {
                        updateUI(null)
                    }
                }
    }

    public override fun onStart() {
        super.onStart()
        val currentUser = auth.currentUser

    }

    private fun updateUI(currentUser: FirebaseUser?){
        if (currentUser != null){
            startActivity(Intent(this, MainnActivity::class.java))
        } else{
            Toast.makeText(baseContext, "Erro no Login.",
                    Toast.LENGTH_SHORT).show()
        }
    }

}

