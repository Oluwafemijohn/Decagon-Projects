package com.example.myapplication

import android.os.Looper
import java.util.concurrent.Executor
import java.util.concurrent.Executors

//
//fun main(){
//
////}
//
//class AppExecutors(private val THREAD_COUNT:Int, private val Executor diskIO, private  val Executor networkIO, private val mainThread){
//    this.THREAD_COUNT = 3
//     Executor diskIO,
//    Executor networkIO;
//     mainThread;
//    private  final
//
//}
//
//fun Executor:diskIO(){
//
//}


class AppExecutor(val diskIO:Executor, val networkIO:Executor, val mainThread: Executor) {
    constructor():this(Executors.newSingleThreadExecutor(), Executors.newFixedThreadPool(
        THREAD_COUNT), MainThreadExecutor())
    companion object{
        const val THREAD_COUNT = 3
        class MainThreadExecutor() :Executor{
            private val mainThreadHandler = android.os.Handler(Looper.getMainLooper())
            override fun execute(command: Runnable?) {
                if (command != null) {
                    mainThreadHandler.post(command)
                }
            }
        }
    }
}