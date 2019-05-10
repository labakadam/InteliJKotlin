package Game

import com.sun.jndi.ldap.ext.StartTlsResponseImpl

const val ANONYMOUS = "Anonymous"


fun main() {
    println("Welcome to game 'Race!'")
    println("Please enter your name: ")

    val input = readLine()
    val userName = if (input != null && input.isNotBlank()) input else ANONYMOUS

    if (userName == ANONYMOUS) println("Hello guest") else println("Hello $userName!")

    println("Now you are going to START with driving, good luck!")
    println("$userName you are driving now your first level and you came to the first bend.")
    println("And now $userName please select a direction with writing 'R' for right or 'L' for left or 'S' for straight")



}
