package co.edu.eam.lugaresapp.ui.screens

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import co.edu.eam.lugaresapp.R
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext

@Composable
fun LoginForm(){

    var email by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
    val context = LocalContext.current

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterVertically),
        modifier = Modifier
            .fillMaxSize(),
        content = {

            Image(
                modifier = Modifier.width(150.dp),
                painter = painterResource(R.drawable.frisby),
                contentDescription = "Logo de frisby"
            )

            OutlinedTextField(
                label = {
                    Text(text = "Correo electrónico")
                },
                value = email,
                onValueChange = {
                    email = it
                }
            )

            OutlinedTextField(
                label = {
                    Text(text = "Contraseña")
                },
                value = password,
                onValueChange = {
                    password = it
                }
            )

            Button(
                onClick = {

                    if(email == "carlos@email.com" && password == "12345"){
                        Toast.makeText(context, "Bienvenido", Toast.LENGTH_SHORT).show()
                    }else{
                        Toast.makeText(context, "Correo o contraseña incorrectos", Toast.LENGTH_SHORT).show()
                    }

                },
                content = {
                    Text(
                        text = "Iniciar sesión"
                    )
                }
            )

        }
    )
}
