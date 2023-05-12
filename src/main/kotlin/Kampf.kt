val happyFace = "\uD83D\uDE0A"
val grinningFace = "\uD83D\uDE00"
val heartEyes = "\uD83D\uDE0D"
val thumbsUp = "👍"
val thumbsDown = "👎"                                // Variablen für die smileys
val laughingCrying = "😂"
val angryFace = "\uD83D\uDE20"
val confusedSmiley = "\uD83D\uDE15"
val fearSmiley = "\uD83D\uDE28"
val fireworks = "\uD83C\uDF86"

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

val bold = "\u001b[1m"
val boldreset = "0"
val underline = "\u001b[4m"
val underlinereset = "\u001b[0m"
val red = "\u001b[31m"
val redreset = "\u001b[0m"
val green = "\u001b[32m"                                //Variablen für die Schriftfarben
val greenreset = "\u001b[0m"
val blue = "\u001b[34m"
val bluereset = "\u001b[0m"
val cyan = "\u001b[36m"
val cyanreset = "\u001b[0m"
val yellow = "\u001b[33m"
val yellowreset = "\u001b[0m"

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

var schrapnell: Schrapnell = Schrapnell("Schrapnelle", 15..25)
var moerser: Moerser = Moerser("KLOPF KLOPF", 40..60)
var splittergranate: Splittergranate = Splittergranate("LetzFetz", 10..20)
var messer: Messer = Messer("Wie durch Butter", 10..20)                             //Variablen für die Waffen
var minigun: Minigun = Minigun("Dicke Berta", 30..50)
var aK47: AK47 = AK47("AK47", 10..20)
var sniperrifle: Sniperweapon = Sniperweapon("IseeU", 22..30)
var mgNest: MGNest = MGNest("BRRR BRRR", 18..35)

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

var sniper: Sniper = Sniper("Eageleye", 100, 25, sniperrifle)
var ghost: Ghost = Ghost("Shadow", 100, 50, messer)                             //Variablen für die Helden
var heavygunner: HeavyGunner = HeavyGunner("Johnny", 100, 100, minigun)
var moerserschuetze: Moerserschuetze = Moerserschuetze("BOMBEN-BOB", 100, 70, moerser)

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

var soldat1: Fusssoldat = Fusssoldat("Larry", 80, 45, aK47)
var soldat2: Fusssoldat = Fusssoldat("Hugo", 80, 45, aK47)                      // Variablen für die ersten Gegnermob
var soldat3: Fusssoldat = Fusssoldat("Smith", 80, 45, aK47)

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

var mgschuetze1: MgSchuetze = MgSchuetze("Bobby", 100, 40, mgNest)
var mgschuetze2: MgSchuetze = MgSchuetze("Nick", 100, 40, mgNest)               //Variablen für den zweiten Gegenermob
var mgschuetze3: MgSchuetze = MgSchuetze("Klaus", 100, 40, mgNest)

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

var schutztuer: befestigteTuer = befestigteTuer("Schutztür", 100, 120, schrapnell)  //Variablen für Schutztür
var endBoss: EndBoss = EndBoss("OVERLORD", 300, 200, splittergranate)               //Variablen für Endboss

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

var dasDing = mutableListOf<EndBoss>(endBoss)
var tueroefferMob = mutableListOf<Moerserschuetze>(moerserschuetze)
var tuersteherMob = mutableListOf<befestigteTuer>(schutztuer)
var fussoldatenMob = mutableListOf<Fusssoldat>(soldat1, soldat2, soldat3)                           //Listen der Heldentruppen und Gegnertruppen
var heldenTrupp = mutableListOf<Held>(sniper, heavygunner, ghost)
var mgNestMob = mutableListOf<MgSchuetze>(mgschuetze1, mgschuetze2, mgschuetze3)

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
fun kampf(held: Held, gegner: Gegner) {
    held.weapon.angriffH(held, gegner)
}                                                   //Funktionen für das Kampfgeschehen Held vs Gegner und andersrum
fun ruekkampf(gegner: Gegner, held: Held) {
    gegner.weapon.angriffG(gegner, held)
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                                            // Funktionen für die Medikits
fun medikitsmall() {// klein

    for (held in heldenTrupp) {
        if (held.hp <= 20) {
            held.hp += 15
            println("    $green${held.name}$greenreset hat sich um $red 10 $redreset Gesundheitspunkte geheilt$happyFace")
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
    for (held in heldenTrupp) {
        if (held.hp <= 50) {
            held.hp += 80
        }
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                                                //  funktion für die Rüstungsregeneration
fun armorReg() {
    for (held in heldenTrupp) {
        if (held.armor <= 20)
            held.armor += 50
        println(" $green${held.name}$greenreset hat Leben $red${held.hp}$redreset und Rüstung $cyan${held.armor}$cyanreset$happyFace")
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                            // Funktionen für die Abfrage OB ein Held oder Gegner noch lebt für unterschiedliche Listen
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

fun hpCheckGmg(): Boolean {
    mgNestMob = mgNestMob.filter { it.hp > 0 }.toMutableList()
    if (mgNestMob.isNotEmpty()) {

        return true
    }
    return false
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
fun hpCheckGEndBoss(): Boolean {
    dasDing = dasDing.filter { it.hp > 0 }.toMutableList()
    if (dasDing.isNotEmpty()) {
        return true
    }
    return false
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


                                                    //Funktion für 1. KampfFunktion und Einleitung

fun frontline() {
    println("\n                                    ${red}                           ${underline}${bold}DIE HERSCHAFT DES OVERLORDS$bluereset$underlinereset$redreset\n")
    println()
    println()
    println(
        " In irgendeinem Zelt in irgendeinem gottverdammten Moskito verseuchten Jungle  \n" +
                " ORTSZEIT: 0800\n" +
                " ORT: GEHEIM"
    )
    println()
    println()

    println(
        "${cyan} “Ich bin Gunnery Sergeant Hartman\n" +
                " ${cyan}Willkommen meine Herren, schön das sie es alle pünktlich zur Einsatzbesprechung geschafft haben.\n" +
                " Johnny Sie ausnahmsweise auch mal. Da wir ja nun dann alle vollzählig sind, darf ich ihnen Maik von der technischen Aufklärung vorstellen\n" +
                " GUTEN MORGEN SIR!!!(im Chor)\n" +
                " Das ist mein geliebtes Core bestehend aus:\n" +
                " “${green}Johnny$greenreset ${cyan}wie bereits erwähnt unser Heavygunner“ “Sir“(leichtes nicken)\n" +
                " “${green}Eagleeye$greenreset$cyan unserem Sniper“ “Sir“ (salutiert) \n" +
                " “${green}Shadow$greenreset$cyan unserem Ghost... (Stille) ... machen sie sich nichts draus er redet nicht viel aber er ist sehr geschickt mit dem Messer.\n" +
                " Und zu guter Letzt unser Mörserschütze ${green}BOMBEN-BOB“$greenreset$cyan “Lassen wir es krachen,Sir“\n" +
                " “Unsere Satellitenaufklärung hat ein von Rebellen besetztes Dorf ausfindig gemacht.Laut unser Kontakt Person vor Ort\n" +
                " wird das Dorf von einem Tyrannen der sich selber der ${blue}“OVERLORD“$bluereset$cyan nennt beherrscht.\n" +
                " Ihre Aufgabe ist es:\n" +
                " \n${yellow} 1. Die umliegenden patrouillierenden ${blue}Fußsoldaten$bluereset ${yellow}zu eliminieren$yellowreset\n" +
                " ${yellow}2. Die befestigten ${blue}MG-Schützen${bluereset}$yellow zu eliminieren$yellowreset\n" +
                " ${yellow}3. Die ${blue}Schutztür$bluereset${yellow} die uns den Weg ins Dorf versperrt zu sprengen$yellowreset\n" +
                " ${yellow}4. Das Dorf von dem Tyrannen ${blue}“OVERLORD“$bluereset ${yellow}erlösen$yellowreset\n$cyanreset\n" +
                " ${cyan}Alles soweit klar Männer und "
    )

    println("${red} bereit zum Abflug?“$redreset tippe ein ${green}SIR jawohl SIR$greenreset")
    var Missionstarten = readln()
    Missionstarten = "SIR jawohl SIR"
    println(
        " ${cyan}Unser Helden besteigen den Heli und heben ab.\n" +
                " ${green}BOMBEN-BOB$greenreset:“${cyan}Ich hab da letzten ne granaten-Braut abgeschleppt,nur scheiße das wir immer nur so kurz an einem Ort sind.${cyanreset}“\n" +
                " ${green}Johnny$greenreset:“${cyan}Ne scheiße ist die Scheiße an deinen Lippen da, das war bestimmst schon Scheiße an ihren Lippen${cyanreset}“\n " +
                "${green}BOMBEN-BOB$greenreset:“${cyan}F***U${angryFace}Ich hab mich beim rasieren geschnitten${cyanreset}“\n" +
                " ${cyan}ALLLE$laughingCrying$laughingCrying$laughingCrying$laughingCrying$laughingCrying\n" +
                " ${green}Pilot$greenreset:“${cyan}Männer kriegt euch wieder ein, wie sind da, seid ihr bereit\n" +
                " ${red}zum abspringen?$redreset“ tippe ein “${green}ja${greenreset}“         "
    )

    var abspringen = readln()
    abspringen = "ja"

    println(
        " ${cyan}Der Heli dreht ab\n" +
                " Der Trupp geht in Stellung.\n" +
                " ${green}Eageleye$greenreset:“${cyan}Patrouille auf 2 Uhr.${cyanreset}“\n" +
                " ${green}Johnny$greenreset:“${cyan} Auf 3 gehts los 1...2...${cyanreset}“\n" +
                " ${red}3$redreset tippe ein “${green}3$greenreset“     "
    )

    var los = readln()
    los = "3"
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

    println("\n$red!!!${redreset}$thumbsUp${green}Die Frontline wurde erfolgreich eliminiert$greenreset$red$thumbsUp!!!$redreset\n ")

}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                                                 //Funktion für den 1. Statusbericht
fun statusbericht() {
    println("${red}Sollen unsere Helden ihr Lager für die Nacht aufschlagen ?$redreset$green ja / nein$greenreset ")
    println()
    var lagerAufschlagen = readln()
    if ("ja" == lagerAufschlagen) {
        println()
        println(
            "$cyan Unsere Helden schlagen ihr Lager für die Nacht auf. \n " + "Sie reparieren im Schein des Lagerfeuer ihre Rüstungen,\n" + " JAJA taktisch nicht von Vorteil$thumbsDown\n " + "und legen sich später zum Erholen hin zum schlafen. $cyanreset"
        )
        println()

        medikitBig()
        armorReg()
        println()
        println("$cyan Am nächsten Morgen erwacht euer Trupp im Morgengrauen,\n " + "der frühe Vogel und so ihr wisst schon$laughingCrying $cyanreset ")
        println(
            "$cyan Der Trupp pirscht sich durch das Unterholz bis sich der Jungle lichtet,\n" +
                    " sie erblicken 3 befestigte MG-NESTER.\n" +
                    "${green} Johnny$greenreset:“${cyan} Wo ist Shadow ??$cyanreset\n" +
                    " ${green}Eageleye$greenreset:“${cyan} Meinst du den der da gerade blutverschmiert einen abgetrennten Kopf in die Luft hält\n" +
                    " und über das ganze Gesicht am strahlen ist ,wie ein kleines Kind zu Weihnachten????$confusedSmiley\n" +
                    " Manchmal macht er mir echt Angst$cyanreset$fearSmiley“\n" +
                    " ${green}Johnny$greenreset:“${cyan}Alter woher soll ich das wissen du hast das verdammte Fernglas!! LOS IHM NACH!!“ "
        )
        println("${red} Um Shadow zu folgen$redreset tippe ein  “${green}go$greenreset“   ")
        var go = readln()
        go = "go"
    } else if ("nein" == lagerAufschlagen) {
        println("Der Trupp zieht weiter")

    }

}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                                            //Funktion für 2. Kampffunktion
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

    println("\n    $red!!!${redreset}${green}$thumbsUp Die MG-Nester wurden erfolgreich zerstört$greenreset $red$thumbsUp!!!$redreset\n ")
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                                        // Funktion für 2. Statusbericht
fun statusbericht2() {
    println("${red}Sollen unsere Helden ihre Stellung befestigen ?${redreset}$green ja / nein$greenreset ")
    var lagerAufschlagen = readln()
    if ("ja" == lagerAufschlagen) {
        println()
        println(
            "$cyan Unsere Helden befestigen ihre Stellung für die Nacht. \n " + "Sie reparieren ihre Rüstungen,\n" + " und essen eine Kleinigkeit um wieder zu Kräften zu kommen.$cyanreset "
        )
        println()
        medikitBig()
        armorReg()
        println()
        println(" ${cyan}Nachdem Johnny nach einer gefühlen Ewigkeit,\n endlich hinter einem kleinen Busch wieder aufgetaucht ist,\n ist der Trupp nun vollzählig  und bereit    ")
        println(
            " ${cyan}für eine kleine Lagebesprechung die zur Folge hat das nun BOMBEN-BOB seinen großen Auftritt hat\n" +
                    " er bringt seinen Mörser in Stellung lutscht zwischen durch ein paarmal an seinem Zeigefinger und hält ihn in die Luft\n" +
                    " ${green}Johnny$greenreset:“${cyan}Wird das heute noch was?? Ich will heute abend zum SUPERBOWL wieder zuhause sein!!\n" +
                    " ${green}Eageleye$greenreset:“${cyan}Jetzt lass ihn doch mal in Ruhe seine Arbeit machen,\n" +
                    " oder willst du das es so endet wie damals im Mexico??\n" +
                    " Wo er dir weil du ihn wiedermal gehetzt hast dir den halben Arsch weg gesprengt hat??!!${cyanreset}“\n" +
                    " ${green}Johnny$greenreset:“${cyan}Im Winter wenn es kalt wir merke ich das scheiß Schrapnell ab und an immer noch!!${cyanreset}“\n" +
                    " ${green}BOMBEN-BON$greenreset:“${cyan}Das Feuerwerk$fireworks ist bereit$cyanreset“           "
        )
        println("${red}Willst du es knallen lassen?$redreset tippe ein “${green}ja$greenreset ")
        var feuerwerk = readln()
        feuerwerk = "ja"
    } else if ("nein" == lagerAufschlagen) {
        println("Der Trupp zieht weiter")
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                                                    // Funktion für 3. Kampffunktion
fun dertürOeffner() {
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
    println("\n    $red!!!${redreset}${green}$thumbsUp Die Schutztüre wurde in 1000 Stücke gesprengt$greenreset$red$thumbsUp!!!$redreset\n ")
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                                            // Funktion für 3. Statusbericht
fun statusbericht3() {
    println("${red}Sollen unsere Helden das weitere Vorgehen planen?$redreset$green ja / nein$greenreset ")
    var lagerAufschlagen = readln()
    if ("ja" == lagerAufschlagen) {
        println()
        println(
            "$cyan Unsere Helden besprechen ihre Taktik. \n " +
                    "Sie checken ihre Ausrüstung ,und fangen an sich gegenseitig zu pushen\n" +
                    " Eageleye: Geladen und entsichert!! Lasst und diesem H****sohn in den Arsch treten!!.\n" +
                    " The Shadow: Ich werde ihm mit meinem Messer ein breites Lächeln von Ohr zu Ohr bereiten\n" +
                    " Johnny: Na dann mal los auf ihn wartet “meine kleine Freundin“ $laughingCrying$cyanreset "
        )
        println()
        medikitBig()
        armorReg()
        println()
        println("$cyan Mit Adrenalin vollgepumpt und dem Kampfgeist eines Tigers stürmen sie auf in ihr letztes Gefecht zu, welches  ")
        println("${red}zu Ende gekämpft werden muss!$redreset tippe ein “$green ok$greenreset“")
        var weiter = readln()
        weiter = "ok"
    } else if ("nein" == lagerAufschlagen) {
        println("Der Trupp zieht weiter")
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                                        // Funktion für den ENDFIGHT

fun endfight() {
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

    println(
        "\n$red!!!$thumbsUp${redreset}${green}Das Dorf wurde befreit .Die Schreckensherrschaft von dem ${blue}OVERLORD$bluereset$green ist vorbei ,\n" +
                "und unsere Helden werden bejubelt und gefeiert$greenreset $red$thumbsUp!!!$redreset\n "
    )
            println("${cyan}Über Funk$cyanreset:“${green}Gunnery Sergeant Hartman$greenreset${cyan} hier saubere Arbeit Männer!! Zeit nachhause zu kommen$cyanreset\n" +
                    "${green}Johnny$greenreset:“${cyan}Los beeilt euch der Heli wartet vielleicht bekomme ich noch die 2. Hälfte vom SUPERBOWL mit!${cyanreset}“\n" +
                    "${green}BOMBEN-BOB$greenreset:“${cyan}ABER !!...ABER!! Seht ihr nicht diese ganzen hübschen Mädelns!!${cyanreset}“\n" +
                    "${green}Shadow$greenreset:“${cyan}Und ich sehe dein Gesicht willst du dich noch mehr$cyanreset“${cyan}beim rasieren schneiden$cyanreset“${cyan}?\n" +
                    "${green}BOMBEN-BOB$greenreset:“${cyan}Ist schlimmer geworden, ne?$cyanreset“\n" +
                    "${green}Eageleye$greenreset:“${cyan}Deine Frau wird bestimmt nix merken. $cyanreset“\n" +
                    "${cyan}ALLLE $laughingCrying$laughingCrying$laughingCrying$laughingCrying   ")

}
