open class Gegner {

    open var name: String
    open var hp: Int
    open var armor: Int


    constructor(name: String, hp: Int, armor: Int ) {

        this.name = name
        this.hp = hp
        this.armor = armor

    }
    open fun schiesen(gegner:Gegner){
        println("greift an ")


    }


}
