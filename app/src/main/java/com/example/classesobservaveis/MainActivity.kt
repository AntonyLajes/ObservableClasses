package com.example.classesobservaveis

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.classesobservaveis.flow.FlowLesson
import com.example.classesobservaveis.live_data.LiveDataLesson
import com.example.classesobservaveis.shared_flow.SharedFlowLesson
import com.example.classesobservaveis.state_flow.StateFlowLesson
import com.example.classesobservaveis.ui.theme.ClassesObservaveisTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClassesObservaveisTheme {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                   FlowLesson()
                }
            }
        }
    }
}