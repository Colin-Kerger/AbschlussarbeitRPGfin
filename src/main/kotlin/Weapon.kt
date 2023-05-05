open class Weapon {

    open var modell: String
    open var dmg: IntRange


    constructor(modell: String, dmg: IntRange) {

        this.modell = modell
        this.dmg = dmg

    }

    open fun angriffH(held: Held, gegner: Gegner) {}
    open fun angriffG(gegner: Gegner, held: Held) {}
    fun inflictDmgH(gegner: Gegner, damage: Int) {
        if (gegner.armor > damage) {
            gegner.armor -= damage

        } else if (gegner.armor < damage) {
            gegner.hp -= damage

        }
    }
        fun inflictDmgG(held: Held, damage: Int) {
            if (held.armor > damage) {
                held.armor -= damage

            } else if (held.armor < damage) {
                held.hp -= damage

            }
        }

    }
