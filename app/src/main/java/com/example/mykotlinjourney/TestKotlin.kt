package com.example.mykotlinjourney

import java.io.File

/**
 * 描    述：
 * 作    者：liyx@13322.com
 * 时    间：2017/5/25
 */



open class Base(p:Int){

    constructor (name: String ,age: Int) : this(age){}

}
class Derived(p:Int):Base(p)

class Derived2:Base{
    constructor (name:String , age:Int) :super( name,age)
    constructor (age:Int) :super(age)
}



class Person(firstName:String){}

class Person2 constructor(firstName:String){}

class Person3(name:String){
    init{
        println("$name")
    }

    val cus = name.toUpperCase()
}

class Person4(val firstName:String , val lastName:String , var age:Int){}

class Preson5 public constructor (name:String){}

class Person6(val name: String){
    constructor (name: String, parent:String) : this(name){
    }
}

class Person7 private constructor(){}


fun forTest(){
    val arr = arrayOf( 1 , 2 , 3)

    for(i in arr.indices){
        println(arr[i])
    }

    for((index,value) in arr.withIndex()){
        println(" $index is $value")
    }
}


fun whenTest3(x:Any) = when(x){
    is String -> x.startsWith("p")
    else ->false
}

fun whenTest2(x:Int){

    when(x){
        0,1 -> println("0 or 1")
        2 -> println("2")
        else -> {
            println("other")
        }
    }

    println(" --------------------")

    when(x){

        in 1..10 -> println(" in 0-10")
//         in validNumbers -> println(" valid ")
        !in 10..20 -> println(" not in 10-20")
        else -> println("ohter")
    }

    println(" --------------------")



}


fun ifTest2(a:Int){

    val b = 2
    var max:Int
    if(a < b){
        max = b
    }else{
        max = a
    }
    println(max)


    max = if(a > b) a else b
    println(max)

}

fun stringTest(){
    val i = 10
    val s = " i = $i"

    println(s)

    val sa = "abc"
    val ss = "$sa.length is ${sa.length}"
    println(ss)

    val price = """
	${'$'}9.99
	"""
    println(price)


}


val test = """
    for (c in "foo")
print(c)
    """


val test2 = """
    |Tell me and I forget.
	|Teach me and I remember.
	|Involve me and I learn.
	|(Benjamin Franklin)
    """.trimMargin()




fun arrayOfMinusOnes(size:Int):IntArray{

//     val arr = Array{ 5 , {i -> (i*i).toString()}}


    return IntArray(size).apply{ fill(-1)}
}


fun transform2(color:String) = when(color){
    "Red" -> 0
    "Green" -> 1
    "Blue" -> 2

    else -> throw IllegalArgumentException(" invalid color")
}


/*class Turtle{
    fun penDown()
    fun penUp()
    fun turn(degrees : Double)()
    fun forward(pixels : Double)()
}

fun withTest(){

    val myTurtle = Turtle()
    with(myTurtle){
        penDown()
        for(i in 1..4){
            forward(100.0)
            turn(90.0)
        }
        penup()
    }

}*/



fun transform(color :String) :Int{
    return when(color){
        "Red" -> 0
        "Green" -> 1
        "Blue" -> 2

        else -> throw IllegalArgumentException(" invalid color")
    }
}

fun tryTest(){
    val result = try{

    }catch(e:ArithmeticException){
        throw IllegalStateException(e)
    }
}

fun ifTest(params : Int){

    val result = if(params == 1){
        "one"
    }else if(params == 2){
        "two"
    }else{
        "other"
    }

}



fun notNullTest(){
    val files  = File("Test").listFiles()
    println(files?.size ?:"empty")
}


fun mapTest(){

    val map = mapOf("a" to 1 , "b" to 2 )

    for((k,v) in map){
        println(" $k -> $v")
        println(map["$k"])
    }
}

object Resource{
    val name = "name"
}


fun lambdaTest(){
    val fruits = listOf("aaa" , "abc" , "bbb")
    fruits.filter { it.startsWith("a") }
            .sortedBy{ it }
            .map{ it.toUpperCase()}
            .forEach { println(it)}
}


fun setTest(){
    val items = setOf("aaa" , "bbb" , "ccc")
    when{
        "ddd" in items -> println("d in")
        "bbb" in items -> println("b in")
        "aaa" in items -> println("a in")

    }
}


fun listTest(){
    val items = listOf("aaa" , "bbb" , "ccc")
    for(item in items){
        println(item)
    }
}


fun rangeTest(){
    val x = 10
    val y = 9
    if( x in 1..y+1){
        println(" $x in 1 - ${y+1}")
    }


    val list = listOf("a" , "b" , "c")
    if(-1 !in 0..list.lastIndex){
        println(" -1 out of range , ${list.lastIndex}")
    }

    for(x in 1..5){
        println(x)
    }


    for(x in 1..10 step 2){
        println(x)
    }


    for(x in 1..10 step 2){
        println(x)
    }
    println("-----")
    for(x in 9 downTo 0 step 3){
        println(x)
    }
}



fun whenTest(obj:Any):String =
        when(obj){
            1 -> "one"
            "hello" -> "hello"
            is Long -> "Long"
            !is String -> " not a string"
            else -> "Unknown"
        }

fun whiletest(){
    val items = listOf("aaa" , "bb" , "cccc")
    var index = 0
    while(index < items.size){
        println( " at $index = ${items[index]}")
        index++
    }
}



fun fortest2(){
    val items = listOf("aaa" , "nnn" , "Ccc")
    for(index in items.indices){
        println("'$index' is ${items[index]}")
    }
}

fun fortest(){
    val items = listOf("aaa" , "bbb" , "Ccc")
    for(item in items){
        println(item)
    }
}


fun printLength(obj:Any){
    println("'$obj' length = ${getStringlength(obj)?:" error .."}")
}



fun getStringlength2(obj:Any):Int?{
    if(obj !is String) return null

    return obj.length
}

fun getStringlength(obj:Any):Int?{
    if(obj is String){
        return obj.length
    }
    return null
}


fun printProduct(arg1:String , arg2:String){
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if(x != null && y != null){
        println(x*y)

    }else{
        println(" $'arg1' or 'arg2' is not a number    ")
    }
}

fun parseInt(str:String):Int?{
    return str.toIntOrNull()
}




fun sum(a: Int, b:Int ):Int{
    return a+b
}

fun sum2(a:Int , b:Int) = a+b

fun sum3(a:Int , b:Int):Unit{
    println(" $a and $b = ${a+b}")
}


fun maxof(a:Int , b:Int) : Int{
    if(a > b){
        return a
    }else{
        return b
    }
}


fun maxof2(a:Int , b:Int) = if(a>b) a else b