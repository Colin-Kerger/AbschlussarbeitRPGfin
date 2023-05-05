





fun main(){

    var aK47: AK47=AK47("AK47",10..20)
    var sniperrifle: Sniperweapon = Sniperweapon("IseeU",22..30)
    var sniper: Sniper = Sniper("Eageleye",100,25,sniperrifle)
    var ghost: Held = Held("The Shadow",100,50, )
    var heavygunner: HeavyGunner = HeavyGunner("Johnny",100,100)

    var soldat1: Fußsoldat =Fußsoldat("Larry",80,45,aK47)
    var soldat2: Fußsoldat =Fußsoldat("Hugo",80,45, aK47)
    var soldat3: Fußsoldat =Fußsoldat("Smith",80,45,aK47)

    var fussoldatenMob  = mutableListOf<Fußsoldat>(soldat1,soldat2,soldat3)
    var heldenTrupp = mutableListOf<Held>(sniper,heavygunner,ghost)


    var splittergranate: Weapon = Weapon("Letzfetz",40..50,)


    sniper.sniperweapon.angriffH(sniper,fussoldatenMob.random() )
    kampf(sniper, gegner = fussoldatenMob.random())



}

