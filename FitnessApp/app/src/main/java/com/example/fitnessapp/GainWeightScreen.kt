package com.example.fitnessapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GainWeightScreen(navController: NavController) {
    CustomScaffold(navController = navController, showBackButton = true) {
        Column {
            TopAppBar(
                title = { Text("Gain Weight Screen") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                },

            )
            Text("TIPS FOR GAINING WEIGHT",
                fontSize = 32.sp, // Using the custom fontSize modifier
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text("Dietary Tips",
                fontSize = 24.sp, // Using the custom fontSize modifier
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text("Increase Caloric Intake")
            Text("Eat Nutrient-Dense Foods")
            Text("Protein-Ric Foods")
            Spacer(modifier = Modifier.height(16.dp))
            Text("Exercise Tips",
                fontSize = 24.sp, // Using the custom fontSize modifier
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text("Strenght Training")
            Text("Compound Movements")
            Text("Consistency")
        }
    }
}


@Composable
fun CustomText(
    text: String,
    fontSize: TextUnit,
    modifier: Modifier = Modifier
) {
    Text(
        text = text,
        modifier = modifier,
        style = TextStyle(fontSize = fontSize)
    )
}





