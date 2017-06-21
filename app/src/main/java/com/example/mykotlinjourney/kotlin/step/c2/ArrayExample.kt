package com.example.mykotlinjourney.kotlin.step.c2

/**
 * 描    述：
 * 作    者：liyx
 * 时    间：2017/6/21
 */


val arrayOfInt: IntArray = intArrayOf(1 , 2 , 3)
val arrayOfChar: CharArray = charArrayOf('a' , 'b')
val arrayOfString: Array<String> = arrayOf("aaaa" , "bbbbb")

fun main(args: Array<String>) {
    println(arrayOfInt.size)

    for (int in arrayOfInt){
        println(int)
    }

    println(arrayOfString[1])
    println(arrayOfChar)
    println(arrayOfInt.slice(1..2))

}