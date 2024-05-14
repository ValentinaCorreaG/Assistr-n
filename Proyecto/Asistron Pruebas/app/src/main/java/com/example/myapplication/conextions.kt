package com.example.myapplication
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.LinearLayout
import android.widget.Button
import android.widget.TextView

// Danny

class conextions : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inicio)
        val notifi_Menu = findViewById<LinearLayout>(R.id.noti)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.menu_notificaciones)
        }
    }
}

class Noti_vernoti : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_notificaciones)
        val notifi_Menu = findViewById<LinearLayout>(R.id.ver_noti)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.ver_notificaciones)
        }
    }
}


class Vernoti_torneo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ver_notificaciones)
        val notifi_Menu = findViewById<LinearLayout>(R.id.ver_torneo)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.ver_torneo_mariposa)
        }
    }
}

class Noti_modnoti : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_notificaciones)
        val notifi_Menu = findViewById<LinearLayout>(R.id.modificar_noti)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.modificar_notificaciones)
        }
    }
}

class Modnoti_torneo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.modificar_notificaciones)
        val notifi_Menu = findViewById<LinearLayout>(R.id.modificar_torneo)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.editar_torneo_mariposa)
        }
    }
}
class EditarUsuario: ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.buscando_usuario)
        val editar = findViewById<LinearLayout>(R.id.EditarUser)
        editar.setOnClickListener{
            setContentView(R.layout.editar_usuario)
        }
    }
}
class Noti_añnoti : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_notificaciones)
        val notifi_Menu = findViewById<LinearLayout>(R.id.añadir_noti)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.crear_notificacion)
        }
    }
}

class Volvermenu_noti : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.editar_torneo_mariposa)
        val notifi_Menu = findViewById<Button>(R.id.volver_noti)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.menu_notificaciones)
        }
    }
}

class Volvermenu_incio : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_notificaciones)
        val notifi_Menu = findViewById<Button>(R.id.volver_inicio)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.inicio)
        }
    }
}

class Inicio_asist : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inicio)
        val notifi_Menu = findViewById<LinearLayout>(R.id.asist)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.menu_asistencia)
        }
    }
}

class Asist_verasist : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_asistencia)
        val notifi_Menu = findViewById<LinearLayout>(R.id.ver_asist)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.ver_asistencias)
        }
    }
}

class Verasist_aprendiendover : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ver_asistencias)
        val notifi_Menu = findViewById<LinearLayout>(R.id.aprendiendo_ver)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.aprendiendo_nadar_ver)
        }
    }
}

class Aprendiendover_aprendiendovermartes09 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aprendiendo_nadar_ver)
        val notifi_Menu = findViewById<LinearLayout>(R.id.aprendiendo_vermares09)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.aprendiendo_nadar_ver_martes09)
        }
    }
}

class Asist_modasist : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_asistencia)
        val notifi_Menu = findViewById<LinearLayout>(R.id.mod_asist)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.modificar_asistencias)
        }
    }
}

class Modasist_modaprendiendo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.modificar_asistencias)
        val notifi_Menu = findViewById<LinearLayout>(R.id.mod_aprendiendo)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.aprendiendo_nadar_modificar)
        }
    }
}

class Modaprendiendo_modaprendiendomartes : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aprendiendo_nadar_modificar)
        val notifi_Menu = findViewById<LinearLayout>(R.id.mod_aprendiendomartes)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.aprendiendo_nadar_modificar_martes09)
        }
    }
}

class Asist_añasist : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_asistencia)
        val notifi_Menu = findViewById<LinearLayout>(R.id.añ_asist)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.crear_asistencia)
        }
    }
}

class Añasist_añaprendiendo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.crear_asistencia)
        val notifi_Menu = findViewById<LinearLayout>(R.id.añ_aprendiendo)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.aprendiendo_nadar_crear)
        }
    }
}

class Volvermenu_asist : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ver_asistencias)
        val notifi_Menu = findViewById<Button>(R.id.volver_asist)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.menu_asistencia)
        }
    }
}

// Vale

class volverButtonClicked : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.buscar_grupo)
        val botonVolver = findViewById<Button>(R.id.volver)
        botonVolver.setOnClickListener {
            onBackPressed()
        }
    }
}

class Añadir_Grupo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_grupo)
        val botonAñadir_g = findViewById<LinearLayout>(R.id.menu_mas)
        botonAñadir_g.setOnClickListener {
            setContentView(R.layout.nuevo_grupo)
        }
    }
}
class boton_busqueda : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bucando_grupo)
        val botonBuscar = findViewById<Button>(R.id.boton_busca)
        botonBuscar.setOnClickListener {
            setContentView(R.layout.buscar_grupo)
        }
    }
}
class boton_modificar_grup : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_grupo)
        val botonModifi = findViewById<LinearLayout>(R.id.menu_mod)
        botonModifi.setOnClickListener {
            setContentView(R.layout.editar_grupo_activo)
        }
    }
}

class Buscar_Grupo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_grupo)
        val botonBusca = findViewById<LinearLayout>(R.id.menu_buscar)
        botonBusca.setOnClickListener {
            setContentView(R.layout.bucando_grupo)
        }
    }
}

class Ver_Grupo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_grupo)
        val botonVer = findViewById<LinearLayout>(R.id.menu_ver)
        botonVer.setOnClickListener {
            setContentView(R.layout.ver_grupo)
        }
    }
}

// Saris

class horariom_horariov : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.horario_menu)
        val notifi_Menu = findViewById<LinearLayout>(R.id.verHorario)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.ver_horario)
        }
    }

}



class horariom_horarioc : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.horario_menu)
        val notifi_Menu = findViewById<LinearLayout>(R.id.crearHorario)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.crear_horario)
        }
    }

}

class Volvermenu_h : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ver_horario)
        val notifi_Menu = findViewById<Button>(R.id.volverHorario)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.horario_menu)
        }
    }

}

class Ver_semillero : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ver_horario)
        val notifi_Menu = findViewById<LinearLayout>(R.id.ver_semillero)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.semillero_ejemplo)
        }
    }
}



class registroC: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registro_usuario)
        val notifi_Menu = findViewById<TextView>(R.id.button_login)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.registro_clave)
        }
    }
}

class Buscar_Perfil : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.usuario_menu)
        val buscausuario = findViewById<LinearLayout>(R.id.perfilV)
        buscausuario.setOnClickListener {
            setContentView(R.layout.buscar_usuario)
        }
    }
}


class usuariom_usuarioe: ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.usuario_menu)
        val notifi_Menu = findViewById<LinearLayout>(R.id.perfilE)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.registro_usuario)
        }
    }
}


//


class Inicio_grupo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inicio)
        val notifi_Menu = findViewById<LinearLayout>(R.id.grupo)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.menu_grupo)
        }
    }
}

class Asist_reporte : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_asistencia)
        val notifi_Menu = findViewById<LinearLayout>(R.id.reporte)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.generar_repo)
        }
    }
}


class Inicio_horarios : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inicio)
        val notifi_Menu = findViewById<LinearLayout>(R.id.horarios)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.horario_menu)
        }
    }
}
class Inicio_usuarios : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inicio)
        val notifi_Menu = findViewById<LinearLayout>(R.id.buscarusuarios)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.usuario_menu)
        }
    }
}
class Inicio_miperfil : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inicio)
        val notifi_Menu = findViewById<LinearLayout>(R.id.miperfil)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.perfiladmin)
        }
    }
}

class Inicio_iniciarsesion : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inicio)
        val notifi_Menu = findViewById<Button>(R.id.cerarsesion)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.iniciar_sesion)
        }
    }
}

class Iniciarsesion : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.iniciar_sesion)
        val notifi_Menu = findViewById<Button>(R.id.irinicio)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.inicio)
        }
    }
}

class Presentacion_iniciarsesion : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.presentacion)
        val notifi_Menu = findViewById<Button>(R.id.iniciar)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.iniciar_sesion)
        }
    }
}

class Registroclave_iniciosesion : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registro_clave)
        val notifi_Menu = findViewById<Button>(R.id.cancelarcontra)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.iniciar_sesion)
        }
    }
}

class Registrousuario_menusuario : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registro_usuario)
        val notifi_Menu = findViewById<Button>(R.id.cancelarcontra)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.usuario_menu)
        }
    }
}

class Buscaruser_buscandousuario : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.buscar_usuario)
        val notifi_Menu = findViewById<Button>(R.id.buscando_usuarios)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.buscando_usuario)
        }
    }
}

class Inicio_buscarusuarios : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inicio)
        val notifi_Menu = findViewById<LinearLayout>(R.id.buscarusuarios)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.buscar_usuario)
        }
    }
}

class Registro_usuario : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registro_usuario)
        val notifi_Menu = findViewById<LinearLayout>(R.id.cancelarcontra)
        notifi_Menu.setOnClickListener {
            setContentView(R.layout.inicio)
        }
    }
}