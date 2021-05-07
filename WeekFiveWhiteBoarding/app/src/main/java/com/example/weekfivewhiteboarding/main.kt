package com.example.weekfivewhiteboarding



/*
Find the max sum subArray of a fixed size K
[4,2,1,7,8,1,2,1,8,1,0]
 */
fun main(){
    //Group 1
//    println(findMaxSumArray(arrayOf(4, 2, 1, 7, 8, 1, 2, 1, 8, 1, 0), 3))
    //Group 2
    println(findMinSumArray(arrayOf(4, 2, 1, 7, 8, 1, 2, 1, 8, 1, 0), 3))
}

//GROUP ONE
fun findMaxSumArray(array: Array<Int>, k: Int): Int {
    TODO("Write function here")
}

/*
Find the min sum subArray of a fixed size K
[4,2,1,7,8,1,2,1,8,1,0]
 */
//GROUP TWO
fun findMinSumArray(array: Array<Int>, k: Int): Int {
    var min_sum= Int.MIN_VALUE
    for (i in 0..k)
        min_sum += array[i]
    var current_sub = min_sum
    for (i in k..array.size){
        current_sub += array[i] - array[i-k]
        min_sum = min_sum.coerceAtMost(current_sub)
    }
    return min_sum
}