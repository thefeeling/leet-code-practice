package me.daniel.leetcode

fun maxArea(height: IntArray): Int {
    var maxArea = 0
    for (x in 0..height.lastIndex) {
        for (y in 1..height.lastIndex) {
            val area = (y - x) * (Math.min(height[x], height[y]))
            maxArea = if (area > maxArea) area else maxArea
        }
    }
    return maxArea
}

fun main() {
    maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7))
}