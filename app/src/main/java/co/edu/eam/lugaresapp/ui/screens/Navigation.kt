package co.edu.eam.lugaresapp.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import co.edu.eam.lugaresapp.ui.config.RouteScreen
import co.edu.eam.lugaresapp.ui.screens.admin.HomeAdmin
import co.edu.eam.lugaresapp.ui.screens.user.HomeUser

@Composable
fun Navigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = RouteScreen.HomeUser//RouteScreen.Login
    ){

        composable<RouteScreen.Login> {
            LoginScreen(
                onNavigateToHome = {
                    navController.navigate(RouteScreen.HomeUser)
                },
                onNavigateToRegister = {
                    navController.navigate(RouteScreen.Register)
                }
            )
        }

        composable<RouteScreen.Register> {
            RegisterScreen(
                onNavigateToLogin = {
                    navController.navigate(RouteScreen.Login)
                }
            )
        }

        composable<RouteScreen.HomeUser> {
            HomeUser()
        }

        composable<RouteScreen.HomeAdmin> {
            HomeAdmin()
        }

    }

}