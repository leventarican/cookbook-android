package com.github.leventarican.refresh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.github.leventarican.refresh.etc.TimerLifecycle

/**
 * this activity demonstrates:
 * - logging (open Logcat (android studio) and type I/Page7 to filter info logs for this class
 * - lifecycle
 */
class Page7 : AppCompatActivity() {

    private lateinit var timerLifecycle : TimerLifecycle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page7)

        Log.i(this.javaClass.simpleName, "onCreate: lifecycle method onCreate called once")
        Log.w(this.javaClass.simpleName, "onCreate: demo for warning")
        Log.e(this.javaClass.simpleName, "onCreate: demo for error")

        timerLifecycle = TimerLifecycle(this.lifecycle)
    }

    override fun onStart() {
        super.onStart()
        Log.i(this.javaClass.simpleName, "onStart: this callback is called just after onCreate. after onStart the app is visible.")
        timerLifecycle.startTimer()
    }

    override fun onStop() {
        super.onStop()
        Log.i(this.javaClass.simpleName, "onStop: callback")
        timerLifecycle.stopTimer()
    }
}
