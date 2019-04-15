package me.daniel.leetcode.before;


import java.util.ArrayList;
import java.util.List;

/**
 * Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 *
 * Example:
 *
 * Input:  [1,2,3,4]
 * Output: [24,12,8,6]
 * Note: Please solve it without division and in O(n).
 *
 * Follow up:
 * Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
 */
public class ProductOfArrayExceptSelf {
//    public int[] productExceptSelf(int[] nums) {
//        if (nums == null) return null;
//        if (nums.length == 0) return nums;
//        int totalMultipleValue = Arrays.stream(nums)
//            .reduce((prev, curr) -> {
//                prev = prev == 0 ? 1 : prev;
//                curr = curr == 0 ? 1 : curr;
//                return prev * curr;
//            }).orElse(0);
//        if (totalMultipleValue == 0 || totalMultipleValue == 1) {
//            return nums;
//        }
//        return Arrays.stream(nums).map(operand -> {
//            if (operand == 0) return totalMultipleValue;
//            if (totalMultipleValue == 1) return 0;
//            return totalMultipleValue / operand;
//        }).toArray();
//    }

//    public int[] productExceptSelf(int[] nums) {
//        int[] result = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            int value = 1;
//            for (int j = 0; j < nums.length; j++) {
//                if (i != j) value *= nums[j];
//            }
//            result[i] = value;
//        }
//        return result;
//    }

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int totalProductValue = 1;
        List<Integer> zeroIndexList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                totalProductValue = totalProductValue * nums[i];
            } else {
                zeroIndexList.add(i);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (zeroIndexList.size() > 1) {
                result[i] = 0;
            } else {
                if (nums[i] == 0) {
                    result[i] = 0;
                } else {
                    result[i] = totalProductValue / nums[i];
                }
            }
        }
        return result;
    }




    public static void main(String[] args) {
        int[] resultArr = new ProductOfArrayExceptSelf().productExceptSelf(new int[]{1, 0});
        System.out.println(resultArr.toString());
    }
}
