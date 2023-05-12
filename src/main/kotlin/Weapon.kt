open class Weapon {                                     // Hauptklasse Waffe
    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    open var modell: String                             // Variablen für die Eigenschaften
    open var dmg: IntRange

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

    constructor(modell: String, dmg: IntRange) {        // Constructor
        this.modell = modell
        this.dmg = dmg
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    open fun angriffH(held: Held, gegner: Gegner) {}

                                                        // Methoden für den Kampf wer greift wen an
    open fun angriffG(gegner: Gegner, held: Held) {}

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                                                    // Methoden für die Rüstungsreduzierung und Lebensreduzierung
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
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////