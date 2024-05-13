package com.example.myapplication
import android.content.Intent
import androidx.activity.ComponentActivity
import com.google.firebase.database.FirebaseDatabase
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import android.widget.Toast

class IniciarSesionActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.iniciar_sesion)

        val botonIniciarSesion = findViewById<Button>(R.id.irinicio)
        botonIniciarSesion.setOnClickListener {
            realizarInicioSesion()
        }
    }

    private fun realizarInicioSesion() {
        val nombreUsuario = findViewById<EditText>(R.id.user).text.toString()
        val contraseña = findViewById<EditText>(R.id.password).text.toString()

        if (nombreUsuario == "admintriton" && contraseña == "1234abc") {
            val intent = Intent(this, InicioActivity::class.java) // Aquí cambia a InicioActivity
            startActivity(intent)
            finish()
        } else {
            Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show()
        }
    }
}



