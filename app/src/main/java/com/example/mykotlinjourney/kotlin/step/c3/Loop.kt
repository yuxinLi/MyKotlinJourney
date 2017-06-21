package com.example.mykotlinjourney.kotlin.step.c3

/**
 * 描    述：
 * 作    者：liyx
 * 时    间：2017/6/21
 */


fun main(args: Array<String>) {

//    var x = 5
//    while (x > 0){
//        println(x)
//        x--
//    }
//
//    x = 5
//    do {
//        println(x)
//        x--
//    }while (x > 0)


    for(arg in args){
        println(arg)
    }

    for((index,value) in args.withIndex()){
        println("$index -> $value")
    }

    for (indexValue in args.withIndex()){
        println("${indexValue.index} -> ${indexValue.value}")
    }

    val myList = MyIntList()
    myList.add(1)
    myList.add(2)
    myList.add(3)

    for (i in myList){
        println(i)
    }


}




class MyIterator(var iterator: Iterator<Int>){
    operator fun next():Int{
        return iterator.next()
    }

    operator fun hasNext():Boolean{
        return iterator.hasNext()
    }
}


class MyIntList{
    private val list = ArrayList<Int>()
    fun add(int : Int){
        list.add(int)
    }

    fun remove(int: Int){
        list.remove(int)
    }

    operator fun iterator(): MyIterator{
        return MyIterator(list.iterator())
    }


}
