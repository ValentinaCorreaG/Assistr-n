package com.example.taller1

class Reto3 {
}

class Item(var nombre: String, var precio: Double) {

}

fun apuesta(item:Item){
    println("Estamos ahora ofreciendo el " + item.nombre + " a tan solo " + item.precio)
    println("¡Quiero oir a los interesados! (si no hay interesados, oferte 0.0)")
    var oferta:Double = readln().toDouble()

    while (true){
        if (oferta == 0.0){
            println("Vendido a la casa por su precio mínimo de " + item.precio)
            break
        }
        while (oferta < item.precio){
            println("No se aceptan precios menores al precio mínimo, oferte de nuevo")
            oferta = readln().toDouble()
        }
        println("¿Más interesados? (si no hay más interesados, oferte 0.0)")
        var oferta2:Double = readln().toDouble()
        if (oferta2 < oferta){
            println("¡Vendido por " + oferta + " !")
            break
        } else if (oferta2 > oferta){
            oferta = oferta2
        }
    }

}

fun main(){
    val casa:Item = Item("casa", 12.3)
    apuesta(casa)
}