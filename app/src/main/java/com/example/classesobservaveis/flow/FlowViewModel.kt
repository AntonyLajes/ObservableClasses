package com.example.classesobservaveis.flow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

class FlowViewModel: ViewModel() {

    private val _flowCount : Flow<String> = flow {
        repeat(10){value ->
            delay(1000L)
            emit("Flow Count - ${value + 1}")
        }
    }

    var flowCount: MutableSharedFlow<String> = MutableSharedFlow()
        private set

    fun emitFlowCount() = viewModelScope.launch {
        _flowCount.collectLatest { value ->
            flowCount.emit(value)
        }
    }

}