var messer: Messer = Messer("Stich", 10..20)
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
val red = "\u001b[31m"
val redreset ="\u001b[0m"



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
    while (hpCheckG() && hpCheckH()){
        kampf(heldenTrupp.random(), gegner = fussoldatenMob.random())

        for (fusssoldat in fussoldatenMob) {
            println(" $blue${fusssoldat.name}$bluereset hat Leben $red${fusssoldat.hp}$redreset und Rüstung${fusssoldat.armor}")
        }

        if(hpCheckG()){
        println()
        ruekkampf(fussoldatenMob.random(), heldenTrupp.random())}
        println()
        for (held in heldenTrupp) {
            println("$green${held.name}$greenreset hat Leben $red${held.hp}$redreset und Rüstung ${held.armor}")}

    }

        println("Die erste Schlacht ist vorbei und unsere Helden gehen als Sieger hervor ")

    }




fun medikitsmall(held: Held) {

    if (held.armor == 0 || held.hp < 20) {

    } else if (held.armor == 0 || held.hp < 20) {
        var newhp = held.hp + 20

        println("${held.name}  hat sich um $newhp geheilt")
    }


}


fun armorReg(held: Held) {
    heldenTrupp = heldenTrupp.filter { it.armor >= 0 }.toMutableList()
    for (held in heldenTrupp) {
        var newArmor = held.armor + 40

        println(" ${held.name} hat Leben ${held.hp} und Rüstung ${held.armor}")
    }


}
/*fun nachbesprechung(){
    println("Sollen unsere Helden ihr Lager für die Nacht aufschlagen ? JA / NEIN ")
    var lagerAufschlagen = readln()
    var nein = true
    var ja = true
     lagerAufschlagen = ja.toString()


    if (ja.toString().also { lagerAufschlagen = it }){
        println("Unsere Helden schlagen ihr lager für die Nacht auf ")
        armorReg(ghost)
        armorReg(sniper)
        armorReg(heavygunner)
}else if  (nein ==true ){
    println("Der Trupp zieht weiter")

    }
}*/