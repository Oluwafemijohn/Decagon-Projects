@file:JvmName("MyCustomKotlinFileName")

package com.mykotlin

//fun com.mykotlin.main(){
////    Read, Eval, Print, Loop (REPL)
////    To use Kotlin REPL, go to Tools->Kotlin->Kotlin REPL
//}




// Val and Var DEMO
//fun com.mykotlin.main(){
//    var name = "Henry"
//    name = "Kelvin"
//
//
//    var nameDeclared: String
//    nameDeclared = "tunde"
//
//
//    val isImmuable = 4
////    isImmuable = 8
//
//
//    var isAlive: Boolean = true
//    var mark: Float = 97.4f
//    var percentage: Double = 90.78   // this doesn't require letter d or D at the back
//    var gender: Char = 'M'
//}












//String interpolation
//fun com.mykotlin.main(){
//    val name = "San"
//    val str = "Hello" + name
//
//    print(str)
//
//}






//The above can be done as

//fun com.mykotlin.main(){
//    var name = "San"
//    var str = "Hello $name"
//    print(str)
//
////    print("This is the name:$name")
//}


// interpolation

//fun com.mykotlin.main(){
//    var name = "San"
//    var str = "Hello $name"
//    print("This is the name: $str. and the number " +
//            "of character in statemen is ${str.length}" )
//}







//interpolation

//fun com.mykotlin.main(){
//    val a = 10
//    val b = 5
//    print("The sum of $a and $b is ${a + b}")
//}







//fun com.mykotlin.main(){
//    var rect = Rectangle()
//    rect.length = 5
//    rect.breadth = 3
//    print("The length of rectangle is ${rect.length} and the breadth is" +
//            " ${rect.breadth}. The area is ${rect.length * rect.breadth}")
//}
//class Rectangle{
//    var length : Int = 0
//    var breadth: Int =0
//}

















//RANGE AND DOUBLE IN KOTLIN

//fun com.mykotlin.main(){
//    val r1 = 1..6               // range 1, 2, 3, 4, 5, 6
//    val r2 = 5 downTo 1         // range 5, 4, 3, 2, 1
//    val r3 = 5 downTo 1 step 2  // range 5, 3, 1
//    var r4 = 'a'..'z'           // range "a", "b", ... "z"
//    var isPresent = 'a' in r4
//
//    var countDown = 10.downTo(1) // This range contains the number 10, 9, ..., 1
//    var moveUp = 1.rangeTo(10) //This range contains the number 1, 2, 3, ... , 10
//
//    print(moveUp)
//}









// CONTROL STATEMENT
//fun com.mykotlin.main(){
//    val a = 2
//    val b = 5
//
//    var maxValue:Int
//    if ( a > b)
//        maxValue = a
//    else
//        maxValue = b
//    print(maxValue)
//}





//If as  expression
//fun com.mykotlin.main(){
//    val a = 2
//    val b = 5
//
//
//    var maxValue: Int = if ( a > b) {
//        print("A is greater")
//        a
//    }
//                        else {
//        print("B is greater")
//        b
//    }
//    print(maxValue)
//}










// WHEN as expression

//fun com.mykotlin.main(){
//    val x = 5
//    when (x){
//        1-> println("X is 1")
//        2-> println("X is 2")
//        else-> println("X is unknown")
//
//    }
//
//}





// WHEN EXPRESSION as with RANGE (1..20)
//fun com.mykotlin.main(){
//    val x = 11
//    when (x){
//        in 1..20 -> println("X lies in 1 to 20")
//        21 -> println("X is 21")
//        else->{
//            println("X value is unknow")
//            println("I don't know what is x")
//        }
//    }
//
//}




// WHEN EXPRESSION as with RANGE (1..20)
//fun com.mykotlin.main(){
//    val x = 11
//    when (x){
//        in 1..20 -> println("X lies in 1 to 20")
//        21 -> println("X is 21")
//        else->{
//            println("X value is unknow")
//            println("I don't know what is x")
//        }
//    }
//
//}








// TO ASSIGN SOME VALUES WHEN SOME CERTAIN CONDITIONS ARE MET

//fun com.mykotlin.main(){
//    val x = 1
//    var str:String
//    when(x){
//        1 -> str = "x is 1"
//        2 -> str = "x is 2"
//        else-> {
//            str = "x value is unknown"
//        }
//    }
//    println(str)
//}

//
//fun com.mykotlin.main(){
//    val x = 2
//    var str = when(x){
//        1 -> "x is 1"
//        2 -> "x is 2"
//        else-> {
//            "x value is unknown"
//        }
//    }
//    println(str)
//}







//LOOPS


//FOR LOOP
//fun com.mykotlin.main(){
//    for (i in 1..10){
//        println(i)
//    }
//}


//FOR LOOP to print even number
//fun com.mykotlin.main(){
//    for (i in 1..10){
//        if(i % 2 == 0 ){
//            println(i)
//        }
//    }
//}


//FOR LOOP to print even number
//fun com.mykotlin.main(){
//    for (i in 1..10){
//        if(i % 2 != 0 ){
//            println(i)
//        }
//    }
//}







 WHILE LOOP
fun mykotlin.main(){
    var i= 1
    while (i <= 10){
        if (i % 2 == 0){
            println(i)
        }
        i++
    }
}









// DO WHILE LOOP
//fun com.mykotlin.main(){
//    var i = 1
//    do{
//        println(i)
//        i++
//    }while (i <= 10)
//}



// DO WHILE FOR ODD NUMBER
//fun com.mykotlin.main(){
//    var i = 1
//    do{
//        if ( i % 2 != 0) {
//            println(i)
//        }
//        i++
//    }while (i <= 10)
//}




// BREAK STATEMENT
//fun com.mykotlin.main(){
//    for (i in 1..10){
//        println(i)
//        if (i == 5)
//            break
//    }
//}


// TWO WAY ARRAY
//fun com.mykotlin.main(){
//    for (i in 1..3){
//        for (j in 1..3){
//            println("$i->$j")
//        }
//    }
//}






// LABELLED FOR LOOP WITH BREAK control
//fun com.mykotlin.main(){
//     myLoop@ for (i in 1..3){
//        for (j in 1..3){
//            println("$i->$j")
//            if (i == 2 && j ==2)
//                break@myLoop  // THE @myLoop tells the kotlin to break out of the OUTER FOR LOOP AND NOT THE INNER
//
//        }
//    }
//}












//USING CONTINUE STATEMENT IN LOOP

//fun com.mykotlin.main(){
//    for (i in 1..10){
//        if(i == 5){
//            continue
//        }
//        println(i)
//    }
//}







//USING CONTINUE STATEMENT TO GET ODD NUMBERS

//fun com.mykotlin.main(){
//    for (i in 1..10){
//        if(i % 2 == 0){
//            continue
//        }
//        println(i)
//    }
//}







//TWO NESTED FOR LOOP
//fun com.mykotlin.main(){
//    for (i in 1..3){
//        for (j in 1..3) {
//            if (i == 2 && j == 2)
//                continue
//
//            println("$i $j")
//        }
//    }
//}




// CONTINUE STATEMENT AT i=2 and j=2 as well as i =2 and j= 3
//fun com.mykotlin.main(){
//    outer@for (i in 1..3){
//        for (j in 1..3) {
//            if (i == 2 && j == 2)
//                continue@outer  //This is to tell the COUTINUE function to the outer LOOP as well
//
//            println("$i $j")
//        }
//    }
//}











//Function and calling of function
//fun com.mykotlin.main(){
//    com.mykotlin.add(3, 7)
//}
//
////FUNCTIONS IN KOTLIN
//fun com.mykotlin.add(a: Int, b: Int){
//
//    print("Sum is ${a + b}")
//}














//RETURN TYPE METHOD
//fun com.mykotlin.main(){
//    var sum = com.mykotlin.add(3, 4)
//    print("Sum is $sum")
//}
//
////FUNCTIONS IN KOTLIN
//fun com.mykotlin.add(a: Int, b: Int): Int {
//    return a + b
//
//}











//TO FIND MAXIMUM NUMBER
//fun com.mykotlin.main(){
//    var largeValue = max (3, 4)
//    print("The greater number ia $largeValue")
//}
//
////FUNCTIONS IN KOTLIN
//fun max(a: Int, b: Int): Int {
//    if (a > b)
//        return a
//    else
//        return b
//
//}









// WRITING YOUR FUNCTION AS EXPRESSION
//fun com.mykotlin.main(){
//    var largeValue = max (3, 4)
//    print("The greater number ia $largeValue")
//}
//

//fun max(a: Int, b: Int): Int = if (a > b) a else b













//fun com.mykotlin.main(){
//    var largeValue = max (3, 4)
//    println("The greater number ia $largeValue")
//}
//
////FUNCTIONS IN KOTLIN
//fun max(a: Int, b: Int): Int = if (a > b) {
//    println("$a is greater")
//    a
//} else {
//    println("$b is greater")
//    b
//}









//FUNCTIONS AS EXPRESSION
//fun com.mykotlin.main(){
//    var largeValue = max (3, 4)
//    println("The greater number is $largeValue")
//}
//
////FUNCTIONS IN KOTLIN
//fun max(a: Int, b: Int): Int = if (a > b) {
//    println("$a is greater")
//    a
//} else {
//    println("$b is greater")
//    b
//    98
//}
























//INTEROPERABILITY OF JAVA AND KOTLIN
//ACCESSING KOTLIN FILE INSIDE JAVA FILE
//fun com.mykotlin.main(){
//}
//
//fun com.mykotlin.add(a:Int, b:Int):Int {
//    return a + b
//}



// THIS IS THE JAVA CODE THE ABOVE IS CONVERTED TO

/*

public class KotlinFileKt {
    public static void com.mykotlin.main(String[] args){

    }
    public static int com.mykotlin.add(int a, int b){
    return a + b;
    }
}

* */














//ACCESSING JAVA INSIDE KOTLIN FILE
//fun com.mykotlin.main(){
//    var area = com.myjava.JavaFile.getArea(10, 5)
//    println("Printing area from kotlin file: " + area)
//}
//
//fun com.mykotlin.add(a:Int, b:Int):Int {
//    return a + b
//}

















//CHANGING THE NAME OF THE KOTLIN FILE and STORING THE FILES IN DIFFERENT PACKAGES
//@file:JvmName("MyCustomKotlinFileName")
//
//package com.mykotlin
//
//import com.myjava.JavaFile
//
//fun main(){
//    var area = JavaFile.getArea(10, 5)
//    println("Printing area from kotlin file: " + area)
//}
//
//fun add(a:Int, b:Int):Int {
//    return a + b
//}

/*

public class MyCustomKotlinFileName {
    public static void com.mykotlin.main(String[] args){

    }
    public static int com.mykotlin.add(int a, int b){
    return a + b;
    }
}

* */





































//DEFAULT FUNCTIONS WITH INTEROPERABILITY
//DEFAULT ARGUMENT:  FUNCTIONS
//WITH DEFAULT VALUE
//@file:JvmName("MyCustomKotlinFileName")
//
//package com.mykotlin
//
//fun main(){
//    var volume = findVolume(3, 4)
//    println(volume)
//
//}
//
//fun findVolume(length: Int, breadth: Int, height:  Int = 10 ): Int{
//    return length *  breadth * height
//}



//WITHOUT DEFAULT VALUE
//@file:JvmName("MyCustomKotlinFileName")
//
//package com.mykotlin
//
//fun main(){
//    var volume = findVolume(3, 4, 20)
//    println(volume)
//
//}
//
//fun findVolume(length: Int, breadth: Int, height:  Int = 10 ): Int{
//    return length *  breadth * height
//}





//DIFFERENT FORMS OF PASSING PARAMETERS
//@file:JvmName("MyCustomKotlinFileName")
//
//package com.mykotlin
//
//fun main(){
////    var volume = findVolume(3, 4)
//    findVolume( 3 2, 30)
//
//}
//@JvmOverloads
//fun findVolume(length: Int, breadth: Int, height:  Int = 10 ){
//    println("Length is " + length)
//    println("Breadth is " + breadth)
//    println("Height is " + height)
//}



















////EXTENSION FUNCTIONS
//
////BUT THIS IS NOT THE PRACTICAL USAGE OF EXTENSION FUNCTION
//
//@file:JvmName("MyCustomKotlinFileName")
//
//package com.mykotlin
//fun main(){
//    var student = Student()
//    println("Pass statu: " + student.hasPassed(57))
//    println("Scholarship Status: " + student.isScholar(57))
//}
////THIS IS THE EXTENSION FUNCTION HERE
//fun Student.isScholar(marks: Int): Boolean{
//    return marks > 95
//}
////TO THIS CLASS
//class  Student{ //OUR OWN CLASS
//    fun hasPassed(marks: Int): Boolean {
//        return marks > 40
//    }
//}






// PRACTICAL USAGE OF EXTENSION FUNCTION
//@file:JvmName("MyCustomKotlinFileName")
//
//package com.mykotlin
//
//fun main(){
//    val str1:String = "Hello "
//    val str2:String = "World "
//    var str3:String = "Hey! "
//
//    var str = str3.add(str1, str2)
//    println(str)
//
//    val x = 6
//    val y = 10
//}
//
//
//fun String.add(s1: String, s2:String):String{
//    return this + s1 + s2
//}





















//fun main(){
//
//    val x = 6
//    val y = 10
//
//    val str1:String = "Hello "
//    val str2:String = "World "
//    var str3:String = "Hey! "
//
//    var str = str3.add(str1, str2)
//    println(str)
//
//    val greater = x.greaterValue(y)
//    println(greater)
//}
//fun String.add(s1: String, s2:String):String{
//    return this + s1 + s2
//}
//fun Int.greaterValue(other: Int): Int{
//    if (this >other) {
//        return this
//    } else
//        return other
//}