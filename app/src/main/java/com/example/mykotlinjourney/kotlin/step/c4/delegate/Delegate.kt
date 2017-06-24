package com.example.mykotlinjourney.kotlin.step.c4.delegate

import kotlin.reflect.KProperty

/**
 * 描    述：
 * 作    者：liyx
 * 时    间：2017/6/24
 */

class Delegate{

    val hello by lazy{
        "hello"
    }

    val h2 by X()
    var h3 by X()
}

class X{

    private var value: String? = null
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("getValue , $thisRef -> ${property.name}")
        return value?:""
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String){
        println("setValue , $thisRef -> ${property.name} = $value")
        this.value = value
    }

}

fun main(args: Array<String>) {
    val de = Delegate()
    println(de.hello)
    println(de.h2)
    println(de.h3)
    de.h3 = " h3"
    println(de.h3)
}