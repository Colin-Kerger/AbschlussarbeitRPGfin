import kotlin.random.Random

class Sniperweapon(modell: String, dmg: IntRange) : Weapon(modell, dmg) {


  override fun angriffH(held: Held,gegner: Gegner) {
        var schaden = dmg.random()
        var treffer = Random.nextBoolean()
        if (treffer == true) {
            inflictDmgH(gegner,schaden)


            println("${held.name} schießt mit $modell  und trifft ${gegner.name} mit $schaden Schaden!!! ")
        } else
            println("${held.name}hat daneben geschossen!!!")
    }

}