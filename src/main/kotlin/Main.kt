





fun main(){
    var splittergranate: Weapon = Weapon("Letzfetz",40..50,)
    var messer: Messer = Messer ("Wie durch Butter",10..20)
    var minigun: Minigun = Minigun("Dicken Berta",30..50)
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
    val red = "\u001b[31m"
    val redreset ="\u001b[0m"
    val green="\u001b[32m"
    val greenreset="\u001b[0m"
    val blue="\u001b[34m"
    val bluereset= "\u001b[0m"
    frontline()


}

