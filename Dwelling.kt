import kotlin.math.PI

fun main() {
    //create SqaureCabin
   
    val SqaureCabin = SqaureCabin(10,50.0)
    
    with(SqaureCabin){
    println("\nSquare Cabin\n=========")
    println("Capacity : ${capacity}")
    println("material : ${buildingMaterial}")
    println("Floor Area : ${floorArea()}")
    println("Has Room?? ${hasRoom()}")
    getRoom()
    }
    //create RoundHut
val roundHut = RoundHut(1,10.0)

    with(roundHut){
    println("\nRound Hut\n=========")
    println("Capacity : ${capacity}")
    println("material : ${buildingMaterial}")
    println("Floor Area : ${floorArea()}")
    println("Has Room?? ${hasRoom()}")
    getRoom()
    }
       //create RoundTower
val roundTower = RoundTower(50,15.0,10)

    with(roundTower){
    println("\nRound Tower\n=========")
    println("Capacity : ${capacity}")
    println("material : ${buildingMaterial}")
    println("Floor Area : ${floorArea()}")
    println("Has Room?? ${hasRoom()}")
    getRoom()
    }
}
abstract class Dwelling(private var residents : Int){
    
    //Attributes
    abstract val buildingMaterial : String 
    abstract val capacity : Int
    
    //Function - Methods
    fun hasRoom(): Boolean {
        return residents <= capacity
    }
    fun getRoom(){
        if(residents <= capacity){
            residents++
        	println("You got a room!")
        } else {
            println("sorry,at capacity and no rooms left. ")
        }
        
    }
    abstract fun floorArea() : Double
        
    
    
}//End Dwelling class

//subclass
 class SqaureCabin(residents : Int, val length : Double) :Dwelling(residents){
    override val buildingMaterial ="wood"
    override val capacity = 6
     
   override fun floorArea() : Double {
       return length * length  
   }
}

open class RoundHut(residents : Int,val radius : Double) : Dwelling(residents){
    override val buildingMaterial ="Straw"
    override val capacity = 3
    
    override fun floorArea() : Double {
       return PI * radius * radius
   } 
}
class RoundTower(residents : Int,radius : Double, val floors :Int=2):RoundHut(residents,radius){

    override val buildingMaterial ="Stone"
    override val capacity = 4 * floors
    
     override fun floorArea() : Double {
       return super.floorArea() * floors
   } 
}
 
