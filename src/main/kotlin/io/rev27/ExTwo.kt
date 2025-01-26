package io.rev27

data class Foo(val x: Int, val y: Int)

class ExTwo {
    companion object {
        fun doCalc(foo: Foo): Int {
            return foo.x * foo.y
        }
    }
}