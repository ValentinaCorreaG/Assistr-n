package com.example.myapplication

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inicio)

    }

    fun Inicio_noti(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.menu_notificaciones)
    }

    fun Noti_vernoti(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.ver_notificaciones)
    }

    fun Vernoti_torneo(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.ver_torneo_mariposa)
    }
    fun Noti_modnoti(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.modificar_notificaciones)
    }
    fun Modnoti_torneo(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.editar_torneo_mariposa)
    }
    fun Noti_añnoti(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.crear_notificacion)
    }
    fun Volvermenu_noti(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.menu_notificaciones)
    }
    fun Volvermenu_inicio(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.inicio)
    }
    fun Asist_verasist(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.ver_asistencias)
    }
    fun Verasist_aprendiendover(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.aprendiendo_nadar_ver)
    }
    fun Aprendiendover_aprendiendovermartes09(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.aprendiendo_nadar_ver_martes09)
    }
    fun Asist_modasist(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.modificar_asistencias)
    }
    fun Modasist_modaprendiendo(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.aprendiendo_nadar_modificar)
    }
    fun Modaprendiendo_modaprendiendomartes(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.aprendiendo_nadar_modificar_martes09)
    }
    fun Asist_añasist(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.crear_asistencia)
    }
    fun Añasist_añaprendiendo(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.aprendiendo_nadar_crear)
    }
    fun Volvermenu_asist(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.menu_asistencia)
    }
    fun Inicio_asist(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.menu_asistencia)
    }

}