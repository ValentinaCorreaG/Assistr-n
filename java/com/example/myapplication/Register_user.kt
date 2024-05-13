package com.example.myapplication
import android.content.Intent
import androidx.activity.ComponentActivity
import com.google.firebase.database.FirebaseDatabase
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import android.widget.Toast

class RegisterUsuriousActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registro_usuario)
        val buttonGuardar = findViewById<Button>(R.id.button_login)
        buttonGuardar.setOnClickListener {
            guardarDatosEnFirebase()
        }
    }

    private fun guardarDatosEnFirebase() {
        val database = FirebaseDatabase.getInstance()
        val referenciaUsuarios = database.getReference("Usuarios")
        val nombreUsuario = findViewById<EditText>(R.id.regis_user).text.toString()
        referenciaUsuarios.orderByChild("Usuario").equalTo(nombreUsuario).addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()) {
                    // El usuario ya está registrado
                    Toast.makeText(applicationContext,"¡El usuario ya está registrado!",Toast.LENGTH_SHORT).show()
                } else {
                    val usuario = HashMap<String, Any>()
                    usuario["Usuario"] = findViewById<EditText>(R.id.regis_user).text.toString()
                    usuario["Nombre"] = findViewById<EditText>(R.id.registname).text.toString()
                    usuario["Cedula"] = findViewById<EditText>(R.id.registcedula).text.toString()
                    usuario["Grupo"] = findViewById<EditText>(R.id.resgistgroup).text.toString()
                    usuario["Especialidad"] = findViewById<EditText>(R.id.registespec).text.toString()
                    usuario["Telefono"] = findViewById<EditText>(R.id.registphone).text.toString()
                    usuario["Contraseña"] = findViewById<EditText>(R.id.estadouser).text.toString()
                    referenciaUsuarios.push().setValue(usuario)
                        .addOnCompleteListener { task ->
                            if (task.isSuccessful) {
                                // Éxito
                                val intent = Intent(this@RegisterUsuriousActivity, GoToMenu::class.java) // Cambia a InicioActivity
                                startActivity(intent)
                                finish()

                                startActivity(intent)
                                finish()
                            } else {
                                // Error
                                 val intent = Intent(this@RegisterUsuriousActivity, BackUser::class.java) // Cambia a InicioActivity
                                startActivity(intent)
                                finish()

                                startActivity(intent)
                                finish()
                            }
                        }
                }
            }
            override fun onCancelled(error: DatabaseError) {
                // Manejar el error de la consulta o proporcionar una implementación vacía
                Toast.makeText(applicationContext, "Error al consultar la base de datos", Toast.LENGTH_SHORT).show()
            }
        })
    }

}
