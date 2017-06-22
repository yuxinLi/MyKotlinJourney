package com.example.mykotlinjourney.kotlin.step.c3

/**
 * 描    述：
 * 作    者：liyx
 * 时    间：2017/6/22
 */


fun main(args: Array<String>) {

    while (true){
        try {
            println("请输入算式例如： 3 + 4")
            var input = readLine() ?: break
            val split = input.trim().split(" ")

            var arg1 = split[0].toDouble()
            var op = split[1].toString()
            var arg2 = split[2].toDouble()

            println(" $arg1 $op $arg2 = ${Operator(op).opFun(arg1 , arg2)}")


        }catch (e: Exception){

        }
    }


}

class Operator(op: String){

    val opFun: (left: Double , right: Double) -> Double

    init {
        opFun = when( op ){
            "+" -> { l,r -> l + r }
            "-" -> {l,r -> l - r}
            else -> {
                throw UnsupportedOperationException(op)
            }

        }
    }

}