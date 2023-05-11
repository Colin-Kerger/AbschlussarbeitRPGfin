import kotlin.random.Random

class Messer (modell: String, dmg: IntRange) : Weapon(modell, dmg) {

    val red = "\u001b[31m"
    val reset ="\u001b[0m"
    val green="\u001b[32m"
    val greenreset="\u001b[0m"
    val yellow = "\u001b[33m"
    val yellowreset = "\u001b[0m"
    val blue="\u001b[34m"
    val bluereset= "\u001b[0m"
    override fun angriffH(held: Held,gegner: Gegner) {
        var schaden = dmg.random()
        var treffer = Random.nextBoolean()
        if (treffer == true) {

            println("\n$green${held.name}$greenreset wirft $yellow$modell$yellowreset und trifft $blue${gegner.name}$bluereset mit $red$schaden$reset Schaden!!!\n ")
            inflictDmgH(gegner,schaden)
        } else

            println("\n$green${held.name}${greenreset}hat mit $yellow$modell$yellowreset daneben geworfen!!!\n")

    }

}