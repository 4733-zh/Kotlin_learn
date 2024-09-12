package com.example.lambdalearn

import android.view.View
import android.widget.Button

fun main(){
//    val list = mutableListOf("Apple", "Banana", "Orange", "Pear","Grape")
//    list.add("Watermelon")
//    for (fruit in list){
//        println(fruit)
//    }

//    val map = mapOf("Apple" to 1,"Banana" to 2,"Orange" to 3,"Pear" to 4,"Grape" to 5)
//    for ((fruit,number) in map){
//        println("fruit is "+fruit+",number is "+number)
//    }

//    val list = mutableListOf("Apple", "Banana", "Orange", "Pear","Grape")
//    val maxLengthFruit = list.maxBy { it.length }
    val list = mutableListOf("Apple", "Banana", "Orange", "Pear","Grape")
    val newList = list.filter { it.length<=5 }
                      .map { it.toUpperCase() }
    val anyResult = list.any { it.length<=5 }
    val allResult = list.all { it.length<=5 }
    println("anyResult is "+anyResult+",allResult is "+allResult)
////    val button=Button(this)
//
//
//    button.setOnClickListener {
//    println("test")
//}
//    button.setOnClickListener(object : View.OnClickListener {
//    override fun onClick(view: View?) {
//        println("test")
//    }
//})






}