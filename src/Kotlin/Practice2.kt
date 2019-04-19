package Kotlin

import jdk.nashorn.internal.objects.NativeArray
import kotlin.random.Random

/*
Create a collection of integers
Use Random to fill the collection with 100 random numbers between 1 and 100.
Go through the collection from start to end and print its elements up to the point where an element is less than or equal to 10
 */
fun main() {

    val randomList =  List(100) { Random.nextInt(0, 100) }
    for (number in randomList) if (number<11) println(number) else break
}