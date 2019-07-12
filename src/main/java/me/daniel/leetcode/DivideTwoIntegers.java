package me.daniel.leetcode;

/**
 * TODO: 테스트 케이스 작동 중 Timeout
 */
public class DivideTwoIntegers {
    private static int adjustSign(int dividend, int divisor) {
        return ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) ? -1 : 1;
    }

    private static int getDivideCount(int dividend, int divisor) {
        int remainder = dividend;
        int count = 0;
        if (remainder < divisor) return count;
        if (remainder == divisor) return 1;
        do {
            if (remainder <= (divisor + divisor)) return 1;
            remainder -= (divisor + divisor);
            ++count;
        } while (remainder >= (divisor + divisor));
        return count * 2 + (remainder - divisor >= 0 ? 1 : 0);
    }

    public static int divide(int dividend, int divisor) {
        int sign = adjustSign(dividend, divisor);
        boolean minDividend = false;
        if (dividend == Integer.MIN_VALUE) {
            dividend = Integer.MAX_VALUE;
            minDividend = true;
        }
        if (divisor == Integer.MIN_VALUE) {
            divisor = Integer.MAX_VALUE;
        }
        int divideCount = getDivideCount(Math.abs(dividend), Math.abs(divisor));
        int result = sign * divideCount;
        if (result != Integer.MAX_VALUE) {
            return result + (minDividend && (sign == -1) ? -1 : 0);
        }
        return result;
    }

}
