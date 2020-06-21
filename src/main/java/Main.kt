fun main() {
    print("hello ${rollDice()}");
//    rollDice()
}

fun rollDice(): Int {
    return System.nanoTime().rem(6).plus(1).toInt()
}