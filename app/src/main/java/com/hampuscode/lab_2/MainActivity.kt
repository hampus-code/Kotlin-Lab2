package com.hampuscode.lab_2

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hampuscode.lab_2.ui.screens.AboutScreen
import com.hampuscode.lab_2.ui.screens.LoggedInScreen
import com.hampuscode.lab_2.ui.screens.MainScreen
import com.hampuscode.lab_2.ui.screens.SignInScreen
import com.hampuscode.lab_2.ui.theme.Lab_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab_2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingUser()
                }
            }
        }
    }
}

@Composable
fun GreetingUser() {

    Text(text = "Welcome visitor to DuneDash!", color = Color.Black)
}

@Composable
fun ComposeNavigation(context: Context) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "main_screen"
    ) {
        composable("main_screen") {
            MainScreen(navController = navController)
        }
        composable("about_screen") {
            AboutScreen(navController = navController)
        }
        composable("sign_in_screen") {
            SignInScreen(navController = navController, context = context)
        }
        composable("logged_in_screen/{username}/{password}") { backStackEntry ->
            val username = backStackEntry.arguments?.getString("username") ?: ""
            LoggedInScreen(navController, username)
        }
    }
}

