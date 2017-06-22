package com.example.mykotlinjourney.kotlin.step.c4.conflict

/**
 * 描    述：
 * 作    者：liyx
 * 时    间：2017/6/22
 */


abstract class A{
    open fun x(): Int = 5
}

interface B{
    fun x(): Int = 1
}

interface C{
    fun x(): Int = 0
}

class D(var y: Int = 0): A() ,B , C{
    override fun x(): Int{
        println("call x(): Int in D")

        super<A>.x()
        super<B>.x()
        return super<C>.x()
    }
}

fun main(args: Array<String>) {

    println(D(0).x())

}