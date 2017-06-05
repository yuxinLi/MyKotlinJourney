package com.example.mykotlinjourney

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 * 描    述：
 * 作    者：liyx@13322.com
 * 时    间：2017/6/5
 */





class User2(val map:Map<String,Any?>){
    val name: String by map
    val age: Int by map
}

class User3{
    var name: String by Delegates.observable("<no name>"){
        prop , old , new->
        println ("$old - > $new")
    }

}

val lazyValue:String by lazy{
    println("lazy")
    "hello"
}


class Example{
    var p:String by Delegate()
}

class Delegate{
    //     operator fun getValue(thisRef: Any? , property: KProperty<*>):String{
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef , delegate '${property.name} in $thisRef'"
    }

    operator fun setValue(thisRef:Any? , property: KProperty<*>, value:String){
        println("$value has bean assigned to '${property.name} in $thisRef'  ")
    }
}



interface Factory<T>{
    fun create():T
}

class MyClass6{

    companion object:Factory<MyClass6>{
        override fun create():MyClass6 = MyClass6()
    }

}

interface Base6{
    fun print()
}

class BaseImpl6(val x:Int):Base6{
    override fun print(){println(x)}
}

class Derived6(b:Base6) :Base6 by b




object Obj{
    fun register(){
        println("register")
    }
}

fun uncTest(){


    val user = User3()
    user.name = "sss"
    user.name = "aaa"


    val user2 = User2(mapOf("name" to "jay" ,
            "age" to 18))

    println(" ${user2.name} - > ${user2.age}")


    println(lazyValue)
    println(lazyValue)

    var e = Example()
    println(e.p)


    val ab:A6 = object:A6(1),B6{
        override val y = 15
    }

    println(ab.y)

    val abc = object{
        var x:Int = 0
        var y:Int = 0
    }
    println(abc.y+abc.x)


    c6().bar()
//     c6().publicFoo().x
//
    Obj.register()

    MyClass6.create()
    var com = MyClass6.Companion

    val b = BaseImpl6(6)
    Derived6(b).print()
}


class c6{
    private fun foo() = object{
        val x:String = "X"
    }

    fun publicFoo() = object{
        val x:String="x"
    }

    fun bar(){
        val x1 = foo().x
//         val x2 = publicFoo().x
    }
}


open class A6(x:Int){
    public open val y:Int = x
}

interface B6{}





fun classTest(){
    println(Outer2.Nested().foo())
    println(Outer2().Inner().foo())

//     window.add(obj:MouseAdapter(){
//         override fun click(e:MouseEvent){}
//         override fun move(e:MouseEvent){}
//     })

}

enum class Direction{
    NORTH , SOUTH , WEST, EAST
}

enum class RGB(val rgb:Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

inline fun <reified T:Enum<T>> printValues(){
    println(enumValues<T>().joinToString{it.name})
}

enum class ProtocloState{
    WAITING{
        override fun signal() = TALKING
    },

    TALKING{
        override fun signal() = WAITING
    };

    abstract fun signal():ProtocloState
}


class Outer2{
    private val bar:Int = 1
    class Nested{
        fun foo() = 2
    }

    inner class Inner{
        fun foo() = 3
    }
}
