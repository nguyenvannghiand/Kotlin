import java.lang.StringBuilder

fun main() {
    var sb = StringBuilder("Obama Putin")
    println(sb.toString())
    sb.insert(5, " Kim Jong Un")
    println(sb.toString())
    sb.append(" Donal Trump")
    println(sb.toString())
    sb.reverse()
    println(sb.toString())
}