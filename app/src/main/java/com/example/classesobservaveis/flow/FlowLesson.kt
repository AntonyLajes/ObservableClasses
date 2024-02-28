package com.example.classesobservaveis.flow

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.classesobservaveis.shared_component.ButtonObservableItem

@Composable
fun FlowLesson(
    flowViewModel: FlowViewModel = viewModel()
) {

    val flowCount by flowViewModel.flowCount.collectAsState(initial = "0")

    ButtonObservableItem(
        textValue = flowCount,
        onClick = { flowViewModel.emitFlowCount() },
        label = "Start flow Count"
    )

}