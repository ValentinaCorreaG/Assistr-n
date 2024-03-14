package IntroduccionV

class Personas {
    /*Atributos*/
    var nombre: String = ""
    var edad: Int = 0
    var estatura: Double = 0.0
    var sexo: String = ""

    constructor(nombre: String, estatura: Double, sexo: String, edad: Int) {
        this.nombre = nombre
        this.estatura = estatura
        this.sexo = sexo
        this.edad = edad
    }

    constructor() // Constructor vacío para permitir la creación de objetos sin datos

    fun pedirDatos() {
        println("Por favor ingrese su nombre")
        nombre = readLine().toString()
        println("Por favor ingrese su edad")
        edad = readLine()?.toInt() ?: 0 // Manejo de posibles entradas inválidas
        println("Por favor ingrese su estatura")
        estatura = readLine()?.toDouble() ?: 0.0 // Manejo de posibles entradas inválidas
        println("Por favor ingrese su sexo")
        sexo = readLine().toString()
    }
}

fun main() {
    var persona1 = Personas()
    persona1.pedirDatos()
    println("Nombre: ${persona1.nombre}")
    println("Edad: ${persona1.edad}")
    println("Estatura: ${persona1.estatura}")
    println("Sexo: ${persona1.sexo}")
}
