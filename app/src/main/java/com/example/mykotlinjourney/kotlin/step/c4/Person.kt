package com.example.mykotlinjourney.kotlin.step.c4

/**
 * 描    述：
 * 作    者：liyx
 * 时    间：2017/6/22
 */

abstract class Person(open val age: Int){
    abstract fun work()
}

class MaNong(age: Int): Person(age){

    override val age: Int
    get() = 0

    override fun work() {
        println("$age didid")
    }
}

class CeShi(age: Int): Person(age){
    override fun work() {
        println("$age , ceshi ..")
    }
}

fun main(args: Array<String>) {

    println(MaNong(20).work())
    println(CeShi(21).work())

}
