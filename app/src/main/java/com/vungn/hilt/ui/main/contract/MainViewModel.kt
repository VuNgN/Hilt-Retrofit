package com.vungn.hilt.ui.main.contract

import androidx.lifecycle.MutableLiveData

interface MainViewModel {
    fun id(): MutableLiveData<String>
    fun name(): MutableLiveData<String>
    fun getName()
}