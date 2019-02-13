package me.daniel.leetcode

import java.util.HashSet


//fun lengthOfLongestSubstring(s: String): Int {
//    val n = s.length
//    var ans = 0
//    val index = IntArray(128) // current index of character
//    // try to extend the range [i, j]
//    var i = 0
//    var j = 0
//    while (j < n) {
//        i = Math.max(index[s[j].toInt()], i)
//        ans = Math.max(ans, j - i + 1)
//        index[s[j].toInt()] = j + 1
//        j++
//    }
//    return ans
//}

fun lengthOfLongestSubstring(s: String): String {
    var set = mutableSetOf<Char>()
    val map = mutableMapOf<Char, Int>()
    var lastChar: Char? = null
    s.forEachIndexed { i, c ->
        val index = map.get(c)
        if (index == null) {
            set.add(c)
            map[c] = i
        } else {
            if (i - index == 1 && lastChar == c && set.size > 1) set = mutableSetOf(c)
        }
        lastChar = c
    }
    return "${set} : ${set.count()} : ${map}"
//    return set.count()
}

fun main(args: Array<String>) {
//    println(lengthOfLongestSubstring("abcabcbb"))
//    println(lengthOfLongestSubstring("bbbbb"))
//    println(lengthOfLongestSubstring("pwwkew"))
    println(lengthOfLongestSubstring("cdd"))
}