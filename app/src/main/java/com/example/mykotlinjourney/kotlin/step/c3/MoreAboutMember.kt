package com.example.mykotlinjourney.kotlin.step.c3

/**
 * 描    述：
 * 作    者：liyx
 * 时    间：2017/6/21
 */

class X

class A{
    var b = 0
    lateinit var c: String
    lateinit var d: X
    val e: X by lazy {
        println("init e")
        X()
    }
    var cc: String? = null
}

fun main(args: Array<String>) {
    println("start")
    val a = A()
    println("init a")
    println(a.b)
    println(a.e)
    a.d = X()
    println(a.d)
    a.c = "sss"
    println(a.c)

    println(a.cc?.length)
}