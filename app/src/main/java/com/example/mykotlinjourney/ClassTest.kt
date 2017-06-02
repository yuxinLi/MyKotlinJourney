package com.example.mykotlinjourney

/**
 * 描    述：
 * 作    者：liyx@13322.com
 * 时    间：2017/6/2
 */


interface AA{
    fun foo(){ println("AA")}
}
interface BB{
    fun foo(){ println("BB")}
    fun bar(){ println("bar")}
}

class CC:AA{
    override fun foo(){println("CC")}
}

class DD:AA,BB{
    override fun foo(){
        super<AA>.foo()
        super<BB>.foo()
        println("DD")
    }

}





interface Inter{

    fun bar()
    fun foo(){}

    val prop:Int
    val propImpl:String
        get() = "foo"
}

class Child:Inter{
    override fun bar(){}

    override val prop:Int = 1

}


fun addTest(){
    var add = Address("nan")
    println(add.name)
    println(add.sex)
    println(add.city)
    println(add.state)

    var add2 = copyAdd(add)
    println(add2.name)
}


fun copyAdd(add: Address):Address{

    val result = Address("nan")
    result.name = add.name
    return result

}

class Address(sex:String){
    var name:String = "name"
    var street:String = "street"
        private set
    var city:String = "shenzhen"
        get() = "city_cus"
    var state:String?="state"
        get() = "state_cus"

    val sex:String?

    init{
        this.sex = sex
    }

}


abstract class A2{
    abstract fun f()
}

class A3:A2(){
    override fun f(){}
}




open class Base1{
    open fun v(){}
    open fun nv(){}
}

abstract class B2:Base1(){
}



class Ana() : Derived1(){
    override fun nv(){}
    override fun a(){}
}
open class Derived1() : Base1(){
    final override fun v(){}
    open fun a(){}
}

interface Foo{
    val count:Int
}

class Bar1(override val count :Int):Foo{}
class Bar2:Foo{
    override var count:Int = 0
}

open class A{
    open fun f(){println("A")}
    fun a(){}
}

interface B{
    fun f(){println("B")}
    fun b(){}
}

class C():A(),B{

    override fun f(){
        super<A>.f()
        super<B>.f()
    }
}