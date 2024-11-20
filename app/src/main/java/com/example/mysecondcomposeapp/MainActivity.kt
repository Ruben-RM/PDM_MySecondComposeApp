package com.example.mysecondcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.mysecondcomposeapp.ui.theme.MyConstraintLayout
import com.example.mysecondcomposeapp.ui.theme.MySecondComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MySecondComposeAppTheme {
                MyConstraintLayout()
            }
        }
    }
}