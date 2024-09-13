package com.example.nulltest

import com.example.demo1.Study
var content:String?="hello"

fun main(){
    doStudy(null)

    if (content!=null){
        printUpperCase()
    }
}

//fun doStudy(study: Study?) {
//    study?.readBooks()
//    study?.doHomework()
//}

fun doStudy(study: Study?){
    study?.let{
        it.readBooks()
        it.doHomework()
    }
}

fun getTextLength(text:String?)= text?.length?:0

fun printUpperCase(){
    val upperCase = content!!.toUpperCase()
    println(upperCase)
}