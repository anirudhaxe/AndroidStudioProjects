package com.example.android.kotlinbasics



fun main(){


    var x = 1
//    while (x <= 10) {
//        print("$x")
//        x++
//    }
//    println("\nWhile loop is done")

   var y = 100
   while(y>=0){
       print("$y")
       y -= 2
   }
    println("\nWhile loop is done")

    x = 13
    do{
        print("$x")
        x++
    }while(x<=10)
    println("\ndo while loop is done")

    var feltTemp = "Cold"
    var roomTemp = 10
    while(feltTemp == "Cold"){
        roomTemp++
        if(roomTemp>=20){
            feltTemp = "Comfy"
            println("Its comfy now")
        }
    }


    for(num in 1..10){
        print("$num")
    }
    for(i in 1 until 10){  // Same as- for(i in 1.until(10))
        print("$i ")
    }
    println("______________")
    for(i in 10 downTo 1 step 2){  // Same as- for(i in 10.downTo(1).step(2))
        print("$i ")
    }
    println("______________")
    var h = 0
    while(h<=10000){
        if(h>9000){
            println("IT'S OVER 9000")
        }
        h++
    }
    println("______________")
    for(u in 0..10000){
        if(u==9001){
            println("IT'S OVER 9000")
        }

    }
    println("______________")
    var humidityLevel = 80
    var humidity = "humid"

    while(humidity == "humid"){
        humidityLevel -= 5
        println("humidity decreased")
        if(humidityLevel<60){
            println("Its Comfy now")
            humidity = "comfy"
        }
    }



    //break and continue

    for(i in 1 until 20){
        // 10/2 = 5
        // 11/2 = 5.5 which is 5 in terms of int
        if(i/2 == 5){
            continue
        }
        print("$i ")
    }
    print("Done with the loop")
}