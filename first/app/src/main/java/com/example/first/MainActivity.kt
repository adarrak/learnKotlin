package com.example.first
/*
import android.service.credentials.Action

/*
fun addSymbolPostfix(hardNames: List<String>, actionAddPostfix: (String) -> User): List<User> {
    val result: MutableList<User> = mutableListOf()
    for (name in hardNames) {
        result.add(actionAddPostfix.invoke("$name!"))
    }
    return result
}
*/

data class User(
    val name: String,
    val age: Int,
    var isActive: Boolean = true
)

fun main() {
    val users: List<User> = listOf(
        User("Batraz", 24),
        User("Josef", 27),
        User("Ivan", 32)
    )

    val transformUser: List<User> = users.map { it }
    transformUser.forEach { item ->
        if (item.name.any { it in setOf('a', 'A', 'b', 'B') } || item.age >= 25) item.isActive =
            false
        println(item)
    }
}


data class User(
    val name: String,
    val age: Int
)

fun main() {
    val users = listOf(
        User("Batraz", 24),
        User("Josef", 27),
        User("Nataliya", 37),
        User("Anton", 23),
        User("Hermione", 45),
    )

    val selectedUsers = users.filter { it.age == 24 }
    selectedUsers.forEach {
        println(it.name)
    }
}

 */


data class User(
    val name: String,
    var age: Int
) {
    val messageHandlers: MutableList<(String) -> Unit> = mutableListOf()

    fun setAge(input: String) {
        val newAge = input.toIntOrNull()
        if (newAge != null) {
            if (newAge in 18..99) {
                this.age = newAge
                messageHandlers.forEach { it.invoke("Возраст записан") }
            } else {
                messageHandlers.forEach { it.invoke("Возраст должен быть цифрой между 18 и 100") }
            }
        } else {
            messageHandlers.forEach { it.invoke("Возраст должен быть цифрой") }
        }
    }
}

fun main() {
    val user = User("Misha", 32)
    user.messageHandlers += ::showOnConsole
    user.messageHandlers += ::sendEmail
    user.setAge(readln())
}

fun showOnConsole(message: String) {
    println(message)
}

fun sendEmail(message: String) {
    // отправка на почту
}

