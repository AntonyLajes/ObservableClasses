package com.example.classesobservaveis.state_flow

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class StateFlowViewModel: ViewModel() {

    var stateFlowValue: MutableStateFlow<String> = MutableStateFlow("Hello, World!")
        private set

    fun onTextValueChange(value: String){
        stateFlowValue.value = value
    }

}