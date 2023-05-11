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

var schrapnell: Schrapnell = Schrapnell("Schrapnelle",20..35)
var moerser: Moerser = Moerser("KLOPF KLOPF",40..60)
var splittergranate: Splittergranate = Splittergranate("LetzFetz",30..50)
var messer: Messer = Messer("Wie durch Butter", 10..20)
var minigun: Minigun = Minigun("Dicke Berta", 30..50)
var aK47: AK47 = AK47("AK47", 10..20)
var sniperrifle: Sniperweapon = Sniperweapon("IseeU", 22..30)
var mgNest: MGNest = MGNest("BRRR BRRR", 20..50)
var sniper: Sniper = Sniper("Eageleye", 100, 25, sniperrifle)
var ghost: Held = Held("The Shadow", 100, 50, messer)
var heavygunner: HeavyGunner = HeavyGunner("Johnny", 100, 100, minigun)
var moerserschuetze: Moerserschuetze = Moerserschuetze("BOMBEN-BOB",100,70,moerser)

var soldat1: Fusssoldat = Fusssoldat("Larry", 80, 45, aK47)
var soldat2: Fusssoldat = Fusssoldat("Hugo", 80, 45, aK47)
var soldat3: Fusssoldat = Fusssoldat("Smith", 80, 45, aK47)

var mgschuetze1: MgSchuetze = MgSchuetze("Bobby", 100, 40, mgNest)
var mgschuetze2: MgSchuetze = MgSchuetze("Nick", 100, 40, mgNest)
var mgschuetze3: MgSchuetze = MgSchuetze("Klaus", 100, 40, mgNest)

var schutztuer: befestigteTuer = befestigteTuer("Schutztür",100,120,schrapnell)
var endBoss: EndBoss = EndBoss("DAS DING",300,200,splittergranate)

var dasDing = mutableListOf<EndBoss>(endBoss)
var tueroefferMob = mutableListOf<Moerserschuetze>(moerserschuetze)
var tuersteherMob = mutableListOf<befestigteTuer>(schutztuer)
var fussoldatenMob = mutableListOf<Fusssoldat>(soldat1, soldat2, soldat3)
var heldenTrupp = mutableListOf<Held>(sniper, heavygunner, ghost)
var mgNestMob = mutableListOf<MgSchuetze>(mgschuetze1, mgschuetze2, mgschuetze3)

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

    println("\n!!!Die Frontline wurde erfolgreich eliminiert!!!\n ")

}


fun medikitsmall() {

    for (held in heldenTrupp) {
        if (held.hp <= 20) {
            held.hp += 10
            println("    $green${held.name}$greenreset hat sich um $red 10 $redreset Gesundheitspunkte geheilt")
        }
    }
}
fun medikitnormal() {

    for (held in heldenTrupp) {
        if (held.hp <= 20) {
            held.hp += 25
            println("    $green${held.name}$greenreset hat sich um $red 10 $redreset Gesundheitspunkte geheilt")
        }
    }
}

fun medikitBig() {

    heldenTrupp = heldenTrupp.filter { it.hp <= 100 }.toMutableList()

    for (held in heldenTrupp) {
        held.hp += 80

    }
}

fun armorReg() {
    heldenTrupp = heldenTrupp.filter { it.armor >= 0 }.toMutableList()
    for (held in heldenTrupp) {
        held.armor += 50

        println(" $green${held.name}$greenreset hat Leben $red${held.hp}$redreset und Rüstung $cyan${held.armor}$cyanreset")
    }


}

fun statusbericht() {
    println("Sollen unsere Helden ihr Lager für die Nacht aufschlagen ? ja / nein ")
    var lagerAufschlagen = readln()
    if ("ja" == lagerAufschlagen) {
        println(
            " Unsere Helden schlagen ihr lager für die Nacht auf. \n " +
                    "Sie reparieren im Schein des Lagerfeuer ihre Rüstungen,\n" +
                    " und legen sich später zur Erholen hin zum schlafen. "
        )

        medikitBig()
        armorReg()
    } else if ("nein" == lagerAufschlagen) {
        println("Der Trupp zieht weiter")

    }

}


fun hpCheckGmg(): Boolean {
    mgNestMob = mgNestMob.filter { it.hp > 0 }.toMutableList()
    if (mgNestMob.isNotEmpty()) {

        return true
    }
    return false
}

fun sturmZumTor() {
    while (hpCheckGmg() && hpCheckH()) {
        kampf(heldenTrupp.random(), gegner = mgNestMob.random())

        for (mgSchuetze in mgNestMob) {

            println("       $blue${mgSchuetze.name}$bluereset hat Leben $red${mgSchuetze.hp}$redreset und Rüstung $cyan${mgSchuetze.armor}$cyanreset")
        }

        if (hpCheckGmg()) {

            ruekkampf(mgNestMob.random(), heldenTrupp.random())
            medikitnormal()
        }



        for (held in heldenTrupp) {
            println("       $green${held.name}$greenreset hat Leben $red${held.hp}$redreset und Rüstung $cyan${held.armor}$cyanreset")
        }

    }

    println("\n    !!!Die MG-Nester wurden erfolgreich zerstört !!!\n ")

}


fun statusbericht2() {
    println("Sollen unsere Helden ihre Stellung befestigen ? ja / nein ")
    var lagerAufschlagen = readln()
    if ("ja" == lagerAufschlagen) {
        println(
            " Unsere Helden befestigen ihre Stellung  für die Nacht auf. \n " +
                    "Sie reparieren ihre Rüstungen,\n" +
                    " und essen eine Kleinigkeit um wieder zu Kräften zu kommen . "
        )

        medikitBig()
        armorReg()
    } else if ("nein" == lagerAufschlagen) {
        println("Der Trupp zieht weiter")

    }

}
fun hpCheckHTuer(): Boolean {
    tueroefferMob = tueroefferMob.filter { it.hp > 0 }.toMutableList()
    if (tueroefferMob.isNotEmpty()) {

        return true
    }
    return false
}
fun hpCheckGTuer(): Boolean {
    tuersteherMob = tuersteherMob.filter { it.hp > 0 }.toMutableList()
    if (tuersteherMob.isNotEmpty()) {

        return true
    }
    return false
}
fun dertürOeffner(){
    while (hpCheckGTuer() && hpCheckHTuer()) {
        kampf(tueroefferMob.random(), gegner = tuersteherMob.random())

        for (gegner in tuersteherMob) {

            println("       $blue${schutztuer.name}$bluereset hat Leben $red${schutztuer.hp}$redreset und Rüstung $cyan${schutztuer.armor}$cyanreset")
        }

        if (hpCheckGTuer()) {

            ruekkampf(tuersteherMob.random(), tueroefferMob.random())
            medikitnormal()
        }
        for (held in tueroefferMob) {
            println("       $green${moerserschuetze.name}$greenreset hat Leben $red${moerserschuetze.hp}$redreset und Rüstung $cyan${moerserschuetze.armor}$cyanreset")
        }

    }

    println("\n    !!!Die Schutztüre wurde in 1000 Stücke gesprengt  !!!\n ")

}
fun statusbericht3() {
    println("Sollen unsere Helden das weitere Vorgehen planen ? ja / nein ")
    var lagerAufschlagen = readln()
    if ("ja" == lagerAufschlagen) {
        println(
            " Unsere Helden besprechen ihre Taktik. \n " +
                    "Sie checken ihre Ausrüstung ,\n" +
                    " Eageleye: Geladen und entsichert!! Lasst und diesem H****sohn in den Arsch treten!!.\n" +
                    "The Shadow: Ich werde ihm mit meinem Messer ein breites Lächeln von Ohr zu Ohr breiten\n" +
                    "Johnny: Na dann mal los auf ihn wartet meine kleine Freundin  "
        )

        medikitBig()
        armorReg()
    } else if ("nein" == lagerAufschlagen) {
        println("Der Trupp zieht weiter")

    }

}


fun hpCheckGEndBoss(): Boolean {
    dasDing = dasDing.filter { it.hp > 0 }.toMutableList()
    if (dasDing.isNotEmpty()) {

        return true
    }
    return false
}

fun endfight(){
while (hpCheckGEndBoss() && hpCheckH()) {
    kampf(heldenTrupp.random(), gegner = dasDing.random())

    for (gegner in dasDing) {
        println("       $blue${endBoss.name}$bluereset hat Leben $red${endBoss.hp}$redreset und Rüstung $cyan${endBoss.armor}$cyanreset")
    }

    if (hpCheckGEndBoss()) {

        ruekkampf(dasDing.random(), heldenTrupp.random())
        medikitsmall()
    }



    for (held in heldenTrupp) {
        println("       $green${held.name}$greenreset hat Leben $red${held.hp}$redreset und Rüstung $cyan${held.armor}$cyanreset")
    }

}

println("\n!!!Das Dorf wurde befreit .Die Schreckensherrschaft von dem DING ist vorbei ,\n" +
        "und unsere Helden werden bejubelt und gefeiert !!!\n ")

}
