package com.example.mykotlinjourney.kotlin.step.c4

/**
 * 描    述：
 * 作    者：liyx
 * 时    间：2017/6/23
 */

enum class LogLevel(val id: Int){
    VERBOSE(0) , DEBUG(1) , INFO(2);

    fun getTag(): String{
        return "$id - $name"
    }

    override fun toString(): String {
        return "$name , $ordinal"
    }
}

fun main(args: Array<String>) {
//    println(LogLevel.VERBOSE)
//    LogLevel.values().map (::println)
//
//    println(LogLevel.valueOf("INFO"))

    println(LogLevel2.DEBUG)
}

class LogLevel2 protected constructor(){
    companion object{
        val VERBOSE = LogLevel2()
        val DEBUG = LogLevel2()
    }
}

