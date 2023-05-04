





fun main(){


    var sniperrifle: Sniperweapon = Sniperweapon("IseeU",22..30)
    var sniper: Sniper = Sniper("Eageleye",100,25,sniperrifle)
    var aK47: AK47=AK47("AK47",10..20)
    var soldat1: Fußsoldat =Fußsoldat("Larry",80,45,aK47)
    var soldat2: Fußsoldat =Fußsoldat("Hugo",80,45, aK47)
    var soldat3: Fußsoldat =Fußsoldat("Smith",80,45,aK47)

    var ghost: Held = Held("The Shadow",100,50)
    var heavygunner: HeavyGunner = HeavyGunner("Johnny",100,100)

    var splittergranate: Weapon = Weapon("Letzfetz",40..50,)


    sniper.medikitsmall()



}

