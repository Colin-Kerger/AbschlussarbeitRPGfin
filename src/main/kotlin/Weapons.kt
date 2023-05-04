import kotlin.random.Random

open class Weapons {

    open var modell: String
    open var dmg: Int
    open var kindOf: String

constructor(modell: String,dmg: Int,kindOf:String ){

    this.modell = modell
    this.dmg = dmg
    this.kindOf = kindOf
}
    open fun warscheinlichkeitZuTreffen(){
        var  treffer = Random.nextBoolean()

        if (treffer == true){
            println("schießt mit ${modell} und trifft!!! ")
        }else
            println(" hat daneben geschossen!!!")}
}