abstract class Appliance {
    val pluggedln = true
    abstract val color:String
    abstract fun consumePower()
}

class CoffeMaker: Appliance(){
    override val color: String =""
    val coffeeLeft = true
    override fun consumePower() {
        println("Consuming power")
    }
    fun fillWithWater() {
        println("Fill with water")
    }
    fun makeCoffe(){
        println("Make the coffee")
    }
}