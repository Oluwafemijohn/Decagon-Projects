package com.myjava;
//ACCESSING KOTLIN FILE INSIDE JAVA FILE
//public class com.myjava.JavaFile {
//    public static void com.mykotlin.main(String[] args){
//    int sum = KotlinFileKt.com.mykotlin.add(3,4);
//    System.out.println("Printing sum from Java file: " + sum);
//    }
//}
//
//




//STORING THE FILES IN DIFFERENT PACKAGES
//import com.mykotlin.MyCustomKotlinFileName;
//
////ACCESSING JAVA INSIDE KOTLIN FILE
//public class JavaFile {
//    public static void main(String[] args){
//        int sum = MyCustomKotlinFileName.add(3,4);
//        System.out.println("Printing sum from Java file: " + sum);
//    }
//    public static int getArea(int l, int b){
//        return l*b;
//    }
//}











//NO DEFAULT FUNCTION IN JAVA SO WE HAVE TO CALL THE CODE FROM KOTLIN
//BUT CAN BE DONE THROUGH THE USE OF @JvmOverloads
//import com.mykotlin.MyCustomKotlinFileName;
//
////ACCESSING JAVA INSIDE KOTLIN FILE
//public class JavaFile {
//    public static void main(String[] args){
//        int volume = MyCustomKotlinFileName.findVolume(3,4);
//        System.out.println("Printing volume from Java file: " + volume);
//    }
//    public static int getArea(int l, int b){
//        return l*b;
//    }
//}
