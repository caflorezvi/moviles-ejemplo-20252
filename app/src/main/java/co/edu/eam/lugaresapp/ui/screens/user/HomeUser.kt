package co.edu.eam.lugaresapp.ui.screens.user

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import co.edu.eam.lugaresapp.R
import co.edu.eam.lugaresapp.ui.screens.user.bottombar.BottomBarUser
import co.edu.eam.lugaresapp.ui.screens.user.nav.ContentUser
import co.edu.eam.lugaresapp.ui.screens.user.nav.RouteTab
import co.edu.eam.lugaresapp.ui.screens.user.tabs.Map
import co.edu.eam.lugaresapp.ui.screens.user.tabs.Places
import co.edu.eam.lugaresapp.ui.screens.user.tabs.Profile
import co.edu.eam.lugaresapp.ui.screens.user.tabs.Search

@Composable
fun HomeUser(){

    val navController = rememberNavController()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopBarUser()
        },
        bottomBar = {
            BottomBarUser(
                navController = navController
            )
        }
    ) { padding ->
        ContentUser(
            navController = navController,
            padding = padding
        )
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarUser(){
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = stringResource(R.string.title_user)
            )
        }
    )
}