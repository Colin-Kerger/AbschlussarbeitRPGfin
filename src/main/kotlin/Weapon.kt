
open class Weapon {

    open var modell: String
    open var dmg: IntRange


    constructor(modell: String, dmg: IntRange) {

        this.modell = modell
        this.dmg = dmg

    }
    val thumbsUp = "👍"
    val thumbsDown = "👎"
    val laughingCrying = "😂"

    val happyFace = "\uD83D\uDE0A"
    val grinningFace = "\uD83D\uDE00"
    val heartEyes = "\uD83D\uDE0D"
    open fun angriffH(held: Held, gegner: Gegner) {}
    open fun angriffG(gegner: Gegner, held: Held) {}
    fun inflictDmgH(gegner: Gegner, damage: Int) {
        if (gegner.armor >= damage) {
            gegner.armor -= damage


        } else if (gegner.armor < damage) {
            var newDamageH = damage - gegner.armor
            gegner.armor = 0
            gegner.hp -= newDamageH
            if (gegner.hp <= 0) {

              println("       $blue${gegner.name}$bluereset wurde getötet!!! $laughingCrying NOOB")
            }
        }
    }

    fun inflictDmgG(held: Held, damage: Int) {
        if (held.armor >= damage) {
            held.armor -= damage

        } else if (held.armor < damage) {
            var newDamageG = damage - held.armor
            held.armor = 0
            held.hp -= newDamageG
            if (held.hp <= 0) {

                println("     $green${held.name}$greenreset wurde getötet!!!")
            }
        }
    }

}
