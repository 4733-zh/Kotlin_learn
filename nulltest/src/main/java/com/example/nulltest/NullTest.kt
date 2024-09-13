package com.example.nulltest

var content:String?="hello"

fun main(){
//    doStudy(null)

    printParams(1)

//    if (content!=null){
//        printUpperCase()
//    }
}

//fun doStudy(study: Study?) {
//    study?.readBooks()
//    study?.doHomework()
//}

fun printParams(num:Int?){
    println(num)
}


fun getTextLength(text:String?)= text?.length?:0

fun printUpperCase(){
    val upperCase = content!!.toUpperCase()
    println(upperCase)
}