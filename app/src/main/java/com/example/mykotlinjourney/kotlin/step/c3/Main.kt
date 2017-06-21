package com.example.mykotlinjourney.kotlin.step.c3

/**
 * 描    述：
 * 作    者：liyx
 * 时    间：2017/6/21
 */

const val FINAL_HELLO_WORLD: String = "HelloWorld"
var helloWorld: String = FINAL_HELLO_WORLD
val FINAL_HELLO_CHINA = "HelloChina"


fun main(args: Array<String>) { // Array<String> -> Unit

    var arg1 = args[0].toInt()
    var arg2 = args[1].toInt()
    println("$arg1 + $arg2 = ${arg1 + arg2}")
    println(int2Long(2))
    println(sum(1 , 2))
    println(sum.invoke(1 , 2))

    args.forEach ForEach@{
        if(it == "q") return@ForEach
        println(it)
    }


}


var sum = {
    arg1: Int , arg2: Int ->
    println("$arg1 + $arg2 = ${arg1 + arg2}")
    arg1 + arg2
}

var int2Long = fun (x: Int): Long{
    return x.toLong()
}


fun checkArgs(args: Array<String>){
    if (args.size != 2){
        printUsage()
        System.exit(0)
    }
}

fun printUsage(){
    println("请传入两个整型参数，例如 1 2")
}