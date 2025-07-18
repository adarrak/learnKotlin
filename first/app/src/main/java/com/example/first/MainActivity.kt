package com.example.first

class School {
    var name: String
    var students: ArrayList<Student>

    constructor(name: String) {
        this.name = name
        students = arrayListOf()
    }

    fun printStudents(){
        
    }
}

class Student(var firstName: String, var secondName: String){

}



fun main(){
    println("Здравствуйте! Введите название вашей школы")
    var schoolName: String = readln()
    var school = School(schoolName)
    println("Школа ${school.name} успешно создана")
}