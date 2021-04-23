open class Monster {
    open fun frighten():Boolean {
        println("Aargh!")
        return true
    }
}

class Vampire: Monster(){
    override fun frighten(): Boolean {
        println("Fancy a bite?")
        return true
    }
}

class Dragon: Monster(){
    override fun frighten(): Boolean {
        println("Fire!")
        return true
    }
}