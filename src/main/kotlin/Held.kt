open class Held {

    open var name: String
    open var hp: Int
    open var armor: Int


    constructor(name: String, hp: Int, armor: Int ) {

        this.name = name
        this.hp = hp
        this.armor = armor

    }

    open fun medikitsmall() {

        var hpreg = hp / 100 * 15 + hp
        println("$name wurde um $hpreg geheilt")

    }

    open fun wahrscheinlichkeitZuTreffen(gegner: Gegner) {
       println("Schiesen")
    }

   open fun heavyatk(gegner: Gegner) {
       println("schwererAngriff")}

    open fun granatewerfen(gegner: Gegner) {

        println("$name schmeist eine Granate  ")
    }
}







