
fun main() {
    //create SqaureCabin
    val SqaureCabin = SqaureCabin(10)
    
    with(SqaureCabin){
    println("\nSquare Cabin\n=========")
     println("Capacity : ${capacity}")
    println("material : ${buildingMaterial}")
    println("Has Room?? ${hasRoom()}")
    }
    //create RoundHut
val roundHut = RoundHut(1)

    with(roundHut){
      println("\nRound Hut\n=========")
     println("Capacity : ${capacity}")
    println("material : ${buildingMaterial}")
    println("Has Room?? ${hasRoom()}")
    }
       //create RoundTower
val roundTower = RoundTower(1)

    with(roundTower){
      println("\nRound Tower\n=========")
     println("Capacity : ${capacity}")
    println("material : ${buildingMaterial}")
    println("Has Room?? ${hasRoom()}")
    }
}
abstract class Dwelling(private val residents : Int){
    
    //Attributes
    abstract val buildingMaterial : String 
    abstract val capacity : Int
    
    //Function - Methods
    fun hasRoom(): Boolean {
        return residents <= capacity
    }
}//End Dwelling class

//subclass
 class SqaureCabin(residents : Int) :Dwelling(residents){
    override val buildingMaterial ="wood"
    override val capacity = 6
}

open class RoundHut(residents : Int) :Dwelling(residents){
    override val buildingMaterial ="Straw"
    override val capacity = 3
}
class RoundTower(residents : Int):RoundHut(residents){
     override val buildingMaterial ="Stone"
    override val capacity = 4
}
