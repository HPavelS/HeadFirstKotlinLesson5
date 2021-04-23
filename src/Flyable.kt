interface Flyable {
    val x: String
    fun fly() {
        println("$x is flying")
    }
}
class Bird : Flyable {
    override val x = "Bird"
}
class Plane : Flyable {
    override val x = "Plane"
}
class Superhero : Flyable {
    override val x = "Superhero"
}
fun main() {
    val f = arrayOf(Bird(), Plane(), Superhero())

    var x = 0
    while (x in 0..2) {
        val y = when (f[x]) {
            is Bird -> false
            else -> true
        }
//    if (f[x] !is Bird) f[x].fly()
        if (y) {f[x].fly()}
        x++
    }
}
