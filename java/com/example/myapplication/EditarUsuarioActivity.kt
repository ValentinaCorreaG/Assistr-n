import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.google.firebase.database.*
import com.example.myapplication.R
import android.widget.ImageView

class EditarUsuarioActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.editar_usuario)

        val nombreEditText = findViewById<EditText>(R.id.nombreuser)
        val cedulaEditText = findViewById<EditText>(R.id.cedulauser)
        val grupoEditText = findViewById<EditText>(R.id.grupouser)
        val especialidadEditText = findViewById<EditText>(R.id.especialidaduser)
        val telefonoEditText = findViewById<EditText>(R.id.telefonouser)
        val imagenBuscar = findViewById<ImageView>(R.id.imagenbuscar)
        val guardarCambiosButton = findViewById<Button>(R.id.guardarcambios)

        // Obtener referencia a la base de datos
        val database = FirebaseDatabase.getInstance()
        val referenciaUsuarios = database.getReference("Usuarios")

        // Escuchar clic en la imagen
        imagenBuscar.setOnClickListener {
            // Obtener el nombre de usuario del E
            // ditText
            val nombreUsuario = nombreEditText.text.toString().trim()

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

                            // Mostrar los datos en los EditText correspondientes
                            nombreEditText.setText(nombre)
                            cedulaEditText.setText(cedula)
                            grupoEditText.setText(grupo)
                            especialidadEditText.setText(especialidad)
                            telefonoEditText.setText(telefono)
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

        // Escuchar clic en el botón de guardar cambios
        guardarCambiosButton.setOnClickListener {
            val nuevoNombre = nombreEditText.text.toString()
            val nuevaCedula = cedulaEditText.text.toString()
            val nuevoGrupo = grupoEditText.text.toString()
            val nuevaEspecialidad = especialidadEditText.text.toString()
            val nuevoTelefono = telefonoEditText.text.toString()

            // Obtener el nombre de usuario del EditText
            val nombreUsuario = nombreEditText.text.toString().trim()

            // Crear un nuevo HashMap con los datos actualizados
            val nuevoUsuario = hashMapOf(
                "Nombre" to nuevoNombre,
                "Cedula" to nuevaCedula,
                "Grupo" to nuevoGrupo,
                "Especialidad" to nuevaEspecialidad,
                "Telefono" to nuevoTelefono
            )

            // Actualizar los datos del usuario en la base de datos
            referenciaUsuarios.child(nombreUsuario).setValue(nuevoUsuario)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        // Éxito al actualizar los datos
                        Toast.makeText(applicationContext, "Datos actualizados correctamente", Toast.LENGTH_SHORT).show()
                    } else {
                        // Error al actualizar los datos
                        Toast.makeText(applicationContext, "Error al actualizar los datos", Toast.LENGTH_SHORT).show()
                    }
                }
        }
    }
}
