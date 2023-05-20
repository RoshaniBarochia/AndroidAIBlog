import java.util.*

/**
 * Generic Class demo*/
class GenericKotlinDemo<T>(val item: T)


/**
 * Generic function demo
 * create generic function sortList
 * pass and return any data type of array*/
fun <T : Comparable<T>> sortList(list: Array<T>) {
    Arrays.sort(list)
}
fun main(){

    /** for class in generic type*/
    val demo1: GenericKotlinDemo<Int> = GenericKotlinDemo(42)
    val demo2: GenericKotlinDemo<String> = GenericKotlinDemo("Hello, world!")
    println("Integer : ${demo1.item}")
    println("String : ${demo2.item}")

    /** for function in generic type pass integer & string datatype */
    val array = arrayOf(31, 11, 14, 11, 15, 91, 53, 52, 6,1)
    sortList(array)
    for (element in array) {
        println("Integer Array output : $element")
    }
    val arrayStr = arrayOf("dairy milk", "kitkat", "eclairs", "five star")
    sortList(arrayStr)
    for (element in arrayStr) {
        println("String Array output : $element")
    }

}

