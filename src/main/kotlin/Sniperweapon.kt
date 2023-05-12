import kotlin.random.Random

class Sniperweapon(modell: String, dmg: IntRange) : Weapon(modell, dmg) {


    // Unterklasse von Waffe

    /////////////////////////////////////////////////////////////////////////////////////////////////////

    // hier wird der Waffe der Schaden zugwiesen

    override fun angriffH(held: Held, gegner: Gegner) {
        var schaden = dmg.random()
        var treffer = Random.nextBoolean()
        if (treffer == true) {
            println("\n$green${held.name}$greenreset schießt mit $yellow$modell$yellowreset und trifft $blue${gegner.name}${bluereset} mit $red$schaden$redreset Schaden!!! \n")
            inflictDmgH(gegner, schaden)
        } else
            println("\n$green${held.name}$greenreset hat mit $yellow$modell$yellowreset daneben geschossen!!!\n")
    }
}