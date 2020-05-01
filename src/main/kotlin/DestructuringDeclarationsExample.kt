/* Destructuring declarations
- destructuring an object into multiple variables
- returning 2 values from a function
*/
fun main(){

    val student = Student(1,"Alicia",80)
    val(a,b,c) = student
    println("$a $b $c")
    val(x,y) = student
    println("$x $y")
    val(_,d,e) = student
    println("$d $e")
    val world = World("India","Delhi")
    val country = world.component1()
    val city =world.component2()
    println("$country $city")
    val(string,message) = returnAPair()
    println("$string $message")
}
data class Student (var roll: Int, var name : String, var marks : Int)

class World(private var country:String, private var capital: String){
    fun component1():String{
        return country
    }
    fun component2():String{
        return capital
    }
}

fun returnAPair():Pair<String,String>{
    return Pair("hello","world")
}
