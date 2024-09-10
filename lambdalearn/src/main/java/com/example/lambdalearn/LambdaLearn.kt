package com.example.lambdalearn

fun main(){
//    val list = mutableListOf("Apple", "Banana", "Orange", "Pear","Grape")
//    list.add("Watermelon")
//    for (fruit in list){
//        println(fruit)
//    }

    val map = mapOf("Apple" to 1,"Banana" to 2,"Orange" to 3,"Pear" to 4,"Grape" to 5)
    for ((fruit,number) in map){
        println("fruit is "+fruit+",number is "+number)
    }
}