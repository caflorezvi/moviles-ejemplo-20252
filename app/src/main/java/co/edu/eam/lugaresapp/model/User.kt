package co.edu.eam.lugaresapp.model

data class User(
    val id: String,
    val name: String,
    val username: String,
    val role: Role,
    val city: String,
    val email: String,
    val password: String
)