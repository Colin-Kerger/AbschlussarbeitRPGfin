fun kampf(held: Held,gegner: Gegner){
    held.weapon.angriffH(held, gegner)

}
fun ruekkampf(gegner: Gegner,held: Held){
    gegner.weapon.angriffG(gegner,held)
}