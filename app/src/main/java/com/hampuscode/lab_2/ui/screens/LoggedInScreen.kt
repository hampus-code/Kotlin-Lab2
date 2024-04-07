package com.hampuscode.lab_2.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.hampuscode.lab_2.R

@Composable
fun LoggedInScreen(navController: NavHostController, username: String) {
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

            Text(text = "Welcome $username!, to your page!")
            Text(text = "Here is one more fascinating fact:")
            Text(text = "In the Atacama desert it hasn't rained ")
            Text(text = "in 40 million years!")
            Text(text = "But since it is a cold desert the inhabitants")
            Text(text = "get water from regions where it snows.")
        }

    }
}