package com.example.first

class Student(
    val firstName: String,
    val secondName: String,
    val age: String
) {
   var number = 0

}

class School {
    var name: String
    var students: ArrayList<Student>

    constructor(name: String) {
        this.name = name
        students = arrayListOf()
    }




    fun printStudents() {
        if (students.size == 0) {
            println("В школе $name пока нет учеников!")
        } else {
            println("№".padEnd(5) + "Имя".padEnd(10) + "Фамилия".padEnd(10) + "Возраст".padEnd(10))
            for (student in students) {
                println("${student.number.toString().padEnd(5)} ${student.firstName.padEnd(10)} ${student.secondName.padEnd(10)} ${student.age.toString().padEnd(10)}")
            }
        }
    }

    fun addNewStudent(student: Student) {
        students.add(student)
        student.number = students.size
        println("Студент ${student.firstName} успешно добавлен в школу $name.")
    }

    fun delStudent(){
        println("Ученика под каким номером необходимо отчислить?")
        val userAnswer = readln().toInt()
        students.removeAt(userAnswer-1)
        var i = 0
        for (student in students){
            i++
            student.number = i
        }
    }
}

fun main() {
    println("Здравствуйте! Введите название вашей школы")
    val schoolName = readln()
    val school = School(schoolName)
    println("Школа ${school.name} успешно создана")

    while (true) {
        println("Хотите посмотреть список учеников школы ${school.name}? Введите да или нет.")
        var userAnswer = readln()
        if (userAnswer.lowercase() == "да") {
            school.printStudents()
        }

        println("Хотите добавить нового ученика в школу ${school.name}? Введите да или нет. ")
        userAnswer = readln()
        if (userAnswer.lowercase() == "да") {
            println("Введите имя ученика")
            val firstName = readln()
            println("Введите фамилию ученика")
            val lastName = readln()
            println("Введите возраст ученика")
            val age = readln()

            val student = Student(firstName, lastName, age)
            school.addNewStudent(student)
        }

        println("Хотите исключить учеников школы ${school.name}? Введите да или нет.")
        userAnswer = readln()
        if (userAnswer.lowercase() == "да") {
            school.delStudent()
        }
    }
}