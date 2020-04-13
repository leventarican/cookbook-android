package com.github.leventarican.modeldemo.screens

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var debug = MutableLiveData<String>()
    val number = MutableLiveData<Int>()
    private var numbers: MutableList<Int>
    val numberCustomized = Transformations.map(number) { _ -> "next num: ${number.value}" }

    init {
        debug.value = "init"
        numbers = mutableListOf(7, 10, 11, 80, 4, 3, 100)
    }

    fun next() {
        numbers.shuffle()
        number.value = numbers[0]
    }
}