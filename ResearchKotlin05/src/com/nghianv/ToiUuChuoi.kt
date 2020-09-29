package com.nghianv

fun toiUu(s: String): String {
    var sTam = s.trim()
    var dsWord = sTam.split(" ")
    var sToiUu = ""
    for (word in dsWord) {
        if (word.length > 0) {
            var wordNew = word.toLowerCase()
            wordNew = wordNew.replaceFirst(wordNew[0] + "", (wordNew[0] + "").toUpperCase())
            sToiUu += wordNew + " "
        }
    }
    return sToiUu
}
fun main() {
    var ten = "         nguyen               VAn AnH     "
    var tenToiUu = toiUu(ten)
    println(tenToiUu)

}