package model

open class Animal {
    open fun walk() {
        println("${javaClass.simpleName} Walk!")
    }
}