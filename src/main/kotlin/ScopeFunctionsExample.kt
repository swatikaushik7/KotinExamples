import java.util.Scanner

/* Scope functions - let,run, with, apply, also
* Use of scope functions - to execute a block of code on an object
*/

fun main() {

    var x= with(getInputString()){
        Integer.valueOf(this) + 4
    }
    println("'with' function returns the result of lambda expression $x")

    x =   x.also{
        Integer.valueOf(it) + 3
    }
    println("'also' function returns the object it is called on $x")

    x =  x.run{
        Integer.valueOf(this) + 4
    }
    println("'run' function returns the result of lambda expression  $x")
    x = x.apply{
        Integer.valueOf(this) + 4
    }
    println("'apply' function returns the object it is called on $x")

   x =  x.let{
       Integer.valueOf(it) + 4
    }
   println("'let' function returns the result of lambda expression $x")

  //chain of scope functions
   x = x.also{
        println(Integer.valueOf(it)+5)
    }.let{
       Integer.valueOf(it) + 6
    }
    println("let and also  $x")

    x = x.let{
        Integer.valueOf(it)  + 1
    }.let{Integer.valueOf(it)+ 2 }
    println("let and let  $x")

    x = x.apply{
        Integer.valueOf(this) + 1
    }.also{
        Integer.valueOf(it) + 2
    }
    println("apply and also $x")

    x = x.run{
        Integer.valueOf(this) + 1
    }.apply{
        Integer.valueOf(this) + 2
    }
    println("run and apply $x")
}

fun getInputString() : Int{
    val scanner = Scanner(System.`in`)
    println("Enter Input")
    return scanner.nextInt()
}
