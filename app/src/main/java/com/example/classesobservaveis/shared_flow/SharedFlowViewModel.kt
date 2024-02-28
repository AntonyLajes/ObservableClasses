package com.example.classesobservaveis.shared_flow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch

class SharedFlowViewModel: ViewModel() {

    var sharedFlowEvent: MutableSharedFlow<String> = MutableSharedFlow()
        private set

    fun emitSharedFlow() = viewModelScope.launch {
        sharedFlowEvent.emit("Shared flow emitted!")
    }
}