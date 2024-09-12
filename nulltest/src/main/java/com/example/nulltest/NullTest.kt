package com.example.nulltest

import com.example.demo1.Study

fun main(){
    doStudy(null)
}

fun doStudy(study: Study?) {
    study?.readBooks()
    study?.doHomework()
}
