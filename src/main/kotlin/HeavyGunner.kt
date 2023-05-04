import kotlin.random.Random

class HeavyGunner( name:String, hp: Int, armor: Int) :Character(name , hp , armor) {


     override fun granatewerfen(heavygunner: Character, WEAPONS:Granten) {
        var wurf = (20..45).random()
         var treffer = Random.nextBoolean()

         if (treffer == true) {
            println("$name schmeist eine   und verursacht $wurf Schaden!!! ")
        } else
            println("hat daneben geworfen!!!")
    }

}
