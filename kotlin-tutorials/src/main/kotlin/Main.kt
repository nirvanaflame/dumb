fun main(vararg args: String) {

    println(getAge("34 asd"))
    println(getAgeTake1("34 asd"))

}

fun getAge(yearsOld: String) = yearsOld.takeWhile { it.isDigit() }
fun getAgeTake1(yearsOld: String) = yearsOld.first()