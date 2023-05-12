import kotlin.random.Random

class Schrapnell(modell: String, dmg: IntRange) : Weapon(modell, dmg) {

    // Unterklasse von Waffe

    /////////////////////////////////////////////////////////////////////////////////////////////////////

    // hier wird der Waffe der Schaden zugwiesen


    override fun angriffG(gegner: Gegner, held: Held) {
        var schaden = dmg.random()
        var treffer = Random.nextBoolean()
        if (treffer == true) {

            println("\n$blue${gegner.name}$bluereset schmeißt  $yellow$modell$yellowreset zurück und trifft $green${held.name}$greenreset mit $red$schaden$redreset Schaden!!! \n")
            inflictDmgG(held, schaden)
        } else
            println("\n$blue${gegner.name}$bluereset hat mit $yellow$modell$yellowreset daneben geschossen!!!\n")
    }


}
