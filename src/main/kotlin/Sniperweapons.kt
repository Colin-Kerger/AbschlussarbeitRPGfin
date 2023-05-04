import kotlin.random.Random

class Sniperweapons (modell:String,dmg:Int,kindOf:String) {


    override fun warscheinlichkeitZuTreffen() {
        var treffer = Random.nextBoolean()

        if (treffer == true) {
            println(" schießt ${modell} und trifft mit $dmg!!! ")
        } else
            println("hat daneben geschossen!!!")
    }

}