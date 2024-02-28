package com.example.classesobservaveis.state_flow

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.classesobservaveis.shared_component.TextFieldObservableItem

@Composable
fun StateFlowLesson(
    stateFlowViewModel: StateFlowViewModel = viewModel()
) {

    val stateFlowValue by stateFlowViewModel.stateFlowValue.collectAsState()

    TextFieldObservableItem(
        textValue = stateFlowValue,
        onTextValueChange = { stateFlowViewModel.onTextValueChange(it) }
    )

}