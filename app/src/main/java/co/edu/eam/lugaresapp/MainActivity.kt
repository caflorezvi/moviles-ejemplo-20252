package co.edu.eam.lugaresapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import co.edu.eam.lugaresapp.ui.screens.LoginForm

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent(
            content = {
                LoginForm()
            }
        )
    }
}
