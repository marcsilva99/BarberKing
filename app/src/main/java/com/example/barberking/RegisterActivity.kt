package com.example.barberking


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class RegisterActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registerr)
        auth = FirebaseAuth.getInstance()

        val registo = findViewById(R.id.registo) as TextView
        registo.setOnClickListener {
            Registo()
        }
    }

    fun Registo(){
        val email = findViewById(R.id.etEmail) as EditText
        val pass = findViewById(R.id.etPassword) as EditText
        if (email.text.toString().isEmpty()){
            email.error = "Por favor insira um email."
            email.requestFocus()
            return
        }
        if (Patterns.EMAIL_ADDRESS.matcher(email.toString()).matches()){
            email.error = "Por favor insira um email válido."
            email.requestFocus()
            return
        }
        if (pass.text.toString().isEmpty()){
            pass.error = "Por favor insira uma password."
            pass.requestFocus()
            return
        }
        else if (pass.text.toString().length<6){
            pass.error = "Minimo 6 caracteres na password."
            pass.requestFocus()
            return
        }

        auth.createUserWithEmailAndPassword(email.text.toString(), pass.text.toString())
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        startActivity(Intent(this,LoginActivity::class.java))
                        finish()
                    } else {
                        Toast.makeText(baseContext, "Erro no registo.",
                                Toast.LENGTH_SHORT).show()
                    }
                }
    }
}
