package com.hampuscode.lab_2.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.hampuscode.lab_2.R

@Composable
fun MainScreen(navController: NavHostController) {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.desert_image),
            contentDescription = "",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.padding(top = 50.dp))

            //GreetingUser()


            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "App Logo",
                    modifier = Modifier
                        .size(200.dp)
                        .offset(x = (-10).dp)
                )
                Spacer(modifier = Modifier.width(16.dp)) // Adjust the spacing as needed
            }

            Spacer(modifier = Modifier.padding(top = 150.dp))

            Button(onClick = {
                navController.navigate("about_screen")
            }) {
                Text(
                    "Go to About",
                    style = TextStyle(textAlign = TextAlign.Center)
                )
            }

            Spacer(modifier = Modifier.padding(top = 50.dp))

            Button(onClick = {
                navController.navigate("sign_in_screen")
            }) {
                Text(
                    "Go to Sign In",
                    style = TextStyle(textAlign = TextAlign.Center)
                )
            }
        }
    }
}