package com.example.counter

import androidx.lifecycle.ViewModel

class CountViewModels: ViewModel() {
    var counter = 0
    fun increment (){
        counter++
    }

}