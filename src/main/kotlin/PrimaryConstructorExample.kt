/**
 * An example to show power of primary constructors in Kotlin
 * Given 4 class variables with default arguments, 16 objects with different categories of parameters can be created.
 */

class SmartPhone (var modelName : String = "Samsung", var modelNumber : String ="G775F", var displaySize : Int = 5, var price : Int= 10000) {

    fun printDetails(){
        println("Model Name "+modelName+" Model Number "+modelNumber+" Display Size "+displaySize + " inches Price Rs" + price)
    }
}


fun main(args :Array<String>) {
    var firstObject = SmartPhone()
    var secondObject = SmartPhone("Oppo")
    var thirdObject = SmartPhone(modelNumber = "J260")
    var fourthObject = SmartPhone(displaySize= 7)
    var fifthObject = SmartPhone(price=12000)
    var sixthObject = SmartPhone("Oppo","T234")
    var seventhObject = SmartPhone("Samsung","J330",5)
    var eighthObject = SmartPhone("Oppo","T2323",price = 50000)
    var ninthObject = SmartPhone("Windows",displaySize = 4)
    var tenthObject = SmartPhone("Windows",displaySize = 4,price=40000)
    var eleventhObject = SmartPhone("Windows",price = 40000)
    var twelfthObject = SmartPhone(modelNumber = "G975F",displaySize = 6)
    var thirteenthObject = SmartPhone(modelNumber = "G975F",displaySize = 6,price =15000)
    var fourteenthObject = SmartPhone(modelNumber = "G875F",price = 50000)
    var fifteenthObject = SmartPhone(displaySize = 7,price = 23000)
    var sixteenthObject = SmartPhone("Samsung","T835",8,65000)

    firstObject.printDetails()
    secondObject.printDetails()
    thirdObject.printDetails()
    fourthObject.printDetails()
    fifthObject.printDetails()
    sixthObject.printDetails()
    seventhObject.printDetails()
    eighthObject.printDetails()
    ninthObject.printDetails()
    tenthObject.printDetails()
    eleventhObject.printDetails()
    twelfthObject.printDetails()
    thirteenthObject.printDetails()
    fourteenthObject.printDetails()
    fifteenthObject.printDetails()
    sixteenthObject.printDetails()


}