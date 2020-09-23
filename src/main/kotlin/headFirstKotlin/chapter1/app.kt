package headFirstKotlin.chapter1

fun run_Version_1() {
    println("Pow")
    var x = 3
    val name = "Cormoran"
    x *= 10
    print("x is $x ")
    // This is a comment
    while (x > 20) {
        x -= 1
        println("x is now $x")
    }
    for (i in 1..10)
        x += 1
    println("x is now $x.")

    if (x == 20) {
        println("x must be 20.")
    } else {
        println("x isn´t 20.")
    }
    if (name == "Cormoran") {
        println("$name Strike")
    }
    x = 4 //Assign 4 to x
    while (x > 3) {
        //The loop code will run as x is greater than 4
        println(x)
        x -= 1
    }
    var z = 27
    while (z == 10) {
        //The loop code will not run as z is 27
        println(z)
        z += 6
    }

}

fun run_Version2() {
    var notUsed = "Not user"
    var x = 1
    println("Before the loop. x = $x.")
    while (x < 4) {
        println("In the loop. x = $x.")
        x += 1
    }
    println("After the loop. x = $x.")
}

fun main() {
    run_Version_1() //Test WorkFlows
    run_Version2()
}
