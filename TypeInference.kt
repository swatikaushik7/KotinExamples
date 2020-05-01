/*Implicit Type Inference in Kotlin
val x = 6, compiler declares x as integer
*/

fun main(){
    val x = 6
    println("x is an ${x::class.simpleName}")
    val f = 4.5F
    println("f is a ${f::class.simpleName}")
    val s = "hello"
    println("s is a ${s::class.simpleName}")
    val d = 6.8
    println("d is a ${d::class.simpleName}")
    val b = true
    println("b is a ${b::class.simpleName}")
    val c ='a'
    println("c is a ${c::class.simpleName}")
    val a = arrayOf(1,2,3)
    println("a is an ${a::class.simpleName}")
    val l = 45L
    println("l is a ${l::class.simpleName}")
    val ct = CustomType()
    println ( "ct is a ${ct::class.simpleName}")
}
class CustomType