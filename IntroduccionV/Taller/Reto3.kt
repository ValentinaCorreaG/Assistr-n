package IntroduccionV.Taller

class Reto3 {
}
class Auction(private val minPrice: Double) {
    private val items: MutableMap<String, Double> = mutableMapOf()
    private val bids: MutableMap<String, MutableList<Double>> = mutableMapOf()

    fun addItem(itemName: String, startingPrice: Double) {
        items[itemName] = startingPrice
        bids[itemName] = mutableListOf()
    }

    fun placeBid(itemName: String, bid: Double) {
        if (itemName in items) {
            bids[itemName]?.add(bid)
        } else {
            println("El artículo '$itemName' no está en la subasta.")
        }
    }

    fun closeAuction() {
        for ((itemName, startingPrice) in items) {
            val highestBid = bids[itemName]?.maxOrNull() ?: 0.0
            val winningBid = maxOf(highestBid, minPrice)

            if (highestBid == 0.0) {
                println("El artículo '$itemName' con precio base $startingPrice fue vendido a la casa de subastas por $$minPrice.")
            } else {
                println("El artículo '$itemName' con precio base $startingPrice fue vendido por $$winningBid.")
            }
        }
    }
}

fun main() {
    val auction = Auction(100.0) // Precio mínimo de la casa de subastas

    // Agregar artículos a la subasta
    auction.addItem("Pintura al óleo", 200.0)
    auction.addItem("Escultura de bronce", 500.0)
    auction.addItem("Antigüedad romana", 1000.0)

    // Recibir ofertas para cada artículo
    auction.placeBid("Pintura al óleo", 250.0)
    auction.placeBid("Pintura al óleo", 300.0)
    auction.placeBid("Escultura de bronce", 600.0)
    auction.placeBid("Antigüedad romana", 1200.0)
    auction.placeBid("Antigüedad romana", 1500.0)

    // Cerrar la subasta y anunciar los ganadores
    auction.closeAuction()
}