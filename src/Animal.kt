interface Roamable{
    fun roam()
//    val velocity: Int



}
class Vehicle: Roamable{
    override fun roam() {
        println("The Vehicle roaming")
    }

//    override val velocity: Int = 2

}

abstract class Animal: Roamable{
    abstract val image:String
    abstract val food:String
    abstract val habitat:String
    var hunger = 10
    abstract fun makeNoise()

    abstract fun eat()
    override fun roam() {
        println("The Animal is roaming")
    }

//    override val velocity: Int = 4
//    open fun roam(){
//        println("The Animal is roaming")
//    }
    fun sleep() {
        println("The Animal is sleeping")
    }

}

class Hippo: Animal(){
    override val image = "hippo.jpg"
    override val food = "gras"
    override val habitat = "water"
    override fun makeNoise() {
        println("Grunt! Grunt!")
    }
    override fun eat() {
        println("The Hippo is eating $food")
    }
}

abstract class Canine: Animal(){
    override fun roam() {
        println("The Canine is roaming")
    }
}

class Wolf: Canine(){
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forest"
    override fun makeNoise() {
        println("Hooooowl!")
    }

    override fun eat() {
        println("The Wolf is eating $food")
    }

}

class Vet() {
    fun giveShot(animal: Animal) {
        // Код медицинской процедуры, которая не понравится животному
        animal.makeNoise()
    }
}


