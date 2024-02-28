package com.example.classesobservaveis.shared_flow

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.classesobservaveis.shared_component.ButtonObservableItem

@Composable
fun SharedFlowLesson(
    sharedFlowViewModel: SharedFlowViewModel = viewModel()
) {

    val sharedFlowEmittedValue by sharedFlowViewModel.sharedFlowEvent.collectAsState(initial = "Hello, World!")

    ButtonObservableItem(
        textValue = sharedFlowEmittedValue,
        onClick = { sharedFlowViewModel.emitSharedFlow() },
        label = "Emit Shared Flow"
    )
}