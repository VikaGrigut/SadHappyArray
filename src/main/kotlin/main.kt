fun main() {
    //val array = arrayListOf(1, 2, 2, 9, 93, 2, 6, 8, 6, 12);//1, 2, 2, 2, 6, 8, 6, 12
    //val array = arrayListOf(20, 16, 19, 1, 16, 3, 1, 14, 9, 14, 19);//20, 16, 1, 1, 9, 14, 19
    //val array = arrayListOf(3, 24, 17, 29, 8, 15, 10, 13, 11, 26, 4);//3, 8, 15, 10, 13, 11, 4
    val array = arrayListOf(22, 22, 8, 1, 2, 18, 9, 30, 12, 2, 25);//22, 22, 8, 1, 2, 2, 25
    sadArrayToHappy(array);
    println(array)
}

fun sadArrayToHappy(oldArray: ArrayList<Int>, index: Int = 1): ArrayList<Int> {
    var array = oldArray

    when(index){
        in 1 until array.lastIndex ->{
            if (array.isElementSad(index)) {
                array.removeAt(index)
                array = sadArrayToHappy(array, index-1)
            }else array = sadArrayToHappy(array, index+1)
        }
        0 -> array = sadArrayToHappy(array, index+1)
    }

    return array
}

fun ArrayList<Int>.isElementSad(index: Int): Boolean{
    return this[index] > (this[index - 1] + this[index + 1])
}