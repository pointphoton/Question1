import junit.framework.Assert.assertNotSame
import junit.framework.Assert.assertTrue
import org.hamcrest.CoreMatchers.*
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.greaterThanOrEqualTo
import org.hamcrest.Matchers.lessThan
import org.hamcrest.collection.IsIterableContainingInOrder.contains;
import org.hamcrest.core.IsNot
import org.junit.Test

class TestMain {

    /*
    Range test
    The result of the method should be greater than or equal to 1
    * */
    @Test
    fun rollDiceRangeGreaterThanOrEqualToOne() {
        var list = mutableListOf<Int>()
        repeat(100) {
            list.add(rollDice())
        }
        assertThat(
            "Unexpected dice number is generated. The number is less than One!",
            list,
            everyItem(greaterThanOrEqualTo(1))
        );
    }

    /*
   Range test
   The result of the method should be less than 7
   * */
    @Test
    fun rollDiceRangeLessThanSeven() {
        var list = mutableListOf<Int>()
        repeat(100) {
            list.add(rollDice())
        }
        assertThat(
            "Unexpected dice number is generated. The number is greater than Six!",
            list,
            everyItem(lessThan(7))
        );
    }


    /**
     * We are rolling the dice 100 times.
     * We are expected that each the numbers should be included in the list at least once.
     *
     */
    @Test
    fun isRollDiceProduceAllNumbers() {
        val hundredItems = mutableListOf<Int>()
        repeat(100) {
            hundredItems.add(rollDice())
        }
        assertThat("One of the dice number(s) is not generated.", hundredItems, hasItems(1, 2, 3, 4, 5, 6))
    }

}