package com.example.classesobservaveis.live_data

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.classesobservaveis.shared_component.TextFieldObservableItem

@Composable
fun LiveDataLesson(
    liveDataViewModel: LiveDataViewModel = viewModel()
) {

    val liveDataValue by liveDataViewModel.liveDataValue.observeAsState()

    TextFieldObservableItem(
        textValue = liveDataValue ?: "",
        onTextValueChange = { liveDataViewModel.onTextValueChange(it) }
    )

}