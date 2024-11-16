package com.manop.homework11

fun main() {
    val i: Int = 6
    val b1 = i.toByte()
    println(b1)

    val b2: Byte = 1
    println(b2)

    val i4: Int = b2.toInt()
    println(i4)

    val i5: String = b2.toString()
    println(i5)

    val i6: Double = b2.toDouble()
    println(i6)

    val oneMillion = 1_000_000
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    var fish = 1
    fish = 2
    val aquarium = 1
    //aquarium = 2

    var fish2: Int = 12
    var lakes: Double = 2.5

    val numberOfFish = 5
    val numberOfPlants = 12
    println("I have $numberOfFish fish" + " and $numberOfPlants plants")
    println("I have ${numberOfFish + numberOfPlants} fish and plants")

    val numberOfFish2 = 50
    val numberOfPlants2 = 23
    if (numberOfFish2 > numberOfPlants2) {
        println("Good ratio!")
    } else {
        println("Unhealthy ratio")
    }

    val fish3 = 50
    if (fish3 in 1..100) {
        println(fish3)
    }

    if (numberOfFish == 0) {
        println("Empty tank")
    } else if (numberOfFish < 40) {
        println("Got fish!")
    } else {
        println("That's a lot of fish!")
    }

    when (numberOfFish) {
        0  -> println("Empty tank")
        in 1..39 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }

    //var rocks: Int = null
    var marbles: Int? = null

    var fishFoodTreats = 6
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
    }

    var fishFoodTreats2 = 6
    fishFoodTreats = fishFoodTreats2?.dec() ?: 0

    var s = ""
    val len = s!!.length   // throws NullPointerException if s is null

    val school = listOf("mackerel", "trout", "halibut")
    println(school)

    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")

    val school2 = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(school2))

    val mix = arrayOf("fish", 2)

    val numbers = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers
    println(foo2[5])

    val numbers4 = intArrayOf(1, 2, 3)
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers4, oceans, "salmon")
    println(oddList)

    val array = Array (5) { it * 2 }
    println(java.util.Arrays.toString(array))

    val school3 = arrayOf("shark", "salmon", "minnow")
    for (element in school3) {
        print(element + " ")
    }

    for ((index, element) in school3.withIndex()) {
        println("Item at $index is $element\n")
    }

    for (i in 1..5) print(i)

    for (i in 5 downTo 1) print(i)

    for (i in 3..6 step 2) print(i)

    for (i in 'd'..'g') print (i)

    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in the water\n")

    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubbles in the water\n")

    repeat(2) {
        println("A fish is swimming")
    }
}