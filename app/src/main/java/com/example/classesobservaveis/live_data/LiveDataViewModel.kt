package com.example.classesobservaveis.live_data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataViewModel: ViewModel() {

    private var _liveDataValue: MutableLiveData<String> = MutableLiveData()
    val liveDataValue: LiveData<String> = _liveDataValue

    fun onTextValueChange(value: String){
        _liveDataValue.value = value
    }
}