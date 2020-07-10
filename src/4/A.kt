import java.lang.Integer.parseInt

fun main() {
    val w = parseInt(readLine())

    val dividable = when {
        w <= 3 -> false
        w.rem(2) != 0 -> false
        else -> true
    }

    println(if (dividable) "YES" else "NO")
}