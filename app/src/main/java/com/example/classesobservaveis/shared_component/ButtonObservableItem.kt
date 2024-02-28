package com.example.classesobservaveis.shared_component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.classesobservaveis.ui.theme.ClassesObservaveisTheme

@Composable
fun ButtonObservableItem(
    textValue: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    label: String = ""
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = textValue,
            textAlign = TextAlign.Center
        )
        Button(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .fillMaxWidth(),
            onClick = {
                onClick()
            }
        ){
            Text(text = label)
        }
    }
}

@Preview
@Composable
fun PreviewButtonObservableItem() {
    ClassesObservaveisTheme {
        ButtonObservableItem(
            textValue = "",
            onClick = {}
        )
    }
}