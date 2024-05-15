package com.example.myapplication
import android.content.Intent
import androidx.activity.ComponentActivity
import com.google.firebase.database.FirebaseDatabase
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.CheckBox
import android.widget.LinearLayout
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import android.widget.Toast
import org.json.JSONObject

class EditHorarioActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.editar_horario)
        val buttonGuardar = findViewById<Button>(R.id.editarHorario)
        buttonGuardar.setOnClickListener {
            updateDatosFirebase()
        }
    }

    private fun updateDatosFirebase() {
        val referenciaHorarios = FirebaseDatabase.getInstance().getReference("Horarios")
        val nombreHorario = findViewById<EditText>(R.id.nombreH).text.toString()
        val horario = mapOf<String, String>(
            "Nombre" to nombreHorario,
            "Dias" to dias(),
            "HoraI" to findViewById<EditText>(R.id.horaI).text.toString(),
            "HoraF" to findViewById<EditText>(R.id.horaF).text.toString()
        )
        referenciaHorarios.child("Horarios").updateChildren(horario).addOnSuccessListener {
            // Éxito
            val intent = Intent(this@EditHorarioActivity, GoToMenu::class.java) // Cambia a InicioActivity
            startActivity(intent)
            finish()

            startActivity(intent)
            finish()
        }.addOnFailureListener {
            // Error
            Toast.makeText(applicationContext, "Error al consultar la base de datos", Toast.LENGTH_SHORT).show()
            val intent =
                Intent(this@EditHorarioActivity, BackUser::class.java) // Cambia a InicioActivity
            startActivity(intent)
            finish()

            startActivity(intent)
            finish()
        }
    }

    fun dias():String{
        var dias = ""
        var lun = findViewById<CheckBox>(R.id.Lun)
        var mar = findViewById<CheckBox>(R.id.Mar)
        var mie = findViewById<CheckBox>(R.id.Mie)
        var jue = findViewById<CheckBox>(R.id.Jue)
        var vie = findViewById<CheckBox>(R.id.Vie)
        var sab = findViewById<CheckBox>(R.id.Sab)
        var dom = findViewById<CheckBox>(R.id.Dom)
        if (lun.isChecked){dias += "Lunes, "}
        if (mar.isChecked){dias += "Martes, "}
        if (mie.isChecked){dias += "Miercoles, "}
        if (jue.isChecked){dias += "Jueves, "}
        if (vie.isChecked){dias += "Viernes, "}
        if (sab.isChecked){dias += "Sabado, "}
        if (dom.isChecked){dias += "Domingo"}
        return dias
    }

}
