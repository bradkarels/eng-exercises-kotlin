package io.rev27.core

object Minimus {
    // An implimentation of min as an exercise.
    fun min(a: List<Int>): Int {
        var smallest = a.first()
        for (i in a.drop(1)) {
            if (i < smallest) smallest = i
        }
        return smallest
    }
}
