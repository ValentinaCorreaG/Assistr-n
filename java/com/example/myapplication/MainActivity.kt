package com.example.myapplication

import android.app.AlertDialog
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.activity.ComponentActivity
import android.content.DialogInterface
import android.widget.Toast


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inicio)

    }
    fun Buscar_Perfil(view: View){
        setContentView(R.layout.buscar_usuario)
    }
    // Dany

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


    // Vale

    fun volverButtonClicked(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.menu_grupo)
    }
    fun boton_busqueda(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.buscar_grupo)
    }
    fun Añadir_Grupo(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.nuevo_grupo)
    }
    fun boton_modificar_grup(view: View){
        setContentView(R.layout.editar_grupo_activo)
        val spinnerEstado = findViewById<Spinner>(R.id.estado)
        val option_Estado = arrayOf("Activo", "Inactivo")
        spinnerEstado.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, option_Estado)
    }
    fun Buscar_Grupo(view: View){
        setContentView(R.layout.bucando_grupo)
    }
    fun Ver_Grupo(view: View){
        setContentView(R.layout.ver_grupo)
    }
    fun Cambiara_activo(view: View){
        setContentView(R.layout.editar_grupo_inactivo)
    }

    // Saris

    fun horariom_horariov(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.eliminar_horario)
    }

    fun horariom_horarioe(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.editar_horario)
    }

    fun Volvermenu_h(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.horario_menu)
    }

    fun Ver_semillero(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.semillero_ejemplo)
    }

    fun registroU(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.registro_usuario)
    }

    fun registroC(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.registro_clave)
    }

    fun volvermU(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.usuario_menu)
    }


    fun usuariom_usuariov(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.ver_perfil)
    }

    fun usuariom_usuarioe(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.registro_usuario)
    }

    fun horariom_horarioc(view: View) {
        // Código para manejar el clic del botón aquí
        setContentView(R.layout.crear_horario)
    }

    //

    fun EditarUsuario(view: View){
        setContentView(R.layout.editar_usuario)
    }

    fun Inicio_grupo(view: View){
        setContentView(R.layout.menu_grupo)
    }
    fun Asist_reporte(view: View){
        setContentView(R.layout.generar_repo)
    }
    fun Inicio_usuarios(view: View){
        setContentView(R.layout.usuario_menu)
    }
    fun Inicio_horarios(view: View){
        setContentView(R.layout.horario_menu)
    }
    fun Inicio_miperfil(view: View){
        setContentView(R.layout.ver_perfil)
    }
    fun Inicio_iniciarsesion(view: View){
        setContentView(R.layout.iniciar_sesion)
    }
    fun Iniciarsesion_inicio(view: View){
        setContentView(R.layout.inicio)
    }
    fun Presentacion_iniciarsesion(view: View){
        setContentView(R.layout.iniciar_sesion)
    }
    fun Registroclave_iniciosesion(view: View){
        setContentView(R.layout.iniciar_sesion)
    }
    fun Buscaruser_buscandousuario(view: View){
        setContentView(R.layout.buscando_usuario)
    }

    //Pop ups

    val positiveButtonClick = { dialog: DialogInterface, which: Int ->
        Toast.makeText(applicationContext,
            android.R.string.yes, Toast.LENGTH_SHORT).show()
    }
    val negativeButtonClick = { dialog: DialogInterface, which: Int ->
        Toast.makeText(applicationContext,
            android.R.string.no, Toast.LENGTH_SHORT).show()
    }
    val neutralButtonClick = { dialog: DialogInterface, which: Int ->
        Toast.makeText(applicationContext,
            "Maybe", Toast.LENGTH_SHORT).show()
    }

    val positiveButtonClickCrearAsist = { dialog: DialogInterface, which: Int ->
        Toast.makeText(applicationContext,
            android.R.string.yes, Toast.LENGTH_SHORT).show()
        setContentView(R.layout.menu_asistencia)
    }

    fun Registrarasist(view: View) {
        val builder = AlertDialog.Builder(this)
        val inflater = layoutInflater
        val dialogLayout = inflater.inflate(R.layout.popup_registrarasist, null)
        builder.setView(dialogLayout)
        builder.setPositiveButton("Aceptar", DialogInterface.OnClickListener(function = positiveButtonClickCrearAsist))
        builder.setNegativeButton("Cancelar", DialogInterface.OnClickListener(function = negativeButtonClick))
        builder.show()

    }

    val positiveButtonClickModAsist = { dialog: DialogInterface, which: Int ->
        Toast.makeText(applicationContext,
            android.R.string.yes, Toast.LENGTH_SHORT).show()
        setContentView(R.layout.menu_asistencia)
    }

    fun Modasist(view: View) {
        val builder = AlertDialog.Builder(this)
        val inflater = layoutInflater
        val dialogLayout = inflater.inflate(R.layout.popup_modasist, null)
        builder.setView(dialogLayout)
        builder.setPositiveButton("Aceptar", DialogInterface.OnClickListener(function = positiveButtonClickModAsist))
        builder.setNegativeButton("Cancelar", DialogInterface.OnClickListener(function = negativeButtonClick))
        builder.show()

    }

    val positiveButtonClickCrearNot = { dialog: DialogInterface, which: Int ->
        Toast.makeText(applicationContext,
            android.R.string.yes, Toast.LENGTH_SHORT).show()
        setContentView(R.layout.menu_notificaciones)
    }

    fun Crearnoti(view: View) {
        val builder = AlertDialog.Builder(this)
        val inflater = layoutInflater
        val dialogLayout = inflater.inflate(R.layout.popup_crearnoti, null)
        builder.setView(dialogLayout)
        builder.setPositiveButton("Aceptar", DialogInterface.OnClickListener(function = positiveButtonClickCrearNot))
        builder.setNegativeButton("Cancelar", DialogInterface.OnClickListener(function = negativeButtonClick))
        builder.show()

    }

    val positiveButtonClickGuardarNot = { dialog: DialogInterface, which: Int ->
        Toast.makeText(applicationContext,
            android.R.string.yes, Toast.LENGTH_SHORT).show()
        setContentView(R.layout.menu_notificaciones)
    }

    fun Guardarnoti(view: View) {
        val builder = AlertDialog.Builder(this)
        val inflater = layoutInflater
        val dialogLayout = inflater.inflate(R.layout.popup_guardarnoti, null)
        builder.setView(dialogLayout)
        builder.setPositiveButton("Aceptar", DialogInterface.OnClickListener(function = positiveButtonClickGuardarNot))
        builder.setNegativeButton("Cancelar", DialogInterface.OnClickListener(function = negativeButtonClick))
        builder.show()

    }

    val positiveButtonClickCrearGrup = { dialog: DialogInterface, which: Int ->
        Toast.makeText(applicationContext,
            android.R.string.yes, Toast.LENGTH_SHORT).show()
        setContentView(R.layout.menu_grupo)
    }

    fun Registrargrupo(view: View) {
        val builder = AlertDialog.Builder(this)
        val inflater = layoutInflater
        val dialogLayout = inflater.inflate(R.layout.popup_registrargrupo, null)
        builder.setView(dialogLayout)
        builder.setPositiveButton("Aceptar", DialogInterface.OnClickListener(function = positiveButtonClickCrearGrup))
        builder.setNegativeButton("Cancelar", DialogInterface.OnClickListener(function = negativeButtonClick))
        builder.show()

    }

    val positiveButtonClickModGrup = { dialog: DialogInterface, which: Int ->
        Toast.makeText(applicationContext,
            android.R.string.yes, Toast.LENGTH_SHORT).show()
        setContentView(R.layout.menu_grupo)
    }

    fun Modificargrupo(view: View) {
        val builder = AlertDialog.Builder(this)
        val inflater = layoutInflater
        val dialogLayout = inflater.inflate(R.layout.popup_modificargrupo, null)
        builder.setView(dialogLayout)
        builder.setPositiveButton("Aceptar", DialogInterface.OnClickListener(function = positiveButtonClickModGrup))
        builder.setNegativeButton("Cancelar", DialogInterface.OnClickListener(function = negativeButtonClick))
        builder.show()

    }

    val positiveButtonClickCrearCuenta = { dialog: DialogInterface, which: Int ->
        Toast.makeText(applicationContext,
            android.R.string.yes, Toast.LENGTH_SHORT).show()
        setContentView(R.layout.iniciar_sesion)
    }

    fun Crearcuenta(view: View) {
        val builder = AlertDialog.Builder(this)
        val inflater = layoutInflater
        val dialogLayout = inflater.inflate(R.layout.popup_crearcuenta, null)
        builder.setView(dialogLayout)
        builder.setPositiveButton("Aceptar", DialogInterface.OnClickListener(function = positiveButtonClickCrearCuenta))
        builder.setNegativeButton("Cancelar", DialogInterface.OnClickListener(function = negativeButtonClick))
        builder.show()

    }

    val positiveButtonClickEditarUser = { dialog: DialogInterface, which: Int ->
        Toast.makeText(applicationContext,
            android.R.string.yes, Toast.LENGTH_SHORT).show()
        setContentView(R.layout.usuario_menu)
    }

    fun Editarusuario(view: View) {
        val builder = AlertDialog.Builder(this)
        val inflater = layoutInflater
        val dialogLayout = inflater.inflate(R.layout.popup_edituser, null)
        builder.setView(dialogLayout)
        builder.setPositiveButton("Aceptar", DialogInterface.OnClickListener(function = positiveButtonClickEditarUser))
        builder.setNegativeButton("Cancelar", DialogInterface.OnClickListener(function = negativeButtonClick))
        builder.show()

    }


}