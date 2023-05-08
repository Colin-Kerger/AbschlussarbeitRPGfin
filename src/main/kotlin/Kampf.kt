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
val red = "\u001B[31m"
val greenBg = "\u001B[42m"


fun kampf(held: Held, gegner: Gegner) {
    held.weapon.angriffH(held, gegner)


}

fun ruekkampf(gegner: Gegner, held: Held) {
    gegner.weapon.angriffG(gegner, held)

}

fun hpCheckG() {
    fussoldatenMob = fussoldatenMob.filter { it.hp > 0 }.toMutableList()

    for (fusssoldat in fussoldatenMob) {
        println(" ${red}${fusssoldat.name}hat Leben ${fusssoldat.hp} und Rüstung${fusssoldat.armor}")

    }


}

fun hpCheckH() {
    heldenTrupp = heldenTrupp.filter { it.hp > 0 }.toMutableList()
    for (held in heldenTrupp) {
        println(" ${held.name}hat Leben ${held.hp} und Rüstung${held.armor}")
    }


}

fun frontline() {
    kampf(heldenTrupp.random(), gegner = fussoldatenMob.random())
    hpCheckG()

    println()
    ruekkampf(fussoldatenMob.random(), heldenTrupp.random())
    hpCheckH()



}


