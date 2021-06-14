fun main(vararg args: String) {
    println("Hello world")
    args.forEach { println(it) }


    val numbers = intArrayOf(1, 2, 3, 4)
    printSum(numbers)
    println("Max of two: ${numbers[0]} or ${numbers[3]}? " +
            "Ofc ${maxOf(numbers[0], numbers[3])} is bigger")


    val intRange = intRange(1, 10)
    printIntArray(intRange)
}

fun sumExpression(numbers: IntArray): Int = numbers.sum()

fun maxOf(a: Int, b: Int): Int = if (a > b) a else b

fun sumTwo(a: Int, b: Int): Int {
    return a + b
}

fun printSum(numbers: IntArray) {
    println("Sum of intArray: ${numbers.sum()}")
}

fun intRange(start: Int, end: Int): IntArray {
    val arrayList = ArrayList<Int>()
    for (n in start..end) {
        arrayList.add(n)
    }
    return arrayList.toIntArray()
}

fun printIntArray(array: IntArray) = prettyPrint(array, "-")

fun prettyPrint(array: IntArray, separator: String) {
    val str = array.joinToString(separator)
    print(str)
}