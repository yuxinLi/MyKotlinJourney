package com.example.mykotlinjourney.kotlin.step.c2

/**
 * 描    述：
 * 作    者：liyx@13322.com
 * 时    间：2017/6/20
 */


fun getName():String?{
    return  "aaa"
}

fun main(args: Array<String>) {
    val name: String = getName() ?: return
    println(name.length)

    val value: String? = "Helloworld"
    println(value!!.length)
}