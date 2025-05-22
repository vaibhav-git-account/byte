package com.sharmavaibhav.fitnessapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sharmavaibhav.fitnessapp.feature.auth.ui.screens.LoginScreen
import com.sharmavaibhav.fitnessapp.feature.auth.ui.screens.RegistrationScreen
import com.sharmavaibhav.fitnessapp.ui.theme.FitnessAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitnessAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "login") {
                        composable("login") {
                            LoginScreen(navController = navController)
                        }
                        composable("registration") {
                            RegistrationScreen(navController = navController)
                        }
                        // Add more destinations later (e.g., "home" after login)
                    }
                }
            }
        }
    }
}

// Preview can be removed or updated if needed, for now it's not essential for this step
// @Preview(showBackground = true)
// @Composable
// fun DefaultPreview() {
//    FitnessAppTheme {
//        // You could show a preview of the LoginScreen or RegistrationScreen here
//        // For example: LoginScreen(navController = rememberNavController())
//    }
// }
