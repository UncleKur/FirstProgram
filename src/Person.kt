class Person(
    private val firstName: String,
    private val secondName: String,
    private var age: Int,
    private val male: Boolean
) {

    fun sayHello() {
        println("Hello from ${"$secondName $firstName"}")
    }

    fun aboutMe() {
        println("I'm a $age old. I'm a ${if (male) "Big Man" else "Single Lady"}")
    }

}