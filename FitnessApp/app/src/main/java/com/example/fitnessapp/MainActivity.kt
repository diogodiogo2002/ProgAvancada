package com.example.fitnessapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fitnessapp.ui.theme.FitnessAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitnessApp()
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FitnessApp() {
    FitnessAppTheme {
        val navController = rememberNavController()


            NavHost(navController = navController, startDestination = "menu") {
                composable("menu") {
                    MenuScreen(navController)
                }
                composable("lose_weight") {
                    LoseWeightScreen(navController)
                }
                composable("gain_weight") {
                    GainWeightScreen(navController)
                }
                composable("bmi") {
                    BMI(navController)
                }
            }
    }
}


@Composable
fun currentRoute(navController: NavHostController): String? {
    return navController.currentBackStackEntry?.destination?.route
}

