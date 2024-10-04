package com.nelly.mvvmandroid.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nelly.mvvmandroid.ui.theme.screens.calculator.CalculatorScreen
//import com.nelly.mvvmandroid.ui.theme.screens.home.HomeScreen
import com.nelly.mvvmandroid.ui.theme.screens.intent.IntentScreen
import com.nelly.mvvmandroid.ui.theme.screens.login.LoginScreen
import com.nelly.mvvmandroid.ui.theme.screens.register.RegisterScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,navController: NavHostController= rememberNavController(), startDestination:String= ROUTE_HOME) {

    NavHost(navController = navController,modifier=modifier, startDestination = startDestination ) {
        composable(ROUTE_HOME) {
//            HomeScreen(navController)
        }


        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }


        composable(ROUTE_REGISTER) {
            RegisterScreen(navController)
        }


        composable(ROUTE_CALCULATOR){
            CalculatorScreen()
        }

        composable(ROUTE_INTENT){
            IntentScreen()
        }



    }
}
