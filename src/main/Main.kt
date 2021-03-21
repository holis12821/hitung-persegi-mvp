package main

import model.Kucing

fun main() {

        /*todo instance objek number 1*/
        val persian  = Kucing()
        persian.color = "White"
        persian.height = 24.0
        persian.length = 46.0
        persian.weight = 2.0

        /*todo instance objek number 2*/
        val bengal = Kucing(
            color = "Brown",
            height = 22.0,
            length = 46.0,
            weight = 2.0
        )
        /*todo instance objek number 2*/
         val anggora = Kucing (
             color = "Grey",
             height = 25.0,
             length = 41.0,
             weight = 2.4
         )
    /*todo access class with instance object*/
    println("++------++Kucing anggora---+----+")
    println("Color : ${anggora.color}")
    println("Height : ${anggora.height}")
    println("Length : ${anggora.length}")
    println("Weight : ${anggora.weight}")

    println("++------++Kucing Persian---+----+")
    println("Color : ${persian.color}")
    println("Height : ${persian.height}")
    println("Length : ${persian.length}")
    println("Weight : ${persian.weight}")

    println("++------++Kucing Bengal---+----+")
    println("Color : ${bengal.color}")
    println("Height : ${bengal.height}")
    println("Length : ${bengal.length}")
    println("Weight : ${bengal.weight}")

    println("Kucing Anggora : ")
    anggora.purring()
    println("eating : ${anggora.eatIntance()}")
    println("Kucing Bengal : ")
    bengal.purring()
    println("eating : ${bengal.eatIntance()}")
    println("Kucing Persian : ")
    persian.purring()
    println("eating : ${persian.eatIntance()}")
}