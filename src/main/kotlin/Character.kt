

open class Character {

    open var name: String
    open var hp: Int
    open var armor: Int


    constructor(name:String,hp:Int,armor:Int,) {

        this.name = name
        this.hp = hp
        this.armor = armor

    }
    fun medikitsmall () {

        var hpreg=  hp/100*15+hp
        println("$name wurde um $hpreg geheilt")

    }
    fun warscheinlichkeitZuTreffen(){
      var  treffer = booleanArrayOf(true)
        var glueck = treffer.random()
            if (glueck == true){
                println("$name schießt und trifft!!! ")
            }else
                println("$name hat daneben geschossen!!!")}









}



