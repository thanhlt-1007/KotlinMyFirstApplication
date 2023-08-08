fun main(args: Array<String>) {
    // println("Pow!")

    // Do something (statements)
    // var is like a general variable
    // and can be assigned multiple times
    // and is known as the mutable variable in Kotlin
    var x = 3
    x *= 10

    // val is a constant variable
    // and can not be assigned multiple times
    // and can be initialized only single time
    // and is known as immutable variable in Kotlin
    val name = "Cormorant"

    println("x is $x.")

    // Do something again and again (loops)
    while (x > 20) {
        x -= 1
        println("x is now $x.")
    }

    for (i in 1..10) {
        x += 1
        println("x is now $x.")
    }

    // Do something under a condition (branching)
    if (x == 20) {
        println("x must be 20.")
    } else {
        println("x isn't 20.")
    }

    if (name.equals("Cormorant")) {
        println("$name Strike.")
    }
}
