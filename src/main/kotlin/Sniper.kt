
import kotlin.random.Random

class Sniper (name:String, hp: Int, armor: Int) : Character(name , hp , armor){

   override fun wahrscheinlichkeitZuTreffen(Sniper:Character,weapons: Weapons) {
        var treffer = Random.nextBoolean()

        if (treffer == true) {
            println("$name schießt mit   und trifft!!! er verursacht   ")
        } else
            println("$name hat daneben geschossen!!!")
    }

}








