package io.rev27.core

data class Node<T>(var value: T, var next: Node<T>? = null) {
    override fun toString(): String {
        return if (next == null) "$value"
        else "$value -> ${next.toString()}"
    }
}

