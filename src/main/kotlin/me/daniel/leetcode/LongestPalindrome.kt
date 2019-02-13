package me.daniel.leetcode


fun longestPalindrome(s: String): String {
    if (s.length == 1 || s.isEmpty()) return s
    var longestPalindrome = s.first().toString()
    for(i in 1 until s.length) {
        for(j in 0 until i) {
            val str = s.substring(j, i + 1)
            val reverseStr = str.reversed()
            println("i: $i || j: $j || str: $str || reverseStr: $reverseStr")
            if (str == reverseStr && longestPalindrome.length < str.length) {
                longestPalindrome = str
            }
        }
    }
    return longestPalindrome
}


fun main(args: Array<String>) {
//    longestPalindrome("ac")
//    longestPalindrome("bb")
//    longestPalindrome("cbbd")
    longestPalindrome("babad")
}