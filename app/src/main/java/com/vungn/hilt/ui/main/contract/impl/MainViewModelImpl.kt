package com.vungn.hilt.ui.main.contract.impl

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vungn.hilt.ui.main.contract.MainViewModel
import com.vungn.hilt.usecase.main.GetAnimeName
import com.vungn.hilt.usecase.main.GetRandomId
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModelImpl @Inject constructor(
    private val getRandomId: GetRandomId,
    private val getAnimeName: GetAnimeName
) : MainViewModel, ViewModel() {
    private val id: MutableLiveData<String> = MutableLiveData()
    private val name: MutableLiveData<String> = MutableLiveData()

    override fun id(): MutableLiveData<String> = id

    override fun name() = name

    override fun getName() {
        viewModelScope.launch {
            name.postValue(getAnimeName.execute(getRandomId.execute(Unit)))
        }
    }
}