package com.example.mykotlinjourney.kotlin.step.c2

/**
 * 描    述：
 * 作    者：liyx
 * 时    间：2017/6/20
 */


val anInt: Int = 8
val anotherInt: Int = 0xFF
val moreInt: Int = 0b0000011
val maxInt: Int = Int.MAX_VALUE
val minInt: Int = Int.MIN_VALUE

val aLong: Long = 123232323445455454
val anotherLog: Long = 123
val maxLong: Long = Long.MAX_VALUE
val minLong: Long = Long.MIN_VALUE

val aFloat: Float = 2.0F
val anotherFloat: Float = 1E3f
val maxFloat: Float = Float.MAX_VALUE
val minFloat: Float = Float.MIN_VALUE

val aDouble: Double = 2.0
val anotherDouble = 3.1415926
val maxDouble: Double = Double.MAX_VALUE
val minDouble: Double = Double.MIN_VALUE

val aShort: Short = 123
val maxShort: Short = Short.MAX_VALUE
val minShort: Short = Short.MIN_VALUE

val maxByte: Byte = Byte.MAX_VALUE
val minByte: Byte = Byte.MIN_VALUE



fun main(args: Array<String>) {
    println(anInt)
    println(anotherInt)
    println(moreInt)
    println("------ max min begin-----")
    println(maxInt)
    println(Math.pow(2.0, 31.0) - 1)
    println(minInt)
    println(-Math.pow(2.0, 31.0) - 1)

    println("------ max min end-----")

    println(maxByte)
    println(minByte)


}












