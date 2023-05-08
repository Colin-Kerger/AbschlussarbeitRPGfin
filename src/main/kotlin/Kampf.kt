
var messer: Messer = Messer ("Stich",10..20)
var minigun: Minigun = Minigun("Big Berta",30..50)
var aK47: AK47=AK47("AK47",10..20)
var sniperrifle: Sniperweapon = Sniperweapon("IseeU",22..30)
var sniper: Sniper = Sniper("Eageleye",100,25,sniperrifle)
var ghost: Held = Held("The Shadow",100,50,messer )
var heavygunner: HeavyGunner = HeavyGunner("Johnny",100,100, minigun)

var soldat1: Fusssoldat =Fusssoldat("Larry",80,45,aK47)
var soldat2: Fusssoldat =Fusssoldat("Hugo",80,45, aK47)
var soldat3: Fusssoldat =Fusssoldat("Smith",80,45,aK47)
var fussoldatenMob  = mutableListOf<Fusssoldat>(soldat1,soldat2,soldat3)
var heldenTrupp = mutableListOf<Held>(sniper,heavygunner,ghost)
val red = "\u001B[31m"
val greenBg = "\u001B[42m"
fun kampf(held: Held,gegner: Gegner){
    held.weapon.angriffH(held, gegner)


}
fun ruekkampf(gegner: Gegner,held: Held){
    gegner.weapon.angriffG(gegner,held)

}


fun rundeeins (){
    kampf(heldenTrupp.random(), gegner = fussoldatenMob.random())

    println(" ${soldat1.name}hat Leben,${soldat1.hp} und Rüstung${soldat1.armor}\n " +
            "${soldat2.name} hat Leben${soldat2.hp} und Rüstung${soldat2.armor}\n" +
            " ${soldat3.name} hat Leben${soldat3.hp} und Rüstung${soldat3.armor}")

        if (soldat1.hp <= 0){
            fussoldatenMob.remove(soldat1)
           println("${soldat1.name} wurde getötet")
        }
            if (soldat2.hp <= 0){
                fussoldatenMob.remove(soldat2)
            println("${soldat2.name} wurde getötet")
            }
             if  (soldat3.hp <= 0){
                 fussoldatenMob.remove(soldat3)
            println("$soldat3.name wurde getötet")
             }

    println()
    ruekkampf(fussoldatenMob.random(),heldenTrupp.random())
    println("${sniper.name} hat Leben,${sniper.hp} und Rüstung${sniper.armor}\n " +
            "${ghost.name} hat Leben${ghost.hp} und Rüstung${ghost.armor}\n" +
            " ${heavygunner.name} hat Leben${heavygunner.hp} und Rüstung${heavygunner.armor}\n")


}

fun rundezwei(){
    kampf(heldenTrupp.random(), gegner = fussoldatenMob.random())

    println("${soldat1.name}hat Leben,${soldat1.hp} und Rüstung${soldat1.armor}\n " +
            "${soldat2.name} hat Leben${soldat2.hp} und Rüstung${soldat2.armor}\n" +
            " ${soldat3.name} hat Leben${soldat3.hp} und Rüstung${soldat3.armor}")
    println()
    ruekkampf(fussoldatenMob.random(),heldenTrupp.random())
    println("${sniper.name} hat Leben,${sniper.hp} und Rüstung${sniper.armor}\n " +
            "${ghost.name} hat Leben${ghost.hp} und Rüstung${ghost.armor}\n" +
            " ${heavygunner.name} hat Leben${heavygunner.hp} und Rüstung${heavygunner.armor}")
}
fun rundedrei(){
    kampf(heldenTrupp.random(), gegner = fussoldatenMob.random())

    println("${soldat1.name} hat Leben,${soldat1.hp} und Rüstung${soldat1.armor}\n " +
            "${soldat2.name} hat Leben${soldat2.hp} und Rüstung${soldat2.armor}\n" +
            " ${soldat3.name} hat Leben${soldat3.hp} und Rüstung${soldat3.armor}")
    println()
    ruekkampf(fussoldatenMob.random(),heldenTrupp.random())
    println("${sniper.name} hat Leben,${sniper.hp} und Rüstung${sniper.armor}\n " +
            "${ghost.name} hat Leben${ghost.hp} und Rüstung${ghost.armor}\n" +
            " ${heavygunner.name} hat Leben${heavygunner.hp} und Rüstung${heavygunner.armor}")
}
fun rundevier(){
    kampf(heldenTrupp.random(), gegner = fussoldatenMob.random())

    println("${soldat1.name}hat Leben,${soldat1.hp} und Rüstung${soldat1.armor}\n " +
            "${soldat2.name} hat Leben${soldat2.hp} und Rüstung${soldat2.armor}\n" +
            " ${soldat3.name} hat Leben${soldat3.hp} und Rüstung${soldat3.armor}")
    println()
    ruekkampf(fussoldatenMob.random(),heldenTrupp.random())
    println("${sniper.name} hat Leben,${sniper.hp} und Rüstung${sniper.armor}\n " +
            "${ghost.name} hat Leben${ghost.hp} und Rüstung${ghost.armor}\n" +
            " ${heavygunner.name} hat Leben${heavygunner.hp} und Rüstung${heavygunner.armor}")
}
fun rundefuenf(){
    kampf(heldenTrupp.random(), gegner = fussoldatenMob.random())

    println("${soldat1.name}hat Leben,${soldat1.hp} und Rüstung${soldat1.armor}\n " +
            "${soldat2.name} hat Leben${soldat2.hp} und Rüstung${soldat2.armor}\n" +
            " ${soldat3.name} hat Leben${soldat3.hp} und Rüstung${soldat3.armor}")
    println()
    ruekkampf(fussoldatenMob.random(),heldenTrupp.random())
    println("${sniper.name} hat Leben,${sniper.hp} und Rüstung${sniper.armor}\n " +
            "${ghost.name} hat Leben${ghost.hp} und Rüstung${ghost.armor}\n" +
            " ${heavygunner.name} hat Leben${heavygunner.hp} und Rüstung${heavygunner.armor}")
}
fun rundesechs(){
    kampf(heldenTrupp.random(), gegner = fussoldatenMob.random())

    println("${soldat1.name}hat Leben,${soldat1.hp} und Rüstung${soldat1.armor}\n " +
            "${soldat2.name} hat Leben${soldat2.hp} und Rüstung${soldat2.armor}\n" +
            " ${soldat3.name} hat Leben${soldat3.hp} und Rüstung${soldat3.armor}")
    println()
    ruekkampf(fussoldatenMob.random(),heldenTrupp.random())
    println("${sniper.name} hat Leben,${sniper.hp} und Rüstung${sniper.armor}\n " +
            "${ghost.name} hat Leben${ghost.hp} und Rüstung${ghost.armor}\n" +
            " ${heavygunner.name} hat Leben${heavygunner.hp} und Rüstung${heavygunner.armor}")
}
fun rundesieben(){
    kampf(heldenTrupp.random(), gegner = fussoldatenMob.random())

    println("${soldat1.name}hat Leben,${soldat1.hp} und Rüstung${soldat1.armor}\n " +
            "${soldat2.name} hat Leben${soldat2.hp} und Rüstung${soldat2.armor}\n" +
            " ${soldat3.name} hat Leben${soldat3.hp} und Rüstung${soldat3.armor}")
    println()
    ruekkampf(fussoldatenMob.random(),heldenTrupp.random())
    println("${sniper.name} hat Leben,${sniper.hp} und Rüstung${sniper.armor}\n " +
            "${ghost.name} hat Leben${ghost.hp} und Rüstung${ghost.armor}\n" +
            " ${heavygunner.name} hat Leben${heavygunner.hp} und Rüstung${heavygunner.armor}")
}
fun rundeacht(){
    kampf(heldenTrupp.random(), gegner = fussoldatenMob.random())

    println("${soldat1.name}hat Leben,${soldat1.hp} und Rüstung${soldat1.armor}\n " +
            "${soldat2.name} hat Leben${soldat2.hp} und Rüstung${soldat2.armor}\n" +
            " ${soldat3.name} hat Leben${soldat3.hp} und Rüstung${soldat3.armor}")
    println()
    ruekkampf(fussoldatenMob.random(),heldenTrupp.random())
    println("${sniper.name} hat Leben,${sniper.hp} und Rüstung${sniper.armor}\n " +
            "${ghost.name} hat Leben${ghost.hp} und Rüstung${ghost.armor}\n" +
            " ${heavygunner.name} hat Leben${heavygunner.hp} und Rüstung${heavygunner.armor}")
}
fun rundeneun(){
    kampf(heldenTrupp.random(), gegner = fussoldatenMob.random())

    println("${soldat1.name}hat Leben,${soldat1.hp} und Rüstung${soldat1.armor}\n " +
            "${soldat2.name} hat Leben${soldat2.hp} und Rüstung${soldat2.armor}\n" +
            " ${soldat3.name} hat Leben${soldat3.hp} und Rüstung${soldat3.armor}")
    println()
    ruekkampf(fussoldatenMob.random(),heldenTrupp.random())
    println("${sniper.name} hat Leben,${sniper.hp} und Rüstung${sniper.armor}\n " +
            "${ghost.name} hat Leben${ghost.hp} und Rüstung${ghost.armor}\n" +
            " ${heavygunner.name} hat Leben${heavygunner.hp} und Rüstung${heavygunner.armor}")
}
fun rundezehn(){
    kampf(heldenTrupp.random(), gegner = fussoldatenMob.random())

    println("${soldat1.name}hat Leben,${soldat1.hp} und Rüstung${soldat1.armor}\n " +
            "${soldat2.name} hat Leben${soldat2.hp} und Rüstung${soldat2.armor}\n" +
            " ${soldat3.name} hat Leben${soldat3.hp} und Rüstung${soldat3.armor}")
    println()
    ruekkampf(fussoldatenMob.random(),heldenTrupp.random())
    println("${sniper.name} hat Leben,${sniper.hp} und Rüstung${sniper.armor}\n " +
            "${ghost.name} hat Leben${ghost.hp} und Rüstung${ghost.armor}\n" +
            " ${heavygunner.name} hat Leben${heavygunner.hp} und Rüstung${heavygunner.armor}")
}