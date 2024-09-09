package com.example.demo1

import kotlin.math.max

fun main(){
//    for (i in 0 until 10 step 2){ //相当于i = i + 2
//        println(i)
//    }

    for (i in 10 downTo 1){
        println(i)
    }
}
//fun largerNumber(num1:Int,num2: Int)= max(num1,num2)
fun largerNumber(num1:Int,num2:Int)= if (num1>num2)num1 else num2
//
//fun getScore(name:String) = if(name == "Tom"){
//    86
//}else if (name == "Jim") {
//    77
//}else if (name == "Jack") {
//    95
//}else if (name == "Lily") {
//    100
//}else  {
//    0
//}

fun getScore(name:String) = when(name){
    "Tom" ->86
    "Jim" ->77
    "Jack" ->95
    "Lily" ->100
    else -> 0
}
fun checkNumber(num:Number){
    when(num){
        is Int-> println("number is Int")
        is Double -> println("number is Double")
        else -> println("number not support")
    }
}
fun getScore2(name:String) = when{
    name.startsWith("Tom")->86//这样不管是叫Tom的还是Tommy的都是86
    name == "Jim" ->77
    name == "Jack" ->95
    name == "Lily" ->100
    else -> 0
}