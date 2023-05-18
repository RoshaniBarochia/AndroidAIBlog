import java.util.Arrays

class GenericKotlinDemo {
}

/**
 * Generic function demo
 * create generic function sortArray
 * pass and return any data type of array*/
fun <T : Comparable<T>> sortArray(array: Array<T>) {
    Arrays.sort(array)
}
fun main(){
    /** pass integer datatype*/
    val array = arrayOf(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5)
    sortArray(array)

    /** pass String datatype*/
    val arrayStr = arrayOf("apple", "banana", "cherry", "date", "elderberry")
    sortArray(arrayStr)

}