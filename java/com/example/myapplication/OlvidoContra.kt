package com.example.myapplication
import androidx.activity.ComponentActivity
import com.google.firebase.database.FirebaseDatabase

import android.widget.EditText
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import android.widget.Toast
import android.os.Bundle
import android.widget.Button
import com.google.firebase.database.*

class RegistroClaveActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registro_clave)
        val botonCambioContra = findViewById<Button>(R.id.cambioContra)
        botonCambioContra.setOnClickListener {
            cambiarContrasena()
        }
    }

    private fun cambiarContrasena() {
       val nombreUsuario = findViewById<EditText>(R.id.nombreUsuario).text.toString()
        val nuevaContraseña = findViewById<EditText>(R.id.nuevaContraseña).text.toString()
        // Obtener una referencia a la ubicación específica del usuario en la base de datos basada en el nombre de usuario
        val referenciaUsuarios = FirebaseDatabase.getInstance().getReference("Usuarios")
        referenciaUsuarios.orderByChild("Usuario").equalTo(nombreUsuario)
            .addListenerForSingleValueEvent(object : ValueEventListener {
                override fun onDataChange(snapshot: DataSnapshot) {
                    if (snapshot.exists()) {
                        // Se encontró el usuario, actualiza la contraseña
                        for (usuarioSnapshot in snapshot.children) {
                            val usuarioId = usuarioSnapshot.key
                            val referenciaUsuario =
                                FirebaseDatabase.getInstance().getReference("Usuarios")
                                    .child(usuarioId!!)
                            referenciaUsuario.child("Contraseña").setValue(nuevaContraseña)
                                .addOnSuccessListener {
                                    // Éxito al actualizar la contraseña
                                    Toast.makeText(
                                        applicationContext,
                                        "Contraseña actualizada correctamente",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                                .addOnFailureListener {
                                    // Error al actualizar la contraseña
                                    Toast.makeText(
                                        applicationContext,
                                        "Error al actualizar la contraseña",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                        }
                    } else {
                        // No se encontró el usuario
                        Toast.makeText(
                            applicationContext,
                            "Usuario no encontrado",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }

                override fun onCancelled(error: DatabaseError) {
                    // Manejar el error de la consulta
                    Toast.makeText(
                        applicationContext,
                        "Error al buscar el usuario",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            })
    }
}