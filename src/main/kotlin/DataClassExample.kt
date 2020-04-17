/*
* An example to show data class usage.
* Application of defined functions for data class - toString(), hashCode, equals, copy, getters setters componentN methods
*/

data class Records (var country : String, var capital : String, var population : Long)

fun main(args: Array<String>){
    var record1 = Records("India","Delhi", 1353000000)
    var record2 = Records ( "Canada"," Ottawa", 37590000)
    println(record1.toString())
    println(record2.hashCode())
    println(record1.equals(record2))
    record2.population = 1232434
    var record3 = record1.copy("France","Paris", 3500000)
    println(record3.toString())
    println(record1.component1())
    println(record1.component2())
    println(record1.component3())
    println(record3.capital)
    record3.capital = "dubai"
}