package com.example.myapplication
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.LinearLayout
import android.widget.Button

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