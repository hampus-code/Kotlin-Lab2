package com.hampuscode.lab_2.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.hampuscode.lab_2.R

val backgroundColor = Color(0xFFF6DCC4)

@Composable
fun AboutScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.padding(top = 50.dp))


        Text(text = "This is an app with some")
        Text(text = "interesting information about the desert.")
        Text(text = "One of the most interesting facts is that")
        Text(text = "it is estimated that the desert occupy")
        Text(text = "about 1/5th of the planets total space!")
        Text(text = "That translates to about 20.9 million")
        Text(text = "square km! And that is alot.")

        Spacer(modifier = Modifier.padding(top = 50.dp))

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.desert_covering_earth),
                contentDescription = "",
                contentScale = ContentScale.FillBounds

            )
        }

        Spacer(modifier = Modifier.padding(top = 150.dp))

        Button(onClick = {
            navController.navigate("sign_in_screen")
        }) {
            Text("Go to Sign In",
                style = TextStyle(textAlign = TextAlign.Center)
            )
        }

        Spacer(modifier = Modifier.padding(top = 50.dp))

        Button(onClick = {
            navController.navigate("main_screen")
        }) {
            Text("Go Back",
                style = TextStyle(textAlign = TextAlign.Center)
            )
        }

    }
}