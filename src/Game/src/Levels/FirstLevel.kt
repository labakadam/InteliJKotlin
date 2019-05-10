package Levels

import Entity.Enemies.Warior
import Entity.Player
import Game.dice
import Weapons.Main.Bow
import Weapons.Main.Sword


var dValue:Int = 0

fun first(){

    Player.heal()
    println("Igra započinje")
    println("-----------------")
    Wait()
    println("Nalazite se u šumi")
    Wait()
    println("U pozadini se glasaju ptice")
    Wait()
    println("U daljini vidite nekakvu ruševinu")
    Wait()
    println("Čujete nekakve glasove")
    Wait()

    println("A:Idete prema ruševini")
    println("B:Idete prema glasovima")
    println("Šta ćete odabrati? (odaberite 'A' ili 'B')")
    Player.decision.add(readLine() ?: "prazno")
    when(Player.decision.last()){
        "A"-> { Rusevina()}
        "B" -> {Glasovi()}
        else->{
            println("Niste odabrali točno.Pokusajte ponovno")
            Wait()
            first()
        }

    }
    Wait()
    println("")





}

fun Forest() {

    println("Coming to the door")
    Wait()
    println("here is your enemy....")
    Wait()
    println("A: take the sword and attack him")
    println("B: run..")
    Player.decision.add(readLine() ?: "empty")
    when(Player.decision.last()){
        "A" -> {
            val Enemies : Array<Warior> = Array(3){ Warior() }

            Player.weapon = Sword()
            Player.health
            Player.PlayerHealth()
            println("Enemy is ready to fight")
            Wait()
            println("start fighting")
            Wait()
            dValue = dice()
            when{
                dValue<4 -> {
                    println("first attack")
                    Enemies[0].firstPlayer(Enemies[0].damage)
                    Wait()
                    println("fail")
                    Enemies[1].firstPlayer((Enemies[1].damage))
                    Wait()
                    println("finish him")
                    Enemies[2].firstPlayer(Enemies[2].damage)
                    Wait()
                    Player.PlayerHealth()
                }

            }
            println("first miss")
            Wait()
            Player.ultyAttack = true
            println("you have ekstra power")
            Wait()
            for(enemy in Enemies) Player.enemyPlayer(Player.weapon.damage,enemy)
            println("he is finished")
            Wait()
            Player.PlayerHealth()
            Secound()
        }
        "B" -> {
            Runn()}

        else->{
            println("it's not good, try again")
            Wait()
            Forest()
            println("")
        }
    }


}

fun Whispering() {

    println("You come to group of people")
    Wait()
    println("you are noticed")
    println("you have arrow and sword")
    Wait()
    println("what are you going to do")
    println("A: take a sword")
    println("B: shoot him with the arrow")
    Wait()
    Player.decision.add(readLine() ?: "empty")
    when(Player.decision.last()) {
        "A" -> {
            Player.weapon = Sword()
        }
        "B" -> {
            Player.weapon = Bow()
        }
        else -> {
            Runn()
        }
    }
    println("you take ${Player.weapon.type}")
    Wait()
    println("you take ${Player.weapon.type} and attack")
    println("fight start")
    println("enemy hits you")
    Wait()
    Player.Injury()
    Player.PlayerHeaforestlth()
    Wait()
    println("you take down one and try to run")
    Wait()
    println("A: kill others?")
    println("B: runn")
    println("Pick")
    Player.decision.add(readLine() ?: "empty")
    when(Player.decision.last()){

        "A" -> suicide()
        "B" -> forest()
        else ->
        {
            println("run from everything")
            Runn()
            Wait()
        }

    }




}
fun Forest() {


    println("you take a rest")
    Player.Rest()
    Wait()
    Player.PlayerHealth()
    println("here is a big hause")
    Wait()
    println("somebody is inside")
    Wait()
    println("here is you enemy")
    Wait()
    println("A: attack")
    println("B: runn..")
    Player.decision.add(readLine() ?: "empty")
    when(Player.decision.last()){
        "A" -> {
            val Enemies : Array<Warior> = Array(3){ Warior() }

            Player.weapon = Sword()
            Player.health
            Player.PlayerHealth()
            println("battle begin")
            Wait()
            println("start fight")
            Wait()
            dValue = dice()
            when{
                dValue<4 -> {
                    println("first attack")
                    Enemies[0].firstPlayer(Enemies[0].damage)
                    Wait()
                    println("you missed")
                    Enemies[1].firstPlayer((Enemies[1].damage))
                    Wait()
                    println("he is finished")
                    Enemies[2].firstPlayer(Enemies[2].damage)
                    Wait()
                    Player.PlayerHealth()
                }

            }
            println("miss")
            Wait()
            Player.ultyAttack = true
            println("you got a extra power")
            Wait()
            for(enemy in Enemies) Player.enemyPlayer(Player.weapon.damage,enemy)
            println("he is dead")
            Wait()
            Player.PlayerHealth()
            Secound()
        }
        "B" -> {
            Runn()}

        else->{
            println("pick again")
            Wait()
            Forest()
            println("")
        }
    }

}
fun Suicide() {

    Player.PlayerHealth()
    println("Ostala su jos dva neprijatelja i krenula su na tebe")
    println("Jednog uspiješ riješit dok te drugi ubije")
    Wait()
    Player.Injury()
    Player.PlayerHealth()
    println("Igra je gotova. Umro si!")
    println("YOU LOSE")
    Wait()
    println()
    first()

}

fun Runn() {
    println("YOU LOSE")
    println("Vraćate se na početak igre")
    Wait()
    first()
}

fun Wait(time: Long = 3500){
    Thread.sleep(time)
}