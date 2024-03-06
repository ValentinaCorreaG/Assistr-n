
fun suma (a: Double, b:Double) {
    println(a + b)
}
fun resta (a: Double, b:Double) {
    println(a - b)
}
fun multi (a: Double, b:Double) {
    println(a * b)
}
fun main() {
    println("Inserte los numeros que desea operar")
    var a:Double= readLine()!!.toDouble()
    var b:Double= readLine()!!.toDouble()
    println("Inserte 1 para suma, 2 para resta, 3 para multiplicar")
    var c:Int= readLine()!!.toInt()
    if (c == 1) {
        suma(a,b)
    } else if (c == 2) {
        resta(a,b)
    } else {
        multi(a,b)
    }
}