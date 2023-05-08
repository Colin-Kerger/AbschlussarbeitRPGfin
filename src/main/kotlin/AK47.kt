import kotlin.random.Random

class AK47  (modell:String, dmg:IntRange):Weapon(modell,dmg){


       override fun angriffG(gegner: Gegner,held: Held) {
              var schaden = dmg.random()
              var treffer = Random.nextBoolean()
              if (treffer == true) {
                     inflictDmgG(held,schaden)


                     println("${gegner.name} schießt mit $modell  und trifft ${held.name} mit $schaden Schaden!!! ")
              } else
                     println("${gegner.name} hat daneben geschossen!!!")
       }




}