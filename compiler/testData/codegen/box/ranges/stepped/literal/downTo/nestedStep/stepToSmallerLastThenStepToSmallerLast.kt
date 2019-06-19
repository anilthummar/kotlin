// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    val intList = mutableListOf<Int>()
    for (i in 10 downTo 1 step 2 step 3) {
        intList += i
    }
    assertEquals(listOf(10, 7, 4), intList)

    val longList = mutableListOf<Long>()
    for (i in 10L downTo 1L step 2L step 3L) {
        longList += i
    }
    assertEquals(listOf(10L, 7L, 4L), longList)

    val charList = mutableListOf<Char>()
    for (i in 'j' downTo 'a' step 2 step 3) {
        charList += i
    }
    assertEquals(listOf('j', 'g', 'd'), charList)

    return "OK"
}