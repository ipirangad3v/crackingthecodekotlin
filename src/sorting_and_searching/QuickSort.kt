package sorting_and_searching

fun quickSort(array: IntArray, left: Int, right: Int) {
    val index = partition(array, left, right)
    if (left < index - 1) {
        quickSort(array, left, index - 1)
    }
    if (index < right) {
        quickSort(array, index, right)
    }
}

private fun partition(array: IntArray, left: Int, right: Int): Int {
    val pivot = array[(left + right) / 2]
    var i = left
    var j = right
    while (i <= j) {
        while (array[i] < pivot) {
            i++
        }
        while (array[j] > pivot) {
            j--
        }
        if (i <= j) {
            val temp = array[i]
            array[i] = array[j]
            array[j] = temp
            i++
            j--
        }
    }
    return i
}
