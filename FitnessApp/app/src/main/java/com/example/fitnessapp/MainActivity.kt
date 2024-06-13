package com.example.fitnessapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.fitnessapp.ui.theme.FitnessAppTheme
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContent {
                MyApp {
                    MenuScreen()
                }
            }
    }
}


@Composable
fun MyApp(content: @Composable () -> Unit) {
    MaterialTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            content()
        }
    }
}

@Composable
fun MenuScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "O que deseja fazer?", fontSize = 32.sp, modifier = Modifier.padding(bottom = 32.dp))

        Button(onClick = { /* Ação para o botão 1 */ }) {
            Text("Perder Peso")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { /* Ação para o botão 2 */ }) {
            Text("Ganhar Peso")
        }
    }
}adasdada

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp {
        MenuScreen()
    }
}