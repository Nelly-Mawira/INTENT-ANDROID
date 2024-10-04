package com.nelly.mvvmandroid.ui.theme.screens.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorScreen() {
    var firstnum by remember { mutableStateOf(TextFieldValue(text = "")) }
    var secondnum by remember { mutableStateOf(TextFieldValue(text = "")) }
    var answer by remember { mutableStateOf(value = "") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.Black),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    )

    {
        Text(
            text = "Calculator",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        Spacer(modifier = Modifier.height(100.dp))

        OutlinedTextField(
            value = firstnum,
            label = {
                Text(
                    text = "Enter First No",
                    color = Color.White,
                    fontSize = 30.sp
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            onValueChange = {
                firstnum = it
            }
        )
        Spacer(modifier = Modifier.height(50.dp))

        OutlinedTextField(
            value = secondnum,
            label = {
                Text(
                    text = "Enter Second No",
                    color = Color.White,
                    fontSize = 30.sp
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            onValueChange = {
                secondnum = it
            }

        )
        OutlinedTextField(
            value = answer,
            label = {
                Text(
                    text = "Answer",
                    color = Color.White,
                    fontSize = 30.sp
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            onValueChange = {
                answer = it
            }

        )
        Spacer(modifier = Modifier.height(50.dp))

        OutlinedButton(
            onClick = {
                val myfirstnum = firstnum.text.trim()
                val mysecondnum = secondnum.text.trim()
                if (myfirstnum.isEmpty() && mysecondnum.isEmpty()) {
                    answer = "Please fill in all detail"
                } else {
                    val myanswer = myfirstnum.toDouble() + mysecondnum.toDouble()
                    answer = myanswer.toString()
                }

            },
            colors = ButtonDefaults.buttonColors(Color.Blue),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "+",
                fontSize = 30.sp
            )

        }

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedButton(
            onClick = {
                val myfirstnum = firstnum.text.trim()
                val mysecondnum = secondnum.text.trim()
                if (myfirstnum.isEmpty() && mysecondnum.isEmpty()) {
                    answer = "Please fill in all detail"
                } else {
                    val myanswer = myfirstnum.toDouble() - mysecondnum.toDouble()
                    answer = myanswer.toString()
                }

            },
            colors = ButtonDefaults.buttonColors(Color.Blue),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "-",
                fontSize = 30.sp
            )

        }
        Spacer(modifier = Modifier.height(20.dp))


        OutlinedButton(
            onClick = {
                val myfirstnum = firstnum.text.trim()
                val mysecondnum = secondnum.text.trim()
                if (myfirstnum.isEmpty() && mysecondnum.isEmpty()) {
                    answer = "Please fill in all detail"
                } else {
                    val myanswer = myfirstnum.toDouble() * mysecondnum.toDouble()
                    answer = myanswer.toString()
                }

            },
            colors = ButtonDefaults.buttonColors(Color.Blue),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "*",
                fontSize = 30.sp
            )

        }
        Spacer(modifier = Modifier.height(20.dp))


        OutlinedButton(
            onClick = {
                val myfirstnum = firstnum.text.trim()
                val mysecondnum = secondnum.text.trim()
                if (myfirstnum.isEmpty() && mysecondnum.isEmpty()) {
                    answer = "Please fill in all detail"
                } else {
                    val myanswer = myfirstnum.toDouble() / mysecondnum.toDouble()
                    answer = myanswer.toString()
                }

            },
            colors = ButtonDefaults.buttonColors(Color.Blue),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "/",
                fontSize = 30.sp
            )

        }


    }
}














@Preview
@Composable
private fun Calculatorprev() {
    CalculatorScreen()
    
}