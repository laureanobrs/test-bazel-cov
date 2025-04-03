package sample

// NumberEvaluator.kt
class NumberEvaluator {
    inline fun evaluate(number: Int): String {
        return when (number) {
            0 -> "Is zero"
            1 -> "A one"
            else -> "Another number"
        }
    }
}
