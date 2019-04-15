package me.daniel.leetcode.before;

public class ReverseString {

    private static String solution(String s) {
        String[] arr = s.split("");
        StringBuilder reverseString = new StringBuilder();
        int length = arr.length;
        for (int i = length - 1; i >= 0; i--) {
            reverseString.append(arr[i]);
        }
        return reverseString.toString();
    }


    public static void main(String[] args) {
        String result  = ReverseString.solution("A man, a plan, a canal: Panama");
        System.out.println(result);
    }
}
