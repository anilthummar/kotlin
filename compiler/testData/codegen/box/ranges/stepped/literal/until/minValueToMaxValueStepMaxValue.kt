// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    val intList = mutableListOf<Int>()
    for (i in Int.MIN_VALUE until Int.MAX_VALUE step Int.MAX_VALUE) {
        intList += i
    }
    assertEquals(listOf(Int.MIN_VALUE, -1, Int.MAX_VALUE - 1), intList)

    val longList = mutableListOf<Long>()
    for (i in Long.MIN_VALUE until Long.MAX_VALUE step Long.MAX_VALUE) {
        longList += i
    }
    assertEquals(listOf(Long.MIN_VALUE, -1L, Long.MAX_VALUE - 1), longList)

    return "OK"
}