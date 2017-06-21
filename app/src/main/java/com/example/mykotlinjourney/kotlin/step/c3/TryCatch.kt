package com.example.mykotlinjourney.kotlin.step.c3

/**
 * 描    述：
 * 作    者：liyx
 * 时    间：2017/6/21
 */

fun main(args: Array<String>) {

    var tr = try{
        args[0].toInt() / args[1].toInt()
    }catch (e: Exception){
        e.printStackTrace()
        0
    }

    println(tr)


}