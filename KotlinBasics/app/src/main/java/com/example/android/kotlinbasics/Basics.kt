package com.example.android.kotlinbasics

fun main(){

    //TODO: Add new functionality
    /*
    This
    is a multiline
    comment
     */

    // immutable variable
    val myName = "Frank"
    // mutable
    //type int (32 bit)

    //Type inference
    var myAge = 31


    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 123_123123_1231_23


    //Floating point numbers: Float(32 bit), Double(64 bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.121213343454534545

    //Booleans
    var isSunny: Boolean = true
    isSunny = false


    //Characters
    val letterChar = 'A'
    val digitChar = '1'

    //String and Char relationship
    val myStr = "Hello World"
    val firstCharInStr = myStr[0]
    val lastCharInStr = myStr[myStr.length - 1]



//    print("First character $firstCharInStr and the lenght of myStr is ${myStr.length}")
//    print("Last character " + lastCharInStr)


    //Arithmetic operators (+, -, *, /, %)

    var result = 5+3
   // result *= 2
    val a = 5.0
    val b = 3

    var resultDouble: Double
    resultDouble = a / b
   // print(resultDouble)

    //Comparison operators (==, !=, <, >, <=, >=)
    var isEqual = 5==3
   // println("isEqual is $isEqual")

    val isNotEqual = 5!=5
    //string interpolation
//    println("isNotEqual is $isNotEqual")
//
//    println("is-5greater3 ${-5>3}")
//    println("is5LowerEqual3 ${5<=3}")


    //Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    myNum *= 4
    //println("myNum is $myNum")

    //Increment and Decrement operators (++, --)
    myNum++
    //println("myNum is $myNum")
    //println("myNum is ${myNum++}")
    //println("myNum is ${++myNum}")
    //println("myNum is ${--myNum}")

    var heightPerson1 = 170
    var heightPerson2 = 159

//    if(heightPerson1 > heightPerson2){
//        println("Use raw force")
//    }else if(heightPerson1 == heightPerson2){
//        println("Use your power technique 1337")
//    }else{
//        println("Use technique")
//    }



    val age = 30

//    when {
//        age >= 30 -> println("you are over 30")
//    }
//
//    if(age>=21){
//        println("You can drink")
//    }else if(age>=18){
//        println("You can vote")
//    }else if(age>=16){
//        println("You can drive")
//    }else{
//        println("You are too young")
//    }

    var name = "Denis"

//    if(name == "Denis"){
//        println("Welcome home denis")
//    }else{
//        println("Who are you?")
//    }
//        var isRainy = true
//        if(isRainy)
//            println("It is rainy")

    var season = 3
    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")

    }

    var month = 3
    when (month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")
        else -> println("Invalid Season")
    }

    when(age){
        !in 0..20 -> println("now you may drive in the us")
        in 18..20 -> println("you may vote now")
        16,17 -> println("you may drive now")
        else -> println("you are too young")
    }

    var x: Any = 13.37f
    when (x){
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }


}