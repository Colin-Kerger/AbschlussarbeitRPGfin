import kotlin.random.Random

class Schrapnell (modell:String, dmg:IntRange):Weapon(modell,dmg) {
    override fun angriffG(gegner: Gegner,held: Held) {
        var schaden = dmg.random()
        var treffer = Random.nextBoolean()
        if (treffer == true) {
            inflictDmgG(held,schaden)


            println("\n$blue${gegner.name}$bluereset schießt mit der $yellow$modell$yellowreset und trifft $green${held.name}$greenreset mit $red$schaden$redreset Schaden!!! \n")
        } else
            println("\n$blue${gegner.name}$bluereset hat mit der$yellow$modell$yellowreset daneben geschossen!!!\n")
    }




}
