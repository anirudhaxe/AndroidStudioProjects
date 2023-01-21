package com.example.android.kotlinbasics

fun main(){
    var denis: Person = Person("Aniruddha", "Chaudhary", 31)
    denis.hobby = "skateboard"
    denis.age = 32
    println("Aniruddha is ${denis.age} years old")
    denis.stateHobby()


    var john = Person()
    john.hobby = "play video games"
    john.stateHobby()

    var johnPeterson = Person(lastName = "Peterson")


    var s20Ultra = MobilePhone("Android", "Samsung", "Galaxy S20 Ultra")
    var pixel = MobilePhone("Android", "Google", "pixel 6" )
    var iphone = MobilePhone("ios", "Apple", "Iphone 13")
    iphone.chargeBattery(70)
}

class Person(firstName: String = "John", lastName: String = "Wick"){

            //Member Variable -> properties (variable within a class)
            var age: Int? = null
            var hobby: String = "watch netflix"
            var firstName : String? = null


            // Initializer Block
            init{
                this.firstName = firstName
                println("Initialized a new Person object with " +
                        "firstName = $firstName and lastName = $lastName")
            }


            // Member secondary constructor
            constructor(firstName: String, lastName: String, age: Int)
                        : this(firstName,lastName){
                            this.age = age
                println("Initialized a new Person object with " +
                        "firstName = $firstName and lastName = $lastName and age $age")
                        }


            //Member functions -> Methods (function within a class)
            fun stateHobby(){
                println("$firstName\'s hobby is $hobby")
            }

}

class MobilePhone(osName: String, brand: String, model:String){

           private var battery = 30


            var brand: String = brand
            var model: String = model

            init{
                println("Initialized a new MobilePhone object with " +
                         "osName = $osName, brand = $brand, model = $model")
            }

        fun chargeBattery(chargedBy: Int){

            println("The $brand $model had $battery% battery, it was charged $chargedBy%, now the battery is ${battery+chargedBy}%")

        }
}