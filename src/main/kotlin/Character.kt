import kotlin.random.Random

open class Character {

    open var name: String
    open var hp: Int
    open var armor: Int


    constructor(name: String, hp: Int, armor: Int, ) {

        this.name = name
        this.hp = hp
        this.armor = armor

    }

    open fun medikitsmall() {

        var hpreg = hp / 100 * 15 + hp
        println("$name wurde um $hpreg geheilt")

    }

    open fun wahrscheinlichkeitZuTreffen(Character: Character,weapons: Weapons) {
        var treffer = Random.nextBoolean()

        if (treffer == true) {
            println("$name schießt mit   und trifft!!! er verursacht   ")
        } else
            println("$name hat daneben geschossen!!!")
    }

   open fun heavyatk() {
        var salve = (20..30).random()
        var treffer = Random.nextBoolean()

        if (treffer == true) {
            println("$name schießt und trifft mit $salve Schadenspunkten!!! ")
        } else
            println("$name hat daneben geschossen!!!")
    }

    open fun granatewerfen(Character:Character,WEAPONS:Granten) {

        println("$name schmeist eine Granate  ")
    }
}







