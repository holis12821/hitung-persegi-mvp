package main

import model.Animal
import model.Dog
import model.Kucing
import model.Lion

fun main() {
    val kucing: Animal = Kucing() /*polymorphism method*/
    kucing.walk()

    val anggora = Kucing()
    anggora.eat()

    val lion = Lion()
    lion.eat()

    val dog = Dog()
    dog.eat()
}