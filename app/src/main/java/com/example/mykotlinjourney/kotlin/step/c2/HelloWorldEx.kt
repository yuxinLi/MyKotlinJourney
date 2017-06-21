package com.example.mykotlinjourney.kotlin.step.c2

/**
 * 描    述：
 * 作    者：liyx
 * 时    间：2017/6/21
 */


val FINAL_HELLO_WORLD: String = "HelloWorld"
var helloworld: String = FINAL_HELLO_WORLD
var nullableHelloworld: String? = helloworld
var helloworldArray: Array<Char> = arrayOf('h' , 'l')
var helloworldCharArray: CharArray = charArrayOf('h' , 'l')
var helloworldLengh: Int = helloworld.length
var helloworldLenghLong: Long = helloworldLengh.toLong()

fun main(args: Array<String>) {

    println("final hello world: " + FINAL_HELLO_WORLD)
    println("assignable hello world: " + helloworld)
    println("hello world from nullable type: " + nullableHelloworld)
    println("hello world from array: " + helloworldArray.joinToString { "" })
    println("hello world from char array: " + String(helloworldCharArray))
    println("class name hello world: " + helloworld::class.java.simpleName)
    println("class name hello world: " + helloworld::class.java.name)

    println("part of the class name of HelloWorld: "
            + helloworld::class.java.simpleName.slice(0 until 5)) // [0, 5)

    println("part of the class name of HelloWorld: "
            + helloworld::class.java.simpleName.slice(0 .. 5)) // [0, 5]

    println("the length of hello world is : " + helloworldLengh)
    println("the length of hello world is (long): " + helloworldLenghLong)

}



