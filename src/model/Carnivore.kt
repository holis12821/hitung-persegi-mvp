package model

open class Carnivore : Animal() {
   open fun eat(){
        println("${javaClass.simpleName} eat!")
    }
}