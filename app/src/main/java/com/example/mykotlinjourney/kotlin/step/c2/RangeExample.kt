package com.example.mykotlinjourney.kotlin.step.c2

/**
 * 描    述：
 * 作    者：liyx
 * 时    间：2017/6/20
 */

val range: IntRange = 0 .. 10 // [0 , 10]
val range_exclusive: IntRange = 0 until 10 // [0 , 10)
val range_empty: IntRange = 0 .. -1

fun main(args: Array<String>) {
    println(range_empty.isEmpty())
    println(range_exclusive.contains(10))
    println(10 in range_exclusive)

    for (i in range_exclusive){
        print("$i , ")
    }
}