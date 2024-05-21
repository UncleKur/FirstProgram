fun main() {
    val a = 4
    println("The sqr root of $a is ${sqrPower(a)}")

    val killRealPerson = Person("Kirill", "Aganesyan", 18, true)
    killRealPerson.sayHello()
    killRealPerson.aboutMe()

    sayHiFromMaster()
}

fun sqrPower(x: Int): Int {
    return x * x
}

//added some function parallel in master branch, while some changes in other branches
fun sayHiFromMaster() {
    println("HI! I'm a master!")
}