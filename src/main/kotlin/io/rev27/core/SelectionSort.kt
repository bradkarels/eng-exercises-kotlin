package io.rev27.core

// Performs a selection sort on an unordered list of distinct values (no dupes)
object SelectionSort {
    fun selectionSort(ls: List<Int>): List<Int> {
        return doSelectionSort(ls)
    }

    fun doSelectionSort(ls: List<Int>, sorted: List<Int> = listOf()): List<Int> {
        return if (ls.isEmpty()) sorted
        else {
            ls.let {
                val smallest = Minimus.min(it)
                val updated = sorted.plus(smallest)
                val filtered = ls.filterNot { elem -> elem == smallest }
                doSelectionSort(filtered, updated)
            }
        }
    }
}
