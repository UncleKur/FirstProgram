class Person(
    val first_name: String,
    val second_name: String,
    var age: Int,
    val male: Boolean
) {

    fun sayHello() {
        println("Hello from ${"$second_name $first_name"}")
    }

    fun aboutMe() {
        println("I'm a $age old. I'm a ${if (male) "Big Man" else "Single Lady"}")
    }

}