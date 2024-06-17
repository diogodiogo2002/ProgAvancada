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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoseWeightScreen(navController: NavController) {
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
            Text("TIPS FOR LOSING WEIGHT",
                fontSize = 32.sp, // Using the custom fontSize modifier
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text("Dietary Tips",
                fontSize = 24.sp, // Using the custom fontSize modifier
                fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(16.dp))
            Text("Caloric Deficit")
            Text("Eat Whole Foods")
            Text("Protein Intake")
            Spacer(modifier = Modifier.height(16.dp))
            Text("Exercise Tips",
                fontSize = 24.sp, // Using the custom fontSize modifier
                fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(16.dp))
            Text("Regular Physical Activity")
            Text("Cardio Exercises")
            Text("HIIT(Hight-Intensity Interval Training)")
        }
    }
}

