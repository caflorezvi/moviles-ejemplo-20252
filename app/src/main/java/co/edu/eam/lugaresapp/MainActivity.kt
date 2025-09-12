package co.edu.eam.lugaresapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import co.edu.eam.lugaresapp.ui.screens.Navigation
import co.edu.eam.lugaresapp.ui.theme.LugaresAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent(
            content = {
                LugaresAppTheme{
                    Navigation()
                }
            }
        )
    }
}
