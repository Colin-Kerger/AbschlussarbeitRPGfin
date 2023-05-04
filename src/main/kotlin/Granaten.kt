import kotlin.random.Random

class Granten (modell: String,dmg: Int,kindOf: String):Weapons(modell,dmg,kindOf) {



    var splittergranate: Weapons = Weapons("Letzfetz",50,"wirft")
    fun granatewerfen(){
        var name= "LETZFETZ"
        var wurf= (20..30).random()
        var  treffer = Random.nextBoolean()

        if (treffer == true){
            println("Schmeist $name und verursacht $wurf Schaden!!! ")
        }else
            println("hat daneben geworfen!!!")}


}
