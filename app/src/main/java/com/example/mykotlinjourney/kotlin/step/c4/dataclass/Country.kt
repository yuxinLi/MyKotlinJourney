package com.example.mykotlinjourney.kotlin.step.c4.dataclass

import com.example.mykotlinjourney.kotlin.step.c4.annotation.Poko

/**
 * 描    述：
 * 作    者：liyx
 * 时    间：2017/6/24
 */

@Poko
data class Country(val id: Int , val name: String)

class ComponentX{

    operator fun component1(): String{
        return "hello"
    }

    operator fun component2(): Int{
        return 1
    }

    operator fun component3(): Int{
        return 1
    }

    operator fun component4(): Int{
        return 0
    }

}

fun main(args: Array<String>) {

    val ch = Country(1 , "chana")
    println(ch)
    println(ch.component1())
    println(ch.component2())
    val (id, name) = ch
    println(id)
    println(name)

    val comp = ComponentX()
    val (a,b,c,d) = comp
    println(" $a $b$c$d")



}