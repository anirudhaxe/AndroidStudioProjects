package com.example.android.kotlinbasics

fun main(){

    // ArrayLists -> used to make dynamic arrays

//    val arrayList = ArrayList<String>() //Creating an empty arrayList
//    arrayList.add("One")   // Adding an object in arrayList
//    arrayList.add("Two")
//
//    println(".....print ArrayList.....")
//    for(i in arrayList){
//        println(i)
//    }

    //ArrayLists using collections

    val arrayList: ArrayList<String> = ArrayList<String>(5)
    var list: MutableList<String> = mutableListOf<String>()

    list.add("One")
    list.add("Two")

    arrayList.addAll(list)

    println(".....print ArrayList.....")
    val itr = arrayList.iterator()
    while(itr.hasNext()){
        println(itr.next())
    }
    println("size of arrayList = " + arrayList.size)
    println(arrayList.get(1))

    // Exercise
    println(".....EXERCISE.....")
    val numberArrayList: ArrayList<Double> = ArrayList<Double>(5)
    var listOfNumbers: MutableList<Double> = mutableListOf<Double>(1.0, 2.0, 3.0, 4.0)
    numberArrayList.addAll(listOfNumbers)
    var sum = 0.0
    for (element in numberArrayList){
        sum += element
    }
    println("Average of the 5 given numbers is ${sum/numberArrayList.size}")
}