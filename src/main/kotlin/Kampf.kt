val red = "\u001b[31m"
val redreset = "\u001b[0m"
val green = "\u001b[32m"
val greenreset = "\u001b[0m"
val blue = "\u001b[34m"
val bluereset = "\u001b[0m"
val cyan = "\u001b[36m"
val cyanreset = "\u001b[0m"
val yellow = "\u001b[33m"
val yellowreset = "\u001b[0m"


var messer: Messer = Messer("Wie durch Butter", 10..20)
var minigun: Minigun = Minigun("Big Berta", 30..50)
var aK47: AK47 = AK47("AK47", 10..20)
var sniperrifle: Sniperweapon = Sniperweapon("IseeU", 22..30)
var sniper: Sniper = Sniper("Eageleye", 100, 25, sniperrifle)
var ghost: Held = Held("The Shadow", 100, 50, messer)
var heavygunner: HeavyGunner = HeavyGunner("Johnny", 100, 100, minigun)

var soldat1: Fusssoldat = Fusssoldat("Larry", 80, 45, aK47)
var soldat2: Fusssoldat = Fusssoldat("Hugo", 80, 45, aK47)
var soldat3: Fusssoldat = Fusssoldat("Smith", 80, 45, aK47)
var fussoldatenMob = mutableListOf<Fusssoldat>(soldat1, soldat2, soldat3)
var heldenTrupp = mutableListOf<Held>(sniper, heavygunner, ghost)


fun kampf(held: Held, gegner: Gegner) {
    held.weapon.angriffH(held, gegner)


}

fun ruekkampf(gegner: Gegner, held: Held) {
    gegner.weapon.angriffG(gegner, held)

}

fun hpCheckG(): Boolean {
    fussoldatenMob = fussoldatenMob.filter { it.hp > 0 }.toMutableList()
    if (fussoldatenMob.isNotEmpty()) {

        return true
    }
    return false
}

fun hpCheckH(): Boolean {
    heldenTrupp = heldenTrupp.filter { it.hp > 0 }.toMutableList()
    if (heldenTrupp.isNotEmpty()) {

        return true
    }
    return false
}

fun frontline() {
    while (hpCheckG() && hpCheckH()) {
        kampf(heldenTrupp.random(), gegner = fussoldatenMob.random())

        for (fusssoldat in fussoldatenMob) {
            println("       $blue${fusssoldat.name}$bluereset hat Leben $red${fusssoldat.hp}$redreset und Rüstung $cyan${fusssoldat.armor}$cyanreset")
        }

        if (hpCheckG()) {

            ruekkampf(fussoldatenMob.random(), heldenTrupp.random())
            medikitsmall()
        }



        for (held in heldenTrupp) {
            println("       $green${held.name}$greenreset hat Leben $red${held.hp}$redreset und Rüstung $cyan${held.armor}$cyanreset")
        }

    }

    println("Die erste Schlacht ist vorbei und unsere Helden gehen als Sieger hervor ")

}


fun medikitsmall() {

    for (held in heldenTrupp){
       if (held.hp <=20){
           held.hp += 10
           println("$green${held.name}$greenreset hat sich um $red${held.hp}$redreset Gesundheit")}
    }
}



fun medikitBig() {

    heldenTrupp = heldenTrupp.filter { it.hp <= 100 }.toMutableList()

    for (held in heldenTrupp){
        held.hp += 50

    }
}

fun armorReg() {
    heldenTrupp = heldenTrupp.filter { it.armor >= 0 }.toMutableList()
    for (held in heldenTrupp) {
        held.armor += 50

        println(" $green${held.name}$greenreset hat Leben $red${held.hp}$redreset und Rüstung $cyan${held.armor}$cyanreset")
    }


}

fun nachbesprechung() {
    println("Sollen unsere Helden ihr Lager für die Nacht aufschlagen ? JA / NEIN ")
    var lagerAufschlagen = readln()




    if ("ja" == lagerAufschlagen) {
        medikitBig()
        armorReg()

        println(
            "Unsere Helden schlagen ihr lager für die Nacht auf. \n " +
                    "Sie reparieren im Schein des Lagerfeuer ihre Rüstungen,\n" +
                    "und legen sich später zur Erholen hin zum schlafen "
        )


    } else if ("nein" == lagerAufschlagen) {
        println("Der Trupp zieht weiter")

    }
    for (held in heldenTrupp){
        println(held.name + held.hp + held.armor)
    }
}
