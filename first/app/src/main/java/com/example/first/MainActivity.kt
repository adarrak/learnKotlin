/*class User(name: String, age: Int) {
    val name: String
    val age: Int

    init {
        this.name = name
        this.age = age
    }

}
class Company {
    private val users: Array<User>

    init {
        users = arrayOf(
            User("Иосиф", 25),
            User("Тимур", 28),
            User("Вася", 18),
            User("Таня", 32)
        )
    }

    operator fun get(index: Int): User {
        return users[index]
    }

    operator fun set(index: Int, user: User) {
        users[index] = user
    }
}

fun main() {
    val company = Company()
    val user1: User = company[2]
    println(user1.name) // Вася


    company[2] = User("Петя", 30)
    println(company[2].name) // Теперь уже Петя





class Word(source: String, target: String) {
    /// Исходное слово
    val source: String

    /// Перевод исходного слова
    var target: String

    init {
        this.source = source
        this.target = target
    }
}

class Dictionary {
    private val words: Array<Word>

    init {
        words = arrayOf(
            Word("red", "красный"),
            Word("blue", "синий"),
            Word("green", "зеленый")
        )
    }
    operator fun get (index: String): String {
        val targetIndex = words.indexOfFirst{it.source == index}
        if (targetIndex == -1 ) return ""
        else return words[targetIndex].target
    }
    operator fun set(index: String, target: String){
        val targetIndex = words.indexOfFirst{it.source == index}
        if (targetIndex == - 1) print(1)
        else words[targetIndex].target = target
    }

}
fun main(){
    val dict = Dictionary()
    println(dict["blue"]) // синий

    dict["blue"] = "голубой"
    println(dict["blue"]) // голубой
}

class Matrix {
    private val numbers: Array<Array<Int>> = arrayOf(
        arrayOf(1, 2, 4),
        arrayOf(2, 3, 6),
        arrayOf(3, 4, 8)
    )
    operator fun get (row:Int):Array<Int>{
        return numbers[row]
    }
    operator fun set (row:Int, item: Array<Int>){
        numbers[row] = item
    }

    operator fun get(row:Int, column: Int):Int{
        return numbers[row][column]
    }
    operator fun set(row: Int,column: Int, item: Int){
        numbers[row][column] = item
    }
}

fun main(){
    val matrix = Matrix()
    println(matrix[0, 1]) // 2
    matrix[0, 1] = 32
    println(matrix[0, 1]) // 32
}


open class BaseDate(val year: Int, val month: Int, val day: Int){
    open fun getFormat(): String {
        return "год:%d, месяц:%02d, день:%02d".format(year, month, day)
    }
}

class AmericanDate(year: Int, month: Int, day: Int): BaseDate(year, month, day){
    override fun getFormat(): String {
        return "%02d.%02d.%d".format(month, day, year)
    }

}

class EuropeanDate(year: Int, month: Int, day: Int): BaseDate(year, month, day){
    override fun getFormat(): String {
        return "%02d.%02d.%d".format(day, month, year)
    }
}


fun main(){
    val date1 = BaseDate(year = 2021, month = 3, day = 24)
    val date2 = AmericanDate(year = 2021, month = 3, day=24)
    val date3 = EuropeanDate(2021, 3, 24)
    println(date1.getFormat())
    println(date2.getFormat())
    println(date3.getFormat())
}

 */

/*
open class Summator{
    fun sum(number: Int): Int {
        var sum = 0
        var a: Int
        for (i in 1..number) {
            a = i
            sum += transform(a)
        }
        return sum
    }
    protected open fun transform(a: Int): Int {
        return a
    }
}
    class SquareSummator(): Summator(){
        override fun transform(a: Int): Int {
            return a * a
        }
    }
    class CubeSummator(): Summator(){
        override fun transform(a: Int): Int {
            return a * a * a
        }
    }

class PowerSummator(val p: Int): Summator(){
    override fun transform(a: Int): Int {
        return Math.pow(a.toDouble(), p.toDouble()).toInt()
    }
}

fun main(){

    println(Summator().sum(5))
    println(SquareSummator().sum(5))
    println(PowerSummator(3).sum(5))
}
*/

class User {
    var name: String = " "
}

fun main() {
    val user = User()
    user.
}