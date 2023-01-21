package com.example.android.kotlinbasics

fun main(){
  //  var name : String = "Denis"
    //name = null -> Compilation ERROR

    var nullableName : String? = "Denis"
   // nullableName = null

 //   var len = name.length

    var len2 = nullableName?.length

    nullableName?.let {println(it.length)}


    // ?: Elvis operator
    val name = nullableName ?: "Guest"

    println("Name is $name")

    // !! -> forcing null pointer exception
    val name2 = nullableName!!.toLowerCase()

    println("$name2")

  //val wifesAge: String? = user?.wife?.age ?: 0

}