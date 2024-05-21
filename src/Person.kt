class Person(
    val first_name: String,
    val second_name: String,
    var age: Int,
    val male: Boolean
) {

    fun sayHello() {
        println("Hello from ${"$second_name $first_name"}")
    }

}