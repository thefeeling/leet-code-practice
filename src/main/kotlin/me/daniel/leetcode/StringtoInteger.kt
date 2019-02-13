package me.daniel.leetcode

import java.math.BigInteger
import java.util.regex.Pattern


fun checkSignChar(char: Char) : Boolean {
    return arrayOf('+', '-').any { it == char }
}

fun myAtoi(str: String): Int {
    val trimedStr = str.trim()
    if (trimedStr.isEmpty()) return 0
    val firstChar = trimedStr.first()
    val isSignChar = checkSignChar(firstChar)
    if ((trimedStr.length == 1 && isSignChar) || (!(isSignChar) && !firstChar.isDigit())) {
        return 0
    }
    if (trimedStr.length == 1) {
        return trimedStr.toInt()
    }
    val numbers = trimedStr.drop(1)
    if (!numbers.first().isDigit()) {
        if (numbers.first() == '.' || firstChar.isDigit()) return "$firstChar".toInt()
        if (isSignChar) return 0
    }
    val numberStr = firstChar + numbers.split(Regex("[^0-9]+")).first()
    if (BigInteger(numberStr) > Long.MAX_VALUE.toBigInteger() || (BigInteger(numberStr) < Long.MIN_VALUE.toBigInteger())) {
        val first = numberStr.first()
        return if (checkSignChar(first)) {
            if (first == '+') Integer.MAX_VALUE else Integer.MIN_VALUE
        } else Integer.MAX_VALUE
    }
    val aToI = numberStr.toLong()
    return when {
        aToI > Integer.MAX_VALUE -> Integer.MAX_VALUE
        aToI < Integer.MIN_VALUE -> Integer.MIN_VALUE
        else -> aToI.toInt()
    }
}

fun main(args: Array<String>) {
//    println(myAtoi("42"))
//    println(myAtoi("   -42"))
//    println(myAtoi("4193 with words"))
//    println(myAtoi("words and 987"))
//    println(myAtoi("-91283472332"))
//    println(myAtoi(""))
//    println(myAtoi("+"))
//    println(myAtoi("-"))
//    println(myAtoi(" "))
    println(myAtoi("+-2"))
//    println(myAtoi("1"))
//    println(myAtoi("2000000000000000"))
//    println(myAtoi("20000000000000000000"))
//    println(myAtoi("9223372036854775808"))
//    println(myAtoi("-9223372036854775809"))
//    println(myAtoi("3.14159"))
//    println(myAtoi("  -0012a42"))
    println(myAtoi("1a"))


}