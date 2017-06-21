package com.example.mykotlinjourney.kotlin.step.c2

/**
 * 描    述：
 * 作    者：liyx
 * 时    间：2017/6/21
 */

fun main(args: Array<String>) {

    val parent: Parent = Parent()
    val child: Child? = parent as? Child
    println(child)

    val string: String? = "Hello"
    println(string?.length)

}
