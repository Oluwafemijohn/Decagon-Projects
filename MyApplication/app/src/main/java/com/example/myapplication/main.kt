package com.example.myapplication
fun main() {
    //Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings of a1 which are substrings of strings of a2.
//
//#Example 1:
    var a1 = arrayOf("live", "arp", "strong")
    var a2 = arrayOf("lively", "alive", "harp", "sharp", "armstrong")
//
//returns ["arp", "live", "strong"]
//
//#Example 2: a1 = ["tarp", "mice", "bull"]
//
//a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
//
//returns []

    //println(inArray(a1, a2).toList())

    var list1 = listOf(1,2,2,2,3)
    var list2 = listOf(2)
    println(arrayDiff(list1, list2))



}

//fun inArray(array1: Array<String>, array2: Array<String>): Array<String> {
//    var r: Array<String> = arrayOf()
//    for (element in array1) {
//        for (items in array2) {
//            if (items.contains(element)) {
//                r += (element)
//                break
//            }
//        }
//    }
//    return r.sortedArray()
//}

fun arrayDiff(ar1: List<Int>, ar2: List<Int>): List<Int> {
    var arrDifference = listOf<Int>()
    for (element in ar2) {
        while (ar1.contains(element)) {
            arrDifference = ar1.drop(element)
        }
    }
    return arrDifference
}

fun