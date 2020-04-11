package com.github.leventarican.refresh.etc

import android.os.Handler
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

// uses lifecycle library (part of Android Jetpack
// https://github.com/google-developer-training/android-kotlin-fundamentals-apps/blob/master/DessertClickerLogs/app/src/main/java/com/example/android/dessertclicker/DessertTimer.kt
class TimerLifecycle(lifecycle: Lifecycle) : LifecycleObserver {
    var secondsCount = 0
    private var handler = Handler()
    private lateinit var runnable: Runnable

    init {
        lifecycle.addObserver(this)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun startTimer() {
        runnable = Runnable {
            secondsCount++
            Log.i(this.javaClass.simpleName, "Timer is at: $secondsCount")
            handler.postDelayed(runnable, 1000)
        }
        handler.postDelayed(runnable, 1000)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun stopTimer() {
        handler.removeCallbacks(runnable)
    }
}