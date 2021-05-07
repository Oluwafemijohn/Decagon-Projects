package com.example.algorithm

import com.example.algorithm.TargetSumWithPointers.removeDuplicate
//import com.example.algorithm.TargetSumWithPointers.searchTarget

fun main(){


    removeDuplicate(intArrayOf(2,3,3,3,6,9,9))
//    searchTarget(IntArray(2,3,3,3,6,9,9), 6)
}

//
//object TargetSumWithPointers {
//
//    fun searchTarget(array: IntArray, targetSum: Int): List<Int> {
//        val results = mutableListOf<Int>()
//
//        /// 1, 2, 3, 4, 6    targetSum = 6
//        var pointerOne = 0
//        var pointerTwo = array.size - 1
//        for (i in array.indices) {
//            val sum = array[pointerOne] + array[pointerTwo]
//
//            if (sum == targetSum) {
//                results.add(pointerOne)
//                results.add(pointerTwo)
//                break
//            } else if (sum > targetSum) {
//                pointerTwo --
//            } else {
//                pointerOne ++
//            }
//        }
//
//
//        return results.toList()
//    }
//
//}



object TargetSumWithPointers {

    fun removeDuplicate(array: IntArray): Int {
        var pointer = 0
        var counter = 0
        for (i in array.indices){
            if (array[i] != pointer){
                pointer = array[i]
                counter ++
            }
        }
        return counter
    }

}






//
//class TwoPointerTechnique () {
//    companion object {
////        Given an array of sorted numbers, remove all duplicates from it.
////        You should not use any extra space; after removing the duplicates in-place return the length of the subarray
////        that has no duplicate in it.
////
//
////        Example:input = [2,3,3,3,6,9,9]
////        output = 4
//
//        fun twoPointerTechnique(arr: IntArray) : Int {
//            var pointerOne = 0
//            var  subarray = 0
//            for (i in arr.indices) {
//                if (arr[i] != pointerOne) {
//                    pointerOne = arr[i]
//                    subarray++
//                }
//            }
//            return subarray
//        }
//    }
//}
//fun main() {
//    println(TwoPointerTechnique.twoPointerTechnique(intArrayOf(2,3,3,3,6,9,9)))
//    println(TwoPointerTechnique.twoPointerTechnique(intArrayOf(2,5,3,4,4,6,7,7,7)))
//}


