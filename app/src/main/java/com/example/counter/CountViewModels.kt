package com.example.counter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModels: ViewModel() {
  private  val _count = MutableLiveData<Int>()
    val count:LiveData<Int> = _count

    init {
        _count.value = 0
    }

    fun  increment() {
        _count.value = _count.value?.plus(1)
    }

}