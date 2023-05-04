import kotlin.random.Random

class HeavyGunner(name: String, hp: Int, armor: Int) : Held(name, hp, armor) {



     fun granatewerfen(held: Held) {
        var granatenname = "LETZFETZ"
        var wurf = (20..45).random()
        var treffer = Random.nextBoolean()

        if (treffer == true) {
            println("$name schmeist $granatenname  und verursacht $wurf Schaden!!! ")
        } else
            println("hat daneben geworfen!!!")
    }

    fun heavyatk() {
        var salve = (20..30).random()
        var treffer = Random.nextBoolean()

        if (treffer == true) {
            println("$name schießt und trifft mit $salve Schadenspunkten!!! ")
        } else
            println("$name hat daneben geschossen!!!")
    }
}
