import kotlin.random.Random

class Sniperweapon(modell: String, dmg: IntRange) : Weapon(modell, dmg) {


    fun headshot(gegner: Gegner,sniperName:String) {
        var schaden = dmg.random()
        var treffer = Random.nextBoolean()
        if (treffer == true) {
            inflictDmg(gegner,schaden)


            println("$sniperName schießt $modell  und trifft mit $schaden Schaden!!! ")
        } else
            println("hat daneben geschossen!!!")
    }

}