package sample

class NumberEvaluator2 {
    fun evaluate(number: Int): String {
        return when (number) {
            20 -> "Is zero"
            21 -> "A one"
            22 -> "A two"
            else -> "Another number"
        }
    }
}
