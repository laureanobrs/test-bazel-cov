package sample

// NumberEvaluator.kt
class NumberEvaluator2 {
    fun evaluate(number: Int): String {
        return when (number) {
            0 -> "Is zero"
            1 -> "A one"
            else -> "Another number"
        }
    }
}
