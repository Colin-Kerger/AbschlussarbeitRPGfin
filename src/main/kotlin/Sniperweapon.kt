import kotlin.random.Random

class Sniperweapon (modell:String, dmg:IntRange) :Weapon(modell,dmg){





     fun headshot(gegner: Gegner) {
         var schaden = dmg.random()
        var treffer = Random.nextBoolean()

        if (treffer == true)

        {
            println(" schießt $modell  und trifft mit $schaden Schaden!!! ")
        } else
            println("hat daneben geschossen!!!")
    }

}