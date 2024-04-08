package com.hampuscode.lab_2.ui.screens

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.hampuscode.lab_2.R
import com.hampuscode.lab_2.ui.models.User

@Composable
fun SignInScreen(navController: NavHostController, context: Context) {
    val enteredUsername = remember { mutableStateOf(TextFieldValue()) } //Remembering user input for username
    val enteredPassword = remember { mutableStateOf(TextFieldValue()) } //Remembering user input for password

    val userData = remember { User("Hampus", "123") } //Remembering the user created from the User data class

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        //Background image
        Image(
            painter = painterResource(id = R.drawable.desert_with_sky),
            contentDescription = "",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Spacer(modifier = Modifier.padding(top = 300.dp))


            Text(text = "Please Sign in ")

            Box(
                modifier = Modifier
                    .padding(vertical = 8.dp)
                    .widthIn(max = 280.dp)
            ) {
                //Inputfield for username
                OutlinedTextField(
                    value = enteredUsername.value,
                    onValueChange = { enteredUsername.value = it },
                    label = { Text("Username") },

                    )
            }
            Box(
                modifier = Modifier
                    .padding(vertical = 8.dp)
                    .widthIn(max = 280.dp)
            ) {
                //Inputfield for password
                OutlinedTextField(
                    value = enteredPassword.value,
                    onValueChange = { enteredPassword.value = it },
                    label = { Text("Password") },
                    visualTransformation = PasswordVisualTransformation()

                )
            }

            //Button that navigates to LoggedInScreen
            Button(
                onClick = {
                    //Checking if user input on username and password is the same as in the User data class
                    if (enteredUsername.value.text == userData.userName && enteredPassword.value.text == userData.password) {
                        navController.navigate("logged_in_screen/${userData.userName}/${userData.password}")
                    } else {
                        //If login is incorrect the Toast shows
                        Toast.makeText(
                            context,
                            "Incorrect username or password, please try again.",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                },
                modifier = Modifier.padding(top = 16.dp)
            ) {
                Text("Login")
            }

        }
    }
}