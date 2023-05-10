import kotlin.random.Random

class Moerser (modell: String, dmg: IntRange) : Weapon(modell, dmg) {
    override fun angriffH(held: Held,gegner: Gegner) {
        var schaden = dmg.random()
        var treffer = Random.nextBoolean()
        if (treffer == true) {
            inflictDmgH(gegner,schaden)


            println("\n$green${held.name}$greenreset schießt mit $yellow$modell$yellowreset und trifft $blue${gegner.name}${bluereset} mit $red$schaden$redreset Schaden!!! \n")

        } else

            println("\n$green${held.name}$greenreset hat mit $yellow$modell$yellowreset daneben geschossen!!!\n")

    }

}
