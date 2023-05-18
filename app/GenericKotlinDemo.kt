import java.util.*

/**
 * Generic Class demo*/
class GenericKotlinDemo<T>(val item: T)


/**
 * Generic function demo
 * create generic function sortArray
 * pass and return any data type of array*/
fun <T : Comparable<T>> sortArray(array: Array<T>) {
    Arrays.sort(array)
}
fun main(){

    /** for class in generic type*/
    val box1: GenericKotlinDemo<Int> = GenericKotlinDemo(42)
    val box2: GenericKotlinDemo<String> = GenericKotlinDemo("Hello, world!")
    println("Integer : ${box1.item}")
    println("String : ${box2.item}")

    /** for function in generic type pass integer & string datatype */
    val array = arrayOf(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5)
    sortArray(array)
    for (element in array) {
        println("Integer Array output : $element")
    }
    val arrayStr = arrayOf("apple", "banana", "cherry", "date", "elderberry")
    sortArray(arrayStr)
    for (element in arrayStr) {
        println("String Array output : $element")
    }

}

