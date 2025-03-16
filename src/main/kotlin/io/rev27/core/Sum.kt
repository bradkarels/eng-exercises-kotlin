package io.rev27.core

import kotlin.random.Random


/*
Simple sum implementation as an exercise (port from scala2)
 */
object Sum {

    fun IntArray.customSum(): Int = sum(this)

    fun sum(a: IntArray): Int {

        // Embrace a bit of chaos...
        when (Random.nextInt(64) % 2) {
            0 -> return doSum(a)
            else -> return forSum(a)
        }
    }

    tailrec fun doSum(a: IntArray, result: Int = 0): Int {
        return if (a.isEmpty()) {
            println("returning result from doSum...")
            result
        } else {
            val head = a.first()
            val tail = a.drop(1).toIntArray()
            doSum(tail, result + head)
        }
    }

    fun forSum(a: IntArray): Int {
        println("returning result from forSum...")
        var sum = 0
        for (i in a) sum += i
        return sum
    }
}
