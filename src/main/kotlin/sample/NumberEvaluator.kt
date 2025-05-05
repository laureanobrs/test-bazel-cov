package sample

// NumberEvaluator.kt
class NumberEvaluator {
    fun evaluate(number: Int): String {
        return when (number) {
            0 -> "Is zero"
            1 -> "A one"
            2 -> "A two"
            3 -> "A three"
            4 -> "Just to see if there's no codecov message in PR"
            else -> "Other number"
        }
    }
}
