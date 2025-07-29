package com.example.first

data class User(
    val name: String,
    val age: Int,
    var isActive: Boolean = false
)
/*
fun addSymbolPostfix(hardNames: List<String>, actionAddPostfix: (String) -> User): List<User> {
    val result: MutableList<User> = mutableListOf()
    for (name in hardNames) {
        result.add(actionAddPostfix.invoke("$name!"))
    }
    return result
}
*/

fun IsActive(hardNames: List<User>,
             activityCheck: (String , Int) -> User ) : List<User> {
    val result: MutableList<User> = mutableListOf()
    for (person in hardNames) {
        result.add.activityCheck(person.name, person.age)
    }

    return result
}

fun main() {
    val users: List<User> = listOf(
        User("Batraz", 24),
        User("Josef", 27),
        User("Ivan", 32)
    )

    //val chexkUsers = IsActive(users)
    println(users)
}


