package com.example.android.kotlinbasics

fun main(){
    // argument
    var result = addUp(5,3)
//    print("result is $result")


    var average = avg(3,7)
        print("average is $average")

}
//Method - a method is a function within a class

//parameter
fun addUp(a: Int, b: Int) : Int{
    return a+b
}


fun avg(a: Int, b: Int) : Double{
    var aDouble = a.toDouble()
    var bDouble = b.toDouble()
    return (aDouble+bDouble)/2
}


fun myFunction(){
    print("Called from myFunction")
}