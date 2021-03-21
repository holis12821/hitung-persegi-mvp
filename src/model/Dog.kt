package model

class Dog : Carnivore() {

    override fun eat() {
        super.eat()
        println("${javaClass.simpleName} eat!")
    }
}