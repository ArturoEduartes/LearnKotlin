package headFirstKotlin.chapter1

fun main() { // TODO "agregar comentarios"
    val name = "Misty"
    val height = 9

    println("Hello")
    println("My cat is called $name")
    println("My cat is height $height inches tall")

    val a = 6
    val b = 7
    val c = a + b + 10
    val str = c.toString()

    val numList = arrayOf(1, 2, 3)
    var x = 0
    while (x < 3) {
        println("Item $x is ${numList[x]}")
        x += 1
    }

    val myCat = Cat(name, height)
    var y = height - 3
    if (y < 7) {
        myCat.miaow(4)
    }

    while (y < 8) {
        myCat.play()
        y += 1
    }
}

class Cat(val name: String, val height: Int) {

    fun play() {
        println("cat $name with $height is playing()")
    }

    fun miaow(i: Int) {
        println("cat $name with $i is miaow")
    }
}
