package me.daniel.leetcode;


import java.util.*;

/**
 * Write a function that takes a string as input and reverse only the vowels of a string.
 *
 * Example 1:
 *
 * Input: "hello" => eo
 * Output: "holle" => oe
 * Example 2:
 *
 * Input: "leetcode" => eeoe
 * Output: "leotcede" => eoee
 * Note:
 * The vowels does not include the letter "y".
 */
public class ReverseStringOfVowels {

    static String reverseVowels(String s) {
        if (s == null) return "";
        if (s.trim().isEmpty()) return s;
        String[] vowels = {"a", "e", "i", "o", "u"};
        Map<String, Integer> vowelsMap = new HashMap<>();
        for (int i = 0; i < vowels.length; i++) vowelsMap.put(vowels[i], i);

        String[] stringArr = s.split("");
        String[] resultArr = stringArr.clone();
        List<String> values = new ArrayList<>();
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < stringArr.length; i++) {
            if (vowelsMap.containsKey(stringArr[i].toLowerCase())) {
                values.add(stringArr[i]);
                indexes.add(i);
            }
        }
        if (values.isEmpty()) return s;
        Collections.reverse(values);
        for (int i = 0; i < indexes.size(); i++) {
            resultArr[indexes.get(i)] = values.get(i);
        }
        return String.join("", resultArr);
    }

    public static void main(String[] args) {
        System.out.println(ReverseStringOfVowels.reverseVowels("hello"));
    }
}
