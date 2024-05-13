package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class BuscarUsuarioActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.buscar_usuario)

        val busquedaUsuarioEditText = findViewById<EditText>(R.id.busquedausuario)
        val buscarUsuarioButton = findViewById<Button>(R.id.buscando_usuarios)

        buscarUsuarioButton.setOnClickListener {
            val nombreUsuario = busquedaUsuarioEditText.text.toString()
            buscarUsuarioEnFirebase(nombreUsuario)
        }
    }

    private fun buscarUsuarioEnFirebase(nombreUsuario: String) {
        val referenciaUsuarios = FirebaseDatabase.getInstance().getReference("Usuarios")
        referenciaUsuarios.orderByChild("Usuario").equalTo(nombreUsuario)
            .addListenerForSingleValueEvent(object : ValueEventListener {
                override fun onDataChange(snapshot: DataSnapshot) {
                    if (snapshot.exists()) {
                        // El usuario está en la base de datos, abrir el menú de usuarios
                        val intent = Intent(this@BuscarUsuarioActivity, MenuUsuariosActivity::class.java)
                        startActivity(intent)
                        finish()
                    } else {
                        Toast.makeText(
                            applicationContext,
                            "El usuario ingresado no existe",
                            Toast.LENGTH_SHORT
                        ).show()
                }

                fun onCancelled(error: DatabaseError) {
                    Toast.makeText(
                        applicationContext,
                        "Error al conectar con la base de datos",
                        Toast.LENGTH_SHORT
                    ).show()
                     }
            }

                override fun onCancelled(error: DatabaseError) {
                    TODO("Not yet implemented")
                }
            }) }
}
