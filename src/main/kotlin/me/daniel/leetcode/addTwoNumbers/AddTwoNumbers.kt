package me.daniel.leetcode.addTwoNumbers

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

//fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
//    val root = ListNode(0)
//    var curr: ListNode?
//    var p1 = l1
//    var p2 = l2
//    var carry = 0
//    while (l1 != null && l2 != null) {
//        val value = l1.`val` + l2.`val` + carry
//        carry = if (value > 9) 1 else 0
//        curr = ListNode(value % 10)
//        root.next = curr
//        if (p1 != null) p1 = p1.next
//        if (p2 != null) p2 = p2.next
//    }
//}

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val dummy = ListNode(0)
        var p1 = l1
        var p2 = l2
        var curr = dummy
        var carry = 0
        while (p1 != null || p2 != null) {
            val value = (p1?.`val` ?: 0) + (p2?.`val` ?: 0) + carry
            carry = value / 10
            curr.next = ListNode(value % 10)
            curr = curr.next!!
            if (p1 != null) p1 = p1.next
            if (p2 != null) p2 = p2.next
        }
        if (carry > 0) curr.next = ListNode(carry)
        return dummy.next
    }
}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    val dummyHead = ListNode(0)
    var p = l1
    var q = l2
    var curr: ListNode? = dummyHead
    var carry = 0
    while (p != null || q != null) {
        val x = p?.`val` ?: 0
        val y = q?.`val` ?: 0
        val sum = carry + x + y
        carry = sum / 10
        curr!!.next = ListNode(sum % 10)
        curr = curr.next
        if (p != null) p = p.next
        if (q != null) q = q.next
    }
    if (carry > 0) {
        curr!!.next = ListNode(carry)
    }
    return dummyHead.next
}

fun main(args: Array<String>) {
    println("HelloKotlin")
}