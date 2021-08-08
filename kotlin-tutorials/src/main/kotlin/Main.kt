fun main() {


    println(getAge("34 asd"))
    println(getAgeTake1("34 asd"))

    val (a, b, c) = List(3) { readLine()!!.first() }

    print(
            a.inc() == b && b.inc() == c
    )

    destructionExample()
    destructionExampleWith()

    with(Array(3) { readLine()!!.first() }) {
        component1().inc() == component2() && component2().inc() == component3()
    }.let(::println)

    val n = 123
    n.toString().reversed().let { print(it) }

}

fun destructionExample(): Unit = List(3) { readLine()!!.first() }.let { print(it[0].inc() == it[1] && it[1].inc() == it[2]) }
fun destructionExampleWith(): Unit = print(with(List(3) { readLine()!!.first() }) { component1().inc() == component2() && component2().inc() == component2() })

fun getAge(yearsOld: String) = yearsOld.takeWhile { it.isDigit() }
fun getAgeTake1(yearsOld: String) = yearsOld.first()