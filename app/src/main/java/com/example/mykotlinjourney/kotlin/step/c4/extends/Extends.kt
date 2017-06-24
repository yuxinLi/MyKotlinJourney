package com.example.mykotlinjourney.kotlin.step.c4.extends

/**
 * 描    述：
 * 作    者：liyx
 * 时    间：2017/6/24
 */

fun main(args: Array<String>) {
    println("abc"*2)
    println("abc".times(2))

    println("abc".times2(3))
    println("abc".a)
    println("abc".b)

}

operator fun String.times(int: Int): String{

    val sb = StringBuilder()
    for (i in 0 until int){
        sb.append(this)
    }
    return sb.toString()
}


fun String.times2(int: Int): String{
    val sb = StringBuilder()
    for(i in 0 until int){
        sb.append(this)
    }
    return sb.toString()
}


val String.a: String
get() = "aaa"

var String.b: String
set(value){}
get() = "bbb"
