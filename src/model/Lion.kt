package model

class Lion : Carnivore() {

    override fun eat() {
        super.eat()
        println("${javaClass.simpleName} eat!")
    }
}