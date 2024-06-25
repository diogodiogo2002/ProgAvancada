package com.example.fitnessapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.fitnessapp.R.drawable
@Composable
fun MenuScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(
            painter = painterResource(id = drawable.banner),
            contentDescription = "Logo",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(bottom = 32.dp)
        )
        Text(text = "O que deseja fazer?", modifier = Modifier.padding(bottom = 32.dp))

        Button(onClick = { navController.navigate("lose_weight") }) {
            Text("Perder Peso")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { navController.navigate("gain_weight") }) {
            Text("Ganhar Peso")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { navController.navigate("imc") }) {
            Text("Calculadora IMC")
        }
    }
}
