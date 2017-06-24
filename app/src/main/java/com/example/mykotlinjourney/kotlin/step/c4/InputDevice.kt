package com.example.mykotlinjourney.kotlin.step.c4

/**
 * 描    述：
 * 作    者：liyx
 * 时    间：2017/6/24
 */

interface InputDevice {
    fun input(event: Any)
}

interface USBInputDevice: InputDevice
interface BLEInputDevice: InputDevice
interface OpticalMouse

abstract class USBMouse(val name: String): USBInputDevice,OpticalMouse{
    override fun input(event: Any) {
    }

    override fun toString(): String {
        return name
    }
}

class LogiMouse: USBMouse("aaa")
class Computer{
    fun addUser(input: USBInputDevice){
        println("add USBInputDevice : $input")
    }

    fun addBle(input: BLEInputDevice){
        println("add BLEInputDevice $input")
    }

    fun addDevice(input: InputDevice){
        when(input){
            is BLEInputDevice -> addBle(input)
            is USBInputDevice -> addUser(input)
            else -> throw IllegalArgumentException("not support")
        }
    }
}

fun main(args: Array<String>) {
    val computer = Computer()
    computer.addDevice(LogiMouse())
}