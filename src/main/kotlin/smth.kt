package org.smth

fun divide(a:Int, b:Int):Int{
    return a/b;
}
//this is example of DI or dependency injuction
data class Person(val name: Name, val address: Address, val ownsAPet: Boolean = true)
// Write your code here
// data class Name(...)
data class Name(val fn:String, val ln:String)
data class City(val city:String, val country:String)
data class Address(val street:String, val city: City)
fun main() {
    val person = Person(
        Name("John", "Smith"),
        Address("123 Fake Street", City("Springfield", "US")),
        ownsAPet = false
    )
}

