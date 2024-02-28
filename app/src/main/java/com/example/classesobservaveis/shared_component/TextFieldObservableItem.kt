package com.example.classesobservaveis.shared_component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.classesobservaveis.ui.theme.ClassesObservaveisTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldObservableItem(
    textValue: String,
    onTextValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    label: String = ""
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        TextField(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .fillMaxWidth(),
            value = textValue,
            onValueChange = { onTextValueChange(it) },
            label = {
                Text(text = label)
            }
        )
    }
}

@Preview
@Composable
fun PreviewTextFieldObservableItem() {
    ClassesObservaveisTheme {
        TextFieldObservableItem(
            textValue = "Testing",
            onTextValueChange = {}
        )
    }
}