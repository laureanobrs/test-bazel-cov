package sample

// NumberEvaluatorTest.kt
import sample.NumberEvaluator
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.junit.Test

@RunWith(JUnit4::class)
class NumberEvaluatorTest {

  private val evaluator = NumberEvaluator()

  @Test
  fun `when number is zero then returns 'Is zero'`() {
    evaluator.evaluate(0)
  }

  @Test
  fun `when number is one then returns 'A one'`() {
    evaluator.evaluate(1)
  }

  @Test
  fun `when number is one then returns 'A Two'`() {
    evaluator.evaluate(2)
  }

}
