import java.io.BufferedReader
import java.io.FileReader

fun main() {
    val buffer = BufferedReader(FileReader("data.txt"))
    val chars = CharArray(30)
    try {
        buffer.read(chars, 0, 40)
    } finally {
        println("Closing")
        buffer.close()
    }
}