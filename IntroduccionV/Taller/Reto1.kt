package IntroduccionV.Taller

class Reto1 {
}
fun notificaciones(noti:Int){
    if (noti < 100){
        println("Usted tiene $noti notificaciones")
    }
    else if (noti == 0){
        println("Usted no tiene notificaciones")
    }
    else
    {
        println("Usted tiene 99+ notificaciones")
    }
}

fun main(){
    notificaciones(10)
    notificaciones((100))
    notificaciones(0)
}