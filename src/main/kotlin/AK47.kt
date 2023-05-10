import kotlin.random.Random

class AK47  (modell:String, dmg:IntRange):Weapon(modell,dmg){
       val red = "\u001b[31m"
       val reset ="\u001b[0m"
       val green="\u001b[32m"
       val greenreset="\u001b[0m"
       val yellow = "\u001b[33m"
       val yellowreset = "\u001b[0m"
       val blue="\u001b[34m"
       val bluereset= "\u001b[0m"
       override fun angriffG(gegner: Gegner,held: Held) {
              var schaden = dmg.random()
              var treffer = Random.nextBoolean()
              if (treffer == true) {
                     inflictDmgG(held,schaden)


                     println("$blue${gegner.name}$bluereset schießt mit der $yellow$modell$yellowreset  und trifft $green${held.name}$greenreset mit $red$schaden $reset Schaden!!! ")
              } else
                     println("$blue${gegner.name}$bluereset hat mit der$yellow$modell$yellowreset daneben geschossen!!!")
       }




}