package io.rev27.core

import io.rev27.eksersizes.utils.example

object LinkedListStuff {
    val node2 = Node("two")
    val node1 = Node("one", node2)
    val node0 = Node("zero", node1)

    @JvmStatic
    fun main(args: Array<String>) {
        println(node0.toString())

        "foobarbaz" example {
            val x = 42
            println(x)
        }
    }
}
