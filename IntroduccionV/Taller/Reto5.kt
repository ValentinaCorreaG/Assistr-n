package IntroduccionV.Taller

class Reto5 {
}
class Nequi {
    var usuario:Long
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var contraseña:Int
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var saldo:Double
        get() {
            return field
        }
        set(value) {
            field = value
        }
    constructor(usuario:Long, contraseña:Int, saldo:Double) {
        this.usuario = usuario
        this.contraseña = contraseña
        this.saldo = saldo
    }
    fun crear_cuenta() {
        println("Para crear su cuenta por favor ingrese su numero de celular")
        this.usuario = readLine()!!.toLong()
        println("Y tambien ingrese una clave de 4 digitos")
        this.contraseña = readLine()!!.toInt()
        this.saldo = 4500.0
        acceder_cuenta(0)
    }
    fun acceder_cuenta(intentos:Int) {
        if (intentos < 4) {
            println("Para acceder a su cuenta por favor ingrese su numero de celular")
            var celular:Long = readLine()!!.toLong()
            println("Por favor ingrese su clave")
            var clave:Int = readLine()!!.toInt()
            if (this.usuario == celular && this.contraseña == clave) {
                inicio()
            } else {
                var intentos_dispo:Int = 4-(intentos+1)
                println("¡Upps! Parece que tus datos de acceso son incorrectos tienes " + intentos_dispo + " intentos disponibles")
                acceder_cuenta(intentos+1)
            }
        } else {
            println("Parece que exediste el numero de intentos, debes utilizar otra cuenta")
        }
    }
    fun inicio() {
        println("¡Bienvenido!")
        println("Su saldo es: " + this.saldo)
        println("Escriba el numero de la accion que desea realizar:")
        println("1:Sacar dinero")
        println("2:Enviar dinero")
        println("3:Recargar cuenta")
        println("4:Salir")
        var seleccion:Int = readLine()!!.toInt()
        if (seleccion == 1) {
            Sacar()
        } else if (seleccion == 2) {
            Enviar()
        } else if (seleccion == 3) {
            Recargar()
        } else if (seleccion == 4) {
            println("¡Hasta pronto!")
        } else {
            println("¡Upps! Parece que la opccion seleccionada no es valida ¡Redirigiendote al inicio!")
            inicio()
        }
    }
    fun Sacar() {
        if (this.saldo < 2000) {
            println("No tienes suficiente saldo para retirar dinero")
        } else {
            println("Escoje el metodo de retiro:")
            println("1:Cajero")
            println("2:Punto Fisico")
            var metodo:Int = readLine()!!.toInt()
            if (metodo == 1) {
                println("¡Seleccionaste cajero!")
                println("Ingresa el monto que desea retirar:")
                var monto:Double = readLine()!!.toDouble()
                if (monto > this.saldo) {
                    println("No puedes retirar mas dinero del que tienes en tu cuenta")
                    inicio()
                } else {
                    println("Utiliza este codigo para retirar en el cajero: " + (100000..999999).shuffled().last())
                    println("Preciona 1 para volver al inicio o 2 para salir")
                    var seleccion:Int = readLine()!!.toInt()
                    if (seleccion == 1) {
                        inicio()
                    } else {
                        println("¡Hasta pronto!")
                    }
                }
            } else if (metodo == 2) {
                println("¡Seleccionaste Punto fisico!")
                println("Ingresa el monto que desea retirar:")
                var monto:Double = readLine()!!.toDouble()
                if (monto > this.saldo) {
                    println("No puedes retirar mas dinero del que tienes en tu cuenta")
                    inicio()
                } else {
                    println("Brinda este codigo a la persona que te atienda en el punto fisico: " + (100000..999999).shuffled().last())
                    println("Preciona 1 para volver al inicio o 2 para salir")
                    var seleccion:Int = readLine()!!.toInt()
                    if (seleccion == 1) {
                        inicio()
                    } else {
                        println("¡Hasta pronto!")
                    }
                }
            } else {
                println("¡Upps! Parece que la opccion seleccionada no es valida ¡Redirigiendote al inicio!")
                inicio()
            }
        }
    }
    fun Enviar() {
        println("Ingresa el numero al que deseas enviar el dinero:")
        var numero:Long = readLine()!!.toLong()
        println("Ingresa el valor que deseas enviar:")
        var valor:Int = readLine()!!.toInt()
        if (valor > this.saldo) {
            println("¡Upps! Parece que no tienes suficiente saldo ¡Redirigiendote al inicio!")
            inicio()
        } else if (valor > 0) {
            println("¿Esta seguro/a que desea enviar " + valor + " al " + numero + " ?")
            println("1:Si")
            println("2:No")
            var seleccion:Int = readLine()!!.toInt()
            if (seleccion == 1) {
                println("Se ha enviado " + valor + " al " + numero)
                this.saldo = this.saldo - valor
                inicio()
            } else if (seleccion == 2) {
                println("Envio cancelado ¡Redirigiendote al inicio!")
                inicio()
            } else {
                println("¡Upps! Parece que la opccion seleccionada no es valida ¡Redirigiendote al inicio!")
                inicio()
            }
        } else {
            println("¡Upps! No puedes enviar dinero negativo xd ¡Redirigiendote al inicio!")
            inicio()
        }
    }
    fun Recargar() {
        println("Ingresa el valor que deseas recargar:")
        var valor:Int = readLine()!!.toInt()
        println("¿Esta seguro que desea recargar " + valor + "?")
        println("1:Si")
        println("2:No")
        var seleccion:Int = readLine()!!.toInt()
        if (seleccion == 1) {
            println("¡Se ha recargado " + valor + " a su cuenta!")
            this.saldo = this.saldo + valor
            inicio()
        } else if (seleccion == 2) {
            println("Recarga cancelada ¡Redirigiendote al inicio!")
        } else {
            println("¡Upps! Parece que la opccion seleccionada no es valida ¡Redirigiendote al inicio!")
            inicio()
        }
    }
}

fun main(){
    val nequi1 = Nequi(0,0,0.0)
    nequi1.crear_cuenta()
}