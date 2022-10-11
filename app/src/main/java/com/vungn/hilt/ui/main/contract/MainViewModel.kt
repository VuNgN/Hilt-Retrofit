package com.vungn.hilt.ui.main.contract

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

interface MainViewModel {
    fun id(): LiveData<String>
    fun name(): MutableLiveData<String>
    fun getName()
}