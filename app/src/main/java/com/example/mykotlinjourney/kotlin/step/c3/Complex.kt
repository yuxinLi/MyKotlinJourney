package com.example.mykotlinjourney.kotlin.step.c3

/**
 * 描    述：
 * 作    者：liyx
 * 时    间：2017/6/21
 */



class Complex(var real: Double , var imaginary: Double){
    operator fun plus(other: Complex):Complex{
        return Complex(real + other.real , imaginary + other.imaginary)
    }

    operator fun plus(other: Int): Complex{
        return Complex(real + other , imaginary)
    }

    operator fun invoke():Double{
        return Math.hypot(real , imaginary)
    }

    override fun toString(): String{
        return "$real + $imaginary"
    }
}

class Book {
    infix fun on(any: Any):Boolean{
        return false
    }
}

class Desk


fun main(args: Array<String>) {
    var complex1 = Complex(2.0 , 3.0)
    var complex2 = Complex(3.0 , 4.0)

    println(complex1.plus(complex2))
    println(complex1.plus(2))
    println(complex1.invoke())

}