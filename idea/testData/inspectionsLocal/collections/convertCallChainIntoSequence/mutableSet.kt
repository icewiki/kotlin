// WITH_RUNTIME

fun test(): List<Int> {
    return mutableSetOf(1, 2, 3).<caret>filter { it > 1 }.map { it * 2 }
}