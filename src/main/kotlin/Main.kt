package org.example
import org.smth.*

interface firstname{
//String? accepts null value but String gives error when you put null as value
var firstname:String?
}
interface lastname: firstname {
    var lastname: String?
}
interface age{
val age:Int?
fun fullname(human: human):String?{
    return "${human.firstname} ${human.lastname} ${age}"
}
}

class human(firstname:String?, lastname:String?): lastname{
override var firstname:String? = firstname
override var lastname:String? = lastname
}
//wow dependecy injuction
class human_id(human_info: human, age:Int?): age{
override val age: Int? = age
val human_info: human = human_info
fun info(): String?{
//super.fullname() calls fullname but from the interface age not from here
return super.fullname(human_info)
}
}
data class ndc(val a: Int = 10)
class nameclass(val x:Int = 1){
    fun print(){
    println("${x}")
    }
}
fun name(x:Int, y:Int):Int{
    return x + y
}

fun name2(x:Int = 3, y:Int){
    println("${x + y}")
}

fun o(x:Int, y:Int):Int = x*y
//tip about lambda functions a(1, 2, 3, {b:Int -> b}) can be written as a(1, 2, 3) {b:Int -> b}
//and this a({b:Int -> b}) can be a {b:Int -> b}
fun lambda(value:Int):(Long) -> Long = when(value){
2 -> {a:Long -> a*a}
3 -> {a:Long -> a*a*a}
4 -> {a:Long -> a*a*a*a}
else -> {a:Long -> var b = 1
var c = a
while(b < value){
c *= a
b++
}
c}
}
fun main() {
//for comment
/*
for multiline comments
 */
//var for mutable val for immutable
//for Int there's Byte Short Int Long
var a:Int= 15
//UByte UShort UInt ULong
var b: UInt = 150u
//Float
var c: Float = 3.1415f
//Double
var d: Double = 3.13213
//String Char Boolean
val e: Boolean= true
println("${a} ${b} ${c} ${d} ${e}")
//collections
//list
var list:List<String> = listOf("hi", "i\'m")
//mutablelist
var mutablelist:MutableList<String> = mutableListOf("mustafa", "abaidi")
println("${list[0]} ${mutablelist[0]} ${list.count()} ${mutablelist.count()}")
mutablelist.add("hhhhhh")
mutablelist.remove("abaidi")
println("${mutablelist[1]} ${"abaidi" in mutablelist}")
//set cannot have dublicate values
var set:Set<String> = setOf("a", "b")
var mutableset:MutableSet<String> = mutableSetOf("c", "d")
//sets accepts .count() .add() .remove() value in set
//map
var map:Map<String, Int> = mapOf("key" to 15, "key2" to 30)
var mutablemap:MutableMap<String, Int> = mutableMapOf("key" to 45, "key2" to 60)
println("${map["key"]} ${mutablemap["key"]} ${map.count()}")
mutablemap["key3"] = 90
mutablemap.remove("key2")
println("${"key2" in mutablemap} ${mutablemap["key3"]} ${mutablemap.containsKey("key")} ${mutablemap.keys} ${mutablemap.values} ")
//a === b check if a and b point to the same object
//a == b check for equality
// && || !
var cond1: Boolean = true
var cond2: Boolean = false
if(cond1 && cond2) {
    println("true if")
}else {
    println("false if")
}
var ternary = if(5 < 3) "big" else "less"
println("${ternary}")
when(map["key2"]){
10 ->{println("1")
println("0")}
20 -> {println("2")
println("0")}
30 -> {println("3")
println("0")}
else -> println("nothing")
}
when{
20 < 20 -> println("less 20")
20 > 20 -> println("more 20")
20 == 20 -> println("equal")
else -> println("nothing")
}
for(value in 1..<10 step 2){
println("${value}")
}
for(value in 4 downTo 1){
println("${value}")
}
for(value in list){
println("${value}")
}
var wh = 5;
while(wh > 0){
println("${wh}")
wh -= 1
}
wh = 5
do{
println("${wh}")
wh -= 1
}while(wh > 0)
println(name(3, 4))
name2(y = 5)
name2(y = 6, x = 7)
println("${o(4,7)}")
println("${divide(7, 3)}")
var lambda = {a: Int, b: Int -> a*b}
println("${lambda(5, 7)}")
val lambda2:(Int, Float) -> Float = {a, b -> a*b}
println("${lambda2(15, 3.1415f)}")
for(a in 1..5){
println("${lambda(a)(5)}")
}
var cl = nameclass(14)
cl.print()
var dc = ndc(16)
var dc2 = dc.copy(a = 30)
println("${dc} ${dc2} ${dc == dc2}")
var mustafa: human = human("mustafa", "abaidi")
//wow dependecy injuction
var mustafa_id: human_id = human_id(mustafa, 18)
println(mustafa_id.info())
}