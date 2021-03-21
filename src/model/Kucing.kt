package model
/*todo 1*/
/*data class is automatically generate default constructor
 , method set and get, HashCode(), Equals() and toString method*/
data class Kucing(
    var color : String = "",
    var height : Double = 0.0,
    var length : Double = 0.0,
    var weight : Double = 0.0

) : Carnivore() {

    fun purring(){
        println("Meow ...")
    }

    fun eatIntance() : Double{
        weight += 1
        return weight
    }

    override fun walk() {
      println("Yeay! ${javaClass.simpleName} walked!")
    }

    override fun eat() {
        super.eat()
    }
}

