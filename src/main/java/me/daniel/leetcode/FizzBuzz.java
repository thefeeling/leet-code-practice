package me.daniel.leetcode;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";

    public List<String> fizzBuzz(int n) {
        if (n <= 0) return Collections.emptyList();
        return IntStream.range(1, n + 1).mapToObj((int v) -> {
            if (v % 3 == 0 && v % 5 != 0) {
                return FIZZ;
            } else if (v % 3 != 0 && v % 5 == 0) {
                return BUZZ;
            } else if (v % 3 == 0 && v % 5 == 0) {
                return FIZZ_BUZZ;
            } else {
                return Integer.valueOf(v).toString();
            }
        }).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        FizzBuzz instance = new FizzBuzz();
        List result = instance.fizzBuzz(15);
        System.out.println(result);
    }
}
