fun main() {

    var array = arrayListOf(2,10,2,8,3,0,1,5,3,8,7);// 1, 5, 2, 7, 93, 8, 9, 3 // 1,10,2,8,3,4,11,7 // 7,8,1,3,10,6,3,5,1
    array = sadArrayToHappy(array);
    println(array)
}

fun sadArrayToHappy(oldArray: ArrayList<Int>, index: Int = 1): ArrayList<Int> {
    var array = oldArray

    if (index != 0 && index != array.lastIndex) {
        if (array[index] > (array[index - 1] + array[index + 1])) {
            array.removeAt(index)//.toTypedArray()
            array = sadArrayToHappy(array, index-1)
        }
        else array = sadArrayToHappy(array, index+1)
    }else if(index == 0){
        if (array[index] > array[index + 1]) {
            array.removeAt(index)//.toTypedArray()
        }
        else array = sadArrayToHappy(array, index+1)
    }else{
        if (array[index] > array[index - 1]) {
            array.removeAt(index)//.toTypedArray()
        }
    }

    return array
}