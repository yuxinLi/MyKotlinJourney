package com.example.mykotlinjourney

/**
 * 描    述：
 * 作    者：liyx@13322.com
 * 时    间：2017/6/3
 */


abstract class Comparable<in T>{
    abstract fun compareTo(other: T):Int
}

fun demo2(x:Comparable<Number>){
    x.compareTo(1.0)
//    val y:Comparable
}


abstract class Source<out T>{
    abstract fun nextT():T
}

fun demo(strs:Source<String>){
    val objs: Source<Any> = strs
}


fun fanTest(){
    val box:Box<Int> = Box<Int>(1)
    println("${box.value}")

    val box2 = Box(2)
    println("${box2.value}")
}

class Box<T>(t:T){
    val value = t
}


fun dataTest(){
    val jack = User(name="jack" , age=1)
    val olderJack = jack.copy(age = 2)
    println(olderJack.age)
}

data class User(val name:String = "" , var age:Int=1)



fun et(){
    C10().caller(D10())
    C11().caller(D10())
    C10().caller(D11())
}


open class D10{}
class D11:D10(){}
open class C10{
    open fun D10.foo(){
        println("d10 in c10")
    }

    open fun D11.foo(){
        println("d11 in c10")
    }

    fun caller(d:D10){
        d.foo()
    }
}

class C11:C10(){
    override fun D10.foo(){
        println("d10 in c11")
    }

    override fun D11.foo(){
        println("D11 in c11")
    }
}





class C4{
    fun Bar.bb(){
        toString()
        this@C4.toString()
    }
}

class Bar{
    fun bar(){println(" B bar")}
}

class CBar{

    fun baz(){ println(" c barz")}

    fun Bar.foo(){
        bar()
        baz()
    }

    fun caller(bar : Bar){
        bar.foo()
    }

}




class MyClass{
    companion object{}
}

fun MyClass.Companion.foo(){}



val <T> List<T>.lastIndex: Int
    get() = size - 1

fun Any?.toString():String{
    if(this == null) return "null"
    return toString()
}


class EE{
    fun foo(){println("EE")}
}

fun EE.foo(a:Int){println(" EE _ EE")}


open class CE
class DE:CE()

fun CE.foo() = "CE"
fun DE.foo() = "DE"
fun printlnFoo(ce:CE){
    println(ce.foo())   // "CE"
}


fun extendTest(){

    CBar().caller(Bar())

    MyClass.foo()

    val mu = mutableListOf(1 , 2 , 3)
    mu.swap(0 , 2)

    println(" ${mu[0]} , ${mu[2]}")


    val mu2 = mutableListOf("a" , "b" , "c")
    mu2.swap2(0 , 2)
    println(" ${mu2[0]} , ${mu2[2]}")


    val a = 5;
    val b = a.increase(2)
    println(b)


    val de = DE()
    printlnFoo(de)

    EE().foo(1)
}

fun Int.increase(add:Int):Int{
    return this + add
}

fun <T> MutableList<T>.swap2(index1: Int , index2: Int){
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}



fun MutableList<Int>.swap(index1:Int , index2:Int){
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}
