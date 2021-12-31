package com.example.barberking

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
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

        val senha2 = findViewById(R.id.jogoimg) as ImageView
        senha2.setOnClickListener {
            senha()
        }

        val marcacao = findViewById(R.id.calendarioimg) as ImageView
        marcacao.setOnClickListener {
            val user = auth.currentUser
            marcacao(user)
        }

        val fazerlog : TextView = findViewById(R.id.textView1)
        fazerlog.let{
            val user = auth.currentUser
            perfil(user)
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

    private fun perfil(currentUser: FirebaseUser?){
        if (currentUser != null){
            val fazerlog1: TextView = findViewById(R.id.textView1)
            fazerlog1.text="Perfil"
        } else{
            val fazerlog2: TextView = findViewById(R.id.textView1)
            fazerlog2.text="Login"
        }
    }

    private fun senha(){
        val builder = AlertDialog.Builder(this)
        val view = layoutInflater.inflate(R.layout.activity_senha,null)
        val senha= view.findViewById(R.id.etSenha) as EditText
        builder.setView(view)
        builder.setPositiveButton("Submeter", DialogInterface.OnClickListener { _, _ ->
            if (senha.text.toString().isEmpty()){
                Toast.makeText(this, "Insira a senha.", Toast.LENGTH_SHORT).show()
            }
            if (senha.text.toString() != "KING21"){
                Toast.makeText(this, "Senha errada.", Toast.LENGTH_SHORT).show()
            }
            if (senha.text.toString() == "KING21"){
                        Toast.makeText(this, "Senha correta.", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, TipoCorteActivity::class.java))
                    }

        })
        builder.setNegativeButton("Fechar", DialogInterface.OnClickListener { _, _ ->  })
        builder.show()
    }

}