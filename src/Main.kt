import sorting_and_searching.*

fun main() {
    executeMergeSort()
    executeQuickSort()
}

fun executeMergeSort() {
    val array = intArrayOf(3, 2, 1, 5, 4)
    mergeSort(array)
    println(array.contentToString())
}

fun executeQuickSort() {
    val array = intArrayOf(3, 2, 1, 5, 4)
    quickSort(array, 0, array.size - 1)
    println(array.contentToString())
}
