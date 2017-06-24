package com.example.mykotlinjourney.kotlin.step.c4

/**
 * 描    述：
 * 作    者：liyx
 * 时    间：2017/6/24
 */

class House
class Flower

class Countyard{

    private val house: House = House()
    private val flower: Flower = Flower()
}

class ForbiddenCity{
    internal val houses = arrayOf(House() , House())
    val flowers = arrayOf(Flower() , Flower())
}


fun main(args: Array<String>) {
    val cou = Countyard()
    val f = ForbiddenCity()

    f.flowers
    f.houses
}