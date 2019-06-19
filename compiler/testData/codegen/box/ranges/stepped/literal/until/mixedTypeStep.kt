// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    val intList = mutableListOf<Int>()
    for (i in 1.toShort() until 8.toByte() step 2) {
        intList += i
    }
    assertEquals(listOf(1, 3, 5, 7), intList)

    val longList = mutableListOf<Long>()
    for (i in 1L until 8 step 2) {
        longList += i
    }
    assertEquals(listOf(1L, 3L, 5L, 7L), longList)

    return "OK"
}