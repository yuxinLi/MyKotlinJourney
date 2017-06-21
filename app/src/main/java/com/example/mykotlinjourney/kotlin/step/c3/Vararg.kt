package com.example.mykotlinjourney.kotlin.step.c3

/**
 * 描    述：
 * 作    者：liyx
 * 时    间：2017/6/21
 */

fun main(args: Array<String>) {


    var list = arrayListOf<Int>( 1 , 2 , 3)
    var array = intArrayOf( 1 , 2 , 3)

    hello(2.0 , *array)

}

fun hello(double: Double , vararg ints: Int , string: String = "Hello"){
    println(double)
    ints.forEach (::print)
    println(string)
}