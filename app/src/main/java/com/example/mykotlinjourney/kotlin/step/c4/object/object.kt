package com.example.mykotlinjourney.kotlin.step.c4.`object`

/**
 * 描    述：
 * 作    者：liyx
 * 时    间：2017/6/22
 */

class Driver

interface OnExternalDriverMountListener{
    fun onMount(driver: Driver)
    fun onUnmount( driver: Driver)
}

abstract class Player

object MusicPLayer: Player() , OnExternalDriverMountListener{
    override fun onMount(driver: Driver) {}
    override fun onUnmount(driver: Driver) {}

    val state = 1

    fun play(url: String){}
    fun stop(){
        println("stop")
    }
}


fun main(args: Array<String>) {
    MusicPLayer.stop()
}

