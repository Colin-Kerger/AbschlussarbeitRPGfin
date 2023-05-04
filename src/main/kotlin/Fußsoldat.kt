import kotlin.random.Random

class Fußsoldat (name: String, hp:Int, armor:Int,aK47: AK47) :Gegner(name, hp, armor) {





    fun schießen(gegner: Gegner){
        var aksalve = (20..30).random()
        var treffer = Random.nextBoolean()

        if (treffer == true) {
            println("$name schießt und trifft mit $aksalve Schadenspunkten!!! ")
        } else
            println("$name hat daneben geschossen!!!")
    }


}



