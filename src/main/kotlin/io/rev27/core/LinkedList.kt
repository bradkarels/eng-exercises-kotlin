package io.rev27.core

class LinkedList<T> {
    private var head: Node<T>? = null
    var size = 0

    fun isEmpty() = head == null

    fun nodeAt(idx: Int): Node<T>? {
        var current = head
        var currentIdx = 0

        while (current != null && currentIdx < idx) {
            current = current.next
            currentIdx++
        }
        return current
    }

    fun dropLast()  {
        when (size) {
            0 -> return
            1 -> {
                head = null
                size = 0
            } else -> {
            var current = head
            while (current?.next?.next != null) {
                current = current.next
            }
            current?.next = null
            size--
        }
        }
    }

    fun pop() {
        if (!isEmpty()) {
            val newHead = head?.next
            head = newHead
            size--
        }
    }

    // just append to end if idx too large...
    fun insertAt(idx: Int, value: T) {
        if (isEmpty()) {
            head = Node(value, null)
        } else if (idx > size) {
            this.append(value)
            return
        } else {
            var current = head
            var currentIdx = 0
            while (current != null && currentIdx < idx) {
                current = current.next
                currentIdx++
            }
            val nextAfterCurrent = current?.next // might be null
            val newNode = Node(value, nextAfterCurrent)
            current?.next = newNode
        }
        size++
    }

    fun removeAt(idx: Int) {
        if (idx < size && !isEmpty()) {
            when (idx) {
                0 -> head = head?.next
                1 -> head?.next = head?.next?.next
                else -> {
                    var current = head?.next
                    var currentIdx = 1
                    while (currentIdx + 1 < idx) {
                        current = current?.next
                        currentIdx++
                    }
                    val newNext = current?.next?.next
                    current?.next = newNext
                    size--
                }
            }
        }
    }

    fun push(value: T): LinkedList<T> {
        if (head == null) {
            head = Node(value)
        } else {
            head = Node(value, head)
        }
        size++
        return this
    }

    fun append(v: T) {
        val endNode = Node(v)
        if (head == null) {
            head = endNode
            size++
            return
        } else {
            var n = this.head
            while (n?.next != null) {
                n = n.next
            }
            n?.next = endNode
            size++
        }
    }

    override fun toString(): String {
        return if (isEmpty()) "Empty List"
        else head.toString()
    }
}
