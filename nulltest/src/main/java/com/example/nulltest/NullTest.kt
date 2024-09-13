package com.example.nulltest

var content:String?="hello"

fun main(){
//    doStudy(null)

    printParams(string = "HEE")

//    if (content!=null){
//        printUpperCase()
//    }
}

//fun doStudy(study: Study?) {
//    study?.readBooks()
//    study?.doHomework()
//}

fun printParams(num:Int? = 2,string: String){
    println("num is $num,string is $string")
}


fun getTextLength(text:String?)= text?.length?:0

fun printUpperCase(){
    val upperCase = content!!.toUpperCase()
    println(upperCase)
}