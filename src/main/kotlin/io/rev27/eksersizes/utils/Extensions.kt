package io.rev27.eksersizes.utils

object Extensions {
}

infix fun String.example(function: () -> Unit) {
    println("---Example of $this---")
    function()
    println()
}