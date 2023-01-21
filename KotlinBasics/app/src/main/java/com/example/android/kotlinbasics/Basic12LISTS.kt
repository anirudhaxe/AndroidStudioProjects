package com.example.android.kotlinbasics

fun main(){
    val months = listOf("January", "February", "March")
    val anyTypes = listOf(1,2,3,true,false,"String")
    //print(anyTypes.size)

    //print(months[1])

    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("April", "May", "June")
    additionalMonths.addAll(newMonths)
    additionalMonths.add("July")
    val moreAdditionalMonths = arrayOf("August", "September", "October", "November", "December")
    additionalMonths.addAll(moreAdditionalMonths)
   // print(additionalMonths)


    for(month in months){
       // println(month)
    }

    val days = mutableListOf<String>("Mon", "Tue", "Wed")
    days.add("Thu")
    days[2] = "Sunday"
    //days.removeAt(1)
    val removeList = mutableListOf<String>("Mon", "Wed")
    //days.removeAll(removeList)
    days.removeAll(days)

    println(days)
}