
fun main() {
    val str = "Two driven jocks help fax my big quiz"
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val upper = str.uppercase()
    var isPangram = true

    for (char in alphabet) {
        if (char !in upper) {
            isPangram = false
            break
        }
    }

    val pangramOrNot = if (isPangram) "A pangram" else "Not a pangram"
    println(pangramOrNot)
}