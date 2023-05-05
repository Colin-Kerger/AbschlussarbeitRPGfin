
import kotlin.random.Random

class Sniper(name: String, hp: Int, armor: Int,var sniperweapon: Sniperweapon) : Held(name, hp, armor, sniperweapon) {



    override fun wahrscheinlichkeitZuTreffen(gegner: Gegner) {
       var waffe = "IseeU"
       var schaden= (15..35).random()
       var treffer = Random.nextBoolean()

        if (treffer == true) {
            println("$name schießt mit $waffe  und trifft!!! er verursacht $schaden Schaden  ")
        } else
            println("$name hat daneben geschossen!!!")
    }

}








