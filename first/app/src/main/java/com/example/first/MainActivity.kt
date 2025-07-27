package com.example.first

data class User(
    val name: String,
    val age: Int,
)
fun <T>transform(users: List<User>, action: (User) -> T): List<T> {
    val result: MutableList<T> = mutableListOf()
    for (user in users) {
        result.add(action(user))
    }

    return result
}

fun main(){
    val users: List<User> = listOf(
        User("Batraz", 24),
        User("Josef", 27),
        User("Ivan", 32)
    )
    transform(users) {
        println(it.name)
        println(it.age)
       // return@transform it.name
    }
}

