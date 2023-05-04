open class Weapon {

    open var modell: String
    open var dmg: IntRange


    constructor(modell: String, dmg: IntRange) {

        this.modell = modell
        this.dmg = dmg

    }

    fun inflictDmg(gegner: Gegner,damage: Int){
       if (gegner.armor > damage) {
           gegner.armor -= damage

       }else if (gegner.armor < damage){
           gegner.hp -= damage

       }// dazwischen


    }

}