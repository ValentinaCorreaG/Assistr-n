package com.example.taller1

class Reto4 {
}
class MenuItem(val name: String, val description: String, var price: Double) {
    override fun toString(): String {
        return "$name - $description - \$${String.format("%.2f", price)}"
    }
}

class MenuCategory(val categoryName: String) {
    private val items: MutableList<MenuItem> = mutableListOf()

    fun addItem(name: String, description: String, price: Double) {
        items.add(MenuItem(name, description, price))
    }

    fun removeItem(index: Int) {
        if (index in 0 until items.size) {
            items.removeAt(index)
        } else {
            println("Índice fuera de rango.")
        }
    }

    fun updateItem(index: Int, name: String, description: String, price: Double) {
        if (index in 0 until items.size) {
            items[index] = MenuItem(name, description, price)
        } else {
            println("Índice fuera de rango.")
        }
    }

    fun getItems(): List<MenuItem> {
        return items
    }
}

class Restaurant {
    private val categories: MutableList<MenuCategory> = mutableListOf()

    fun addCategory(categoryName: String) {
        categories.add(MenuCategory(categoryName))
    }

    fun addItemToCategory(categoryIndex: Int, name: String, description: String, price: Double) {
        if (categoryIndex in 0 until categories.size) {
            categories[categoryIndex].addItem(name, description, price)
        } else {
            println("Índice de categoría fuera de rango.")
        }
    }

    fun removeItemFromCategory(categoryIndex: Int, itemIndex: Int) {
        if (categoryIndex in 0 until categories.size) {
            categories[categoryIndex].removeItem(itemIndex)
        } else {
            println("Índice de categoría fuera de rango.")
        }
    }

    fun updateItemInCategory(categoryIndex: Int, itemIndex: Int, name: String, description: String, price: Double) {
        if (categoryIndex in 0 until categories.size) {
            categories[categoryIndex].updateItem(itemIndex, name, description, price)
        } else {
            println("Índice de categoría fuera de rango.")
        }
    }

    fun printMenu() {
        for ((index, category) in categories.withIndex()) {
            println("${index + 1}. ${category.categoryName}")
            for ((itemIndex, item) in category.getItems().withIndex()) {
                println("   ${itemIndex + 1}. $item")
            }
            println()
        }
    }
}

fun main() {
    val restaurant = Restaurant()

    restaurant.addCategory("Entradas")
    restaurant.addCategory("Platos Fuertes")
    restaurant.addCategory("Postres")
    restaurant.addCategory("Bebidas")

    restaurant.addItemToCategory(0, "Ensalada César", "Lechuga romana, crutones, queso parmesano y aderezo César.", 8.99)
    restaurant.addItemToCategory(1, "Spaghetti a la Boloñesa", "Pasta de spaghetti con salsa boloñesa y queso parmesano.", 12.99)
    restaurant.addItemToCategory(2, "Cheesecake", "Postre de queso cremoso con base de galleta.", 6.99)
    restaurant.addItemToCategory(3, "Limonada", "Limonada fresca y refrescante.", 2.99)

    println("Menú del restaurante:")
    restaurant.printMenu()

    restaurant.updateItemInCategory(1, 0, "Lasaña", "Capas de pasta, salsa boloñesa, queso ricotta y mozzarella.", 14.99)

    restaurant.removeItemFromCategory(2, 0)

    println("\nMenú actualizado:")
    restaurant.printMenu()
}