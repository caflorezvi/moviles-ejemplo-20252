package co.edu.eam.lugaresapp.ui.screens

import android.util.Log
import android.util.Patterns
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Key
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.outlined.Place
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import co.edu.eam.lugaresapp.ui.components.DropdownMenu
import co.edu.eam.lugaresapp.R
import co.edu.eam.lugaresapp.ui.components.InputText

@Composable
fun RegisterScreen(
    onNavigateToLogin: () -> Unit
) {

    var city by remember { mutableStateOf("") }
    val cities = listOf("Armenia", "Pereira", "Manizales", "Medellin", "Bogotá")

    var name by remember { mutableStateOf("") }
    var phoneNumber by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    Surface {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
            modifier = Modifier
                .fillMaxSize()
                .padding(30.dp)
        ){

            InputText(
                value = name,
                label = stringResource(R.string.txt_name),
                supportingText = stringResource(R.string.txt_name_error),
                onValueChange = {
                    name = it
                },
                onValidate = {
                    name.isBlank()
                },
                icon = Icons.Outlined.Person
            )

            DropdownMenu(
                label = stringResource(R.string.txt_city),
                supportingText = stringResource(R.string.txt_city_error),
                list = cities,
                icon = Icons.Outlined.Place,
                onValueChange = {
                    city = it
                }
            )

            InputText(
                value = phoneNumber,
                label = stringResource(R.string.txt_phone_number),
                supportingText = stringResource(R.string.txt_phone_number_error),
                onValueChange = {
                    phoneNumber = it
                },
                onValidate = {
                    phoneNumber.isBlank() || !Patterns.PHONE.matcher(phoneNumber).matches()
                },
                icon = Icons.Outlined.Phone
            )

            InputText(
                value = email,
                label = stringResource(R.string.txt_email),
                supportingText = stringResource(R.string.txt_email_error),
                onValueChange = {
                    email = it
                },
                onValidate = {
                    email.isBlank() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()
                },
                icon = Icons.Outlined.Email
            )

            InputText(
                value = password,
                isPassword = true,
                label = stringResource(R.string.txt_password),
                supportingText = stringResource(R.string.txt_password_error),
                onValueChange = {
                    password = it
                },
                onValidate = {
                    password.isBlank() || password.length < 5
                },
                icon = Icons.Outlined.Key
            )

            InputText(
                value = confirmPassword,
                isPassword = true,
                label = stringResource(R.string.txt_confirm_password),
                supportingText = stringResource(R.string.txt_confirm_password_error),
                onValueChange = {
                    confirmPassword = it
                },
                onValidate = {
                    password != confirmPassword
                },
                icon = Icons.Outlined.Key
            )

            Button(
                onClick = {
                    //Validar los campos y si son correctos, navegar a la pantalla de login
                    //onNavigateToLogin()
                    Log.d("RegisterScreen", "Name: $name, City: $city, Phone: $phoneNumber, Email: $email, Password: $password")
                }
            ){
                Icon(
                    imageVector = Icons.Outlined.Check,
                    contentDescription = stringResource(R.string.btn_register)
                )
                Spacer(modifier = Modifier.width(5.dp))
                Text(text = stringResource(R.string.btn_register))
            }

        }

    }

}