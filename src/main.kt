fun main() {
    val a = 4
    println("The sqr root of $a is ${sqrPower(a)}")

    val killRealPerson = Person("Kirill", "Aganesyan", 18, true)
    killRealPerson.sayHello()
}

fun sqrPower(x: Int): Int {
    return x * x
}

