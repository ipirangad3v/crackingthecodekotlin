package sorting_and_searching

fun mergeSort(array: IntArray) {
    val helper = IntArray(array.size)
    mergeSort(array, helper, 0, array.size - 1)

}
private fun mergeSort(array: IntArray, helper: IntArray, low: Int, high: Int) {
    if (low < high) {
        val middle = (low + high) / 2
        mergeSort(array, helper, low, middle) // Sort left half
        mergeSort(array, helper, middle + 1, high) // Sort right half
        merge(array, helper, low, middle, high) // Merge them
    }
}

private fun merge(array: IntArray, helper: IntArray, low: Int, middle: Int, high: Int) {
    // Copy both halves into a helper array
    for (i in low..high) {
        helper[i] = array[i]
    }

    var helperLeft = low
    var helperRight = middle + 1
    var current = low

    // Iterate through helper array. Compare the left and right half, copying back the smaller element from the two halves into the original array
    while (helperLeft <= middle && helperRight <= high) {
        if (helper[helperLeft] <= helper[helperRight]) {
            array[current] = helper[helperLeft]
            helperLeft++
        } else {
            array[current] = helper[helperRight]
            helperRight++
        }
        current++
    }

    // Copy the rest of the left side of the array into the target array
    val remaining = middle - helperLeft
    for (i in 0..remaining) {
        array[current + i] = helper[helperLeft + i]
    }
}
