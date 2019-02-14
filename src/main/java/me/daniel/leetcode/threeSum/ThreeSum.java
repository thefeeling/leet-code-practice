package me.daniel.leetcode.threeSum;

import java.util.*;
import java.util.stream.Collectors;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Map<String, Integer> hits = Collections.emptyMap();
        List<List<Integer>> result = new ArrayList<>(Collections.emptyList());
        for (int i = 0; i < nums.length; i++) {
            List<Integer> origin = new ArrayList<>(Collections.singletonList(nums[i]));
            List<Integer> list = new ArrayList<>(Collections.singletonList(nums[i]));
            for (int j = 1; j < nums.length; j++) {
                if (list.size() != 3) {
                    list.add(nums[j]);
                }
                if (list.size() == 3) {
                    if (list.stream().reduce(0, Integer::sum) == 0) {
                        result.add(new ArrayList<>(list));
                        list = new ArrayList<>(origin);
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        threeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    }
}
