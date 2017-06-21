package com.example.mykotlinjourney.kotlin.step.c3

/**
 * 描    述：
 * 作    者：liyx
 * 时    间：2017/6/21
 */

class Student{
    fun isNotClothedProperly(): Boolean{
        return false
    }
}

fun main(args: Array<String>) {
    val students = ArrayList<Student>()
    val you = Student()

    for (student in students){
        if(student == you) continue
        if (student.isNotClothedProperly()){
            break
        }
    }
}