package IntroduccionV
class Calculadora {
}
fun suma(num1:Double, num2:Double){
    println("la suma es " + (num1+num2))
}
fun resta(num1:Double, num2:Double){
    println("la resta es " + (num1- num2))
}
fun multi (num1:Double, num2:Double){
    println("la multiplicación es: " + (num1*num2))
}

fun main(){
    println("Digite dos números")
    var num1:Double=readLine()!!.toDouble()
    var num2:Double=readLine()!!.toDouble()
    println("Qué operación quiere hacer, digite 1 para suma, 2 para resta y 3 para multiplicación")
    val valor1 = readLine()!!.toInt()
    if (valor1 ==1){
        suma(num1, num2)
    }
    else if (valor1 == 2){
        resta(num1, num2)
    }else if (valor1 == 3){
        multi(num1, num2)
    }
}