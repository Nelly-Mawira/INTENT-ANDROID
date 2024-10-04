package com.nelly.mvvmandroid.ui.theme.screens.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.nelly.mvvmandroid.navigation.ROUTE_REGISTER
import com.nelly.mvvmandroid.ui.theme.screens.register.RegisterScreen

@Composable
fun LoginScreen(navController: NavHostController){
    var email by remember { mutableStateOf(value = "") }
    var password by remember { mutableStateOf(value = "")}


    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)
        .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)

    {

        Text(text = "Login",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 24.dp))

        OutlinedTextField(value = email,
            onValueChange = {email=it},
            label = { Text(text = "Email")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp))

        OutlinedTextField(value = password,
            onValueChange = {password=it},
            label = { Text(text = "Password")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp))

        Button(onClick = { /*TODO*/ },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()) {
            Text(text = "Login")

        }
        TextButton(onClick = {navController.navigate(ROUTE_REGISTER) },
            modifier = Modifier.fillMaxWidth()) {

            Text(text = "Don't have an account? Register")

        }


    }
}





@Preview
@Composable
private fun Loginprev() {
    LoginScreen(rememberNavController())

}







