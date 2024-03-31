package IntroduccionV.Taller

class Reto2 {
}

class Album(val type: String) {
    private val songs: MutableList<Song> = mutableListOf()

    fun addSong(title: String, artist: String, releaseYear: Int, playCount: Int) {
        songs.add(Song(title, artist, releaseYear, playCount))
    }

    fun getMostPopularSong(): Song? {
        return songs.maxByOrNull { it.playCount }
    }

    fun getLeastPopularSongs(): List<Song> {
        return songs.filter { it.playCount < 1000 }
    }

    fun printSongDescriptions() {
        songs.forEach { song ->
            println("${song.title}, interpretada por ${song.artist}, se lanzó en ${song.releaseYear}, cantidad de reproducciones: ${song.playCount}")
        }
    }

    data class Song(val title: String, val artist: String, val releaseYear: Int, val playCount: Int)
}

fun main() {
    val album = Album("Rock")

    print("Cuántas canciones tiene este álbum? ")
    val songCount = readLine()?.toIntOrNull() ?: 0

    for (i in 1..songCount) {
        print("Ingrese el título de la canción $i: ")
        val title = readLine() ?: ""
        print("Ingrese el artista de la canción $i: ")
        val artist = readLine() ?: ""
        print("Ingrese el año de lanzamiento de la canción $i: ")
        val releaseYear = readLine()?.toIntOrNull() ?: 0
        print("Ingrese el recuento de reproducciones de la canción $i: ")
        val playCount = readLine()?.toIntOrNull() ?: 0

        album.addSong(title, artist, releaseYear, playCount)
    }

    println("\nLa canción más popular del álbum es:")
    val mostPopularSong = album.getMostPopularSong()
    mostPopularSong?.let {
        println("${it.title}, interpretada por ${it.artist}, se lanzó en ${it.releaseYear}, cantidad de reproducciones: ${it.playCount}")
    } ?: println("No hay canciones en el álbum.")

    println("\nLas canciones poco populares del álbum son:")
    val leastPopularSongs = album.getLeastPopularSongs()
    if (leastPopularSongs.isNotEmpty()) {
        leastPopularSongs.forEach { song ->
            println("${song.title}, interpretada por ${song.artist}, se lanzó en ${song.releaseYear}, cantidad de reproducciones: ${song.playCount}")
        }
    } else {
        println("No hay canciones poco populares en el álbum.")
    }

    println("\nDescripciones de todas las canciones del álbum:")
    album.printSongDescriptions()
}