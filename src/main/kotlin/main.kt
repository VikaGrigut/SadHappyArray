fun main() {
    val array = intArrayOf(22, 22, 8, 1, 2, 18, 9, 30, 12, 2, 25);//22, 22, 8, 1, 2, 2, 25
    val result = sadArrayToHappy(array)
    println(array)
    println(result)
}

fun sadArrayToHappy(oldArray: IntArray): MutableList<Int> {
    val array:MutableList<Int> = oldArray.toMutableList()
    var index = 1
    while (index < array.size-1) {
        when (index) {
            in 1 until array.lastIndex -> {
                if (array.isElementSad(index)) {
                    array.removeAt(index)
                    index--
                    //continue
                } else index++
            }
            0 -> {
                index++
            }
        }
    }
    return array
}

fun MutableList<Int>.isElementSad(index: Int): Boolean {
    return this[index] > (this[index - 1] + this[index + 1])
}