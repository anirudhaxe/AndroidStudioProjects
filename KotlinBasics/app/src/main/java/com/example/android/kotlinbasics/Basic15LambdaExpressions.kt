package com.example.android.kotlinbasics

fun main(){
// println(sum(10,5))
    sum2(20,5)
}

val sum: (Int, Int) -> Int = {a: Int, b: Int -> a+b}

//Even Shorter
val sum2 = {a:Int, b:Int -> println(a+b)}
