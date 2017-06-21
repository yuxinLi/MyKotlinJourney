package com.example.mykotlinjourney.kotlin.step.c3

/**
 * 描    述：
 * 作    者：liyx
 * 时    间：2017/6/21
 */


private const val USERNAME = "kotlin"
private const val PASSWORD = "123"
private const val ADMIN_USER = "admin"
private const val ADMIN_PASSWD = "admin"

private const val DEBUG = 1
private const val USER = 0

fun main(args: Array<String>) {
//    var mode = if (args.isNotEmpty() && args[0] == "1"){
//        DEBUG
//    }else{
//        USER
//    }

    var mode = DEBUG

    println("请输入用户名")
    val userName = readLine()

    println("请输入密码")
    val password = readLine()

    if(mode == DEBUG && userName == ADMIN_USER && password == ADMIN_PASSWD){
        println("管理员登录")
    }else if (userName == USERNAME && password == PASSWORD){
        println("登录成功")
    }else{
        println("登录失败")
    }



}
