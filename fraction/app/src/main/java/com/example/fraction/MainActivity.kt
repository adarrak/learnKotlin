package com.example.fraction

class Fraction(val numerator: Int, val denomerator: Int){

    fun print() {
        var numeratorShort = numerator
        var denomeratorShort = denomerator
        if (numerator % denomerator == 0) println(numerator / denomerator)
        else {
            var i = 1
            while (i <= numeratorShort) {
                i++
                if(numeratorShort % i == 0 && denomeratorShort % i == 0){
                    numeratorShort = numeratorShort / i
                    denomeratorShort = denomeratorShort / i
                    i = 1
                }

            }
            println("$numeratorShort/$denomeratorShort")
        }
    }

    fun sum(otherFraction: Fraction): Fraction{
        val resultDenomeration = denomerator * otherFraction.denomerator
        val resultNumeration = numerator * otherFraction.denomerator + denomerator * otherFraction.numerator
        return Fraction(resultNumeration, resultDenomeration)
    }


    fun difference(otherFraction: Fraction): Fraction{
        val resultDenomeration = denomerator * otherFraction.denomerator
        val resultNumeration = numerator * otherFraction.denomerator - denomerator * otherFraction.numerator
        return Fraction(resultNumeration, resultDenomeration)
    }

    fun multiply(otherFraction: Fraction): Fraction{
        return Fraction(numerator = numerator * otherFraction.numerator , denomerator = denomerator * otherFraction.denomerator)
    }

    fun divide(otherFraction: Fraction):Fraction{
        return Fraction(numerator = numerator * otherFraction.denomerator,denomerator = otherFraction.numerator * denomerator)
    }

    fun sum(number: Int): Fraction{
        val otherFraction = Fraction(numerator = number, denomerator = 1)
        return sum(otherFraction)
    }

    fun difference(number: Int): Fraction{
        val otherFraction = Fraction(numerator = number, denomerator = 1)
        return difference(otherFraction)
    }

    fun multiply(number: Int): Fraction{
        val otherFraction = Fraction(numerator = number, denomerator = 1)
        return multiply(otherFraction)
    }

    fun divide(number: Int): Fraction{
        val otherFraction = Fraction(numerator = number, denomerator = 1)
        return divide(otherFraction)
    }


}

fun main(){
    val fraction1 = Fraction(numerator = 8, denomerator = 6)
    val fraction2 = Fraction(numerator = 1, denomerator = 3)

    fraction1.sum(fraction2).print()
    fraction1.difference(fraction2).print()
    fraction1.multiply(fraction2).print()
    fraction1.divide(fraction2).print()
    fraction1.print()

}