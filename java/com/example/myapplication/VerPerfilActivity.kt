package com.example.myapplication.com.example.myapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.google.firebase.database.*
import com.example.myapplication.R

class VerPerfilActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ver_perfil)

        val nombreTextView = findViewById<TextView>(R.id.nombreuser)
        val cedulaTextView = findViewById<TextView>(R.id.cedulauser)
        val grupoTextView = findViewById<TextView>(R.id.grupouser)
        val especialidadTextView = findViewById<TextView>(R.id.especialidaduser)
        val telefonoTextView = findViewById<TextView>(R.id.telefonouser)
        val estadoTextView = findViewById<TextView>(R.id.estadouser) // TextView para mostrar el estado

        // Obtener referencia a la base de datos
        val database = FirebaseDatabase.getInstance()
        val referenciaUsuarios = database.getReference("Usuarios")

        // Obtener referencia a la imagen
        val imagenBuscar = findViewById<ImageView>(R.id.imagenbuscar)

        // Escuchar clic en la imagen
        imagenBuscar.setOnClickListener {
            // Obtener el nombre de usuario del TextView
            val nombreUsuario = findViewById<TextView>(R.id.usuario).text.toString().trim()

            // Verificar si el usuario existe en la base de datos
            referenciaUsuarios.orderByChild("Usuario").equalTo(nombreUsuario).addListenerForSingleValueEvent(object : ValueEventListener {
                override fun onDataChange(snapshot: DataSnapshot) {
                    if (snapshot.exists()) {
                        // El usuario existe, obtener sus datos
                        for (usuarioSnapshot in snapshot.children) {
                            val nombre = usuarioSnapshot.child("Nombre").getValue(String::class.java)
                            val cedula = usuarioSnapshot.child("Cedula").getValue(String::class.java)
                            val grupo = usuarioSnapshot.child("Grupo").getValue(String::class.java)
                            val especialidad = usuarioSnapshot.child("Especialidad").getValue(String::class.java)
                            val telefono = usuarioSnapshot.child("Telefono").getValue(String::class.java)
                            val estado = usuarioSnapshot.child("Estado").getValue(String::class.java) // Obtener el estado

                            // Mostrar los datos en los TextView correspondientes
                            nombreTextView.text = nombre
                            cedulaTextView.text = cedula
                            grupoTextView.text = grupo
                            especialidadTextView.text = especialidad
                            telefonoTextView.text = telefono
                            estadoTextView.text = estado // Mostrar el estado en el TextView estadouser
                        }
                    } else {
                        // El usuario no existe
                        Toast.makeText(applicationContext, "El usuario no existe", Toast.LENGTH_SHORT).show()
                    }
                }

                override fun onCancelled(error: DatabaseError) {
                    // Manejar el error de la consulta
                    Toast.makeText(applicationContext, "Error al consultar la base de datos", Toast.LENGTH_SHORT).show()
                }
            })
        }
    }
}
