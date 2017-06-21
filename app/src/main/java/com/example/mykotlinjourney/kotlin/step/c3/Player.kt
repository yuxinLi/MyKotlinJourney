package com.example.mykotlinjourney.kotlin.step.c3

/**
 * 描    述：
 * 作    者：liyx
 * 时    间：2017/6/21
 */

class Player{

    enum class State{
        IDLE , BUFFERING ,PLAYING , PAUSE
    }

    private var state = State.IDLE

    fun pause(){
        when(state){
            Player.State.IDLE , Player.State.BUFFERING ->  println("aa")
        }
    }

    fun resume(){
        when(state){
            Player.State.BUFFERING -> println("bb")
            else -> {
                println("aaa")
            }
        }
    }
}

fun main(args: Array<String>) {
    var b = Player()
    b.pause()
    b.resume()
}