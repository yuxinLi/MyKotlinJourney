package com.example.mykotlinjourney.kotlin.step.c4

/**
 * 描    述：
 * 作    者：liyx
 * 时    间：2017/6/24
 */


fun main(args: Array<String>) {

    val latitude = Latitude.ofDouble(3.0)
    val latitude2 = Latitude.ofLatitude(latitude)

    println(Latitude.TAG)
}


class Latitude private constructor(val value: Double){
    companion object{

        @JvmStatic
        fun ofDouble(double: Double): Latitude{
            return Latitude(double)
        }

        fun ofLatitude( latitude: Latitude): Latitude{
            return ofDouble(latitude.value)
        }

        @JvmField
        val TAG: String = "Latitude"


    }
}