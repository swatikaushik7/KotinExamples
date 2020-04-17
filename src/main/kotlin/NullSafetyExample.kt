/*
* An example to demonstrate features related to null safety in Kotlin
* 1. Nullables & Non null types
* 2. Accessing the nullables
* 3. Safe calls
* 4. Safe calls chain
* 5. Elvis Operator
* 6. Not null assertion operator
* Follow comments and uncomment the code to check functionality and expected behaviour
* */


fun main(args : Array<String>){

//Nullable & Non-null types
    var str1 : String = "Cannot be null" // A non-null property must be initialized if not declared as lateinit
   // str1 = null //--> A non-null property cannot be assigned null; this gives compile time error, try uncommenting
    if(str1 == null) // compiler shows warning that this condition is always false
        println("This will never be printed")
   // var str2 :String = null // --> A non-null property cannot be assigned null

    var str3 : String?  // A nullable property is accepted by compiler without initialization
    str3 =null // A nullable property can be assigned null

    var str4 : String? = null // A nullable property can be initialized by null
    if(str4 == null)
        println(" I am null")

    str4 = "Kotlin"
    if(str4 == null) //since the value is assigned, compiler shows warning that this condition is always false
        println("This will never be printed")

    lateinit var str5 : String // accepted by compiler without initialization with an expectation that this will be initialized before use
   // println(str5) // throws UninitializedPropertyAccessException. Try
    str5 = "Not Java"
    println(str5) // str5 is initialized before use

// safe calls & safe call chain
    var alicia :Customer? = null
    println(alicia?.dress?.brand?.brandName) // prints null as alicia is null

    alicia = Customer("Alicia")
    println(alicia.dress?.brand?.brandName) // prints null as dress is null

    val category = Category("dress", "small")
    alicia.dress = category
    println(alicia.dress?.brand?.brandName) // prints null as brand is null

    val brand  =  Brand("Gucci", "GC101" )
    category.brand = brand
    println(alicia.dress?.brand?.brandName) //prints the brand name -Gucci

    //Elvis operator
    var martin :Customer? = null
    println (martin?:println("martin is null")) // since martin is null, expression to the right of elvis operator is printed
    martin = Customer ( "Martin")
    // martin is not null, expression to the right of elvis operator is not evaluate. This is checked at compile time itself
    println(martin?:println("This expression is not printed"))

    //Not null assertion operator
    martin = null
    //println(martin!!.name) //throws null pointer exception
}

class Customer (var name : String, var dress: Category? = null){
    init{
        println("Customer class object created")
    }
}
class Category( var type: String, var size : String , var brand : Brand? = null){
    init{
        println("Category class object created")
    }
}
class Brand(var brandName: String, var brandCode : String){
    init{
        println("Brand class object created")
    }
}

