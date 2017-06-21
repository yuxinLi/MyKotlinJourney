package com.example.mykotlinjourney.kotlin.step.c2

/**
 * 描    述：
 * 作    者：liyx
 * 时    间：2017/6/21
 */


val string: String = "hello"
val charString: String = String(charArrayOf('h','e','l','l','o'))


fun main(args: Array<String>) {
    println(string == charString)
    println(string === charString)


    val arg1 = 1
    val arg2: Int = 2

    println(""+arg1 + "+" + arg2 + " = " +(arg1 + arg2))
    println("$arg1 + $arg2 = ${arg1+ arg2}")


    val hello = " hello \"trump\""
    println(hello)

    val salary: Int = 1
    println("\$$salary")

    val rawString: String ="""
    \t
        \n
\\\\\\$$$ salary
"""
    println(rawString)

}
