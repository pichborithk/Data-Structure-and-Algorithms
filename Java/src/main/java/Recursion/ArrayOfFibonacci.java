package Recursion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayOfFibonacci {
    /*
    Given N return an N size array of fibonacci
    Similar problem: https://leetcode.com/problems/fibonacci-number/description/
     */

    public static Map<Integer, Long> cache = new HashMap<>();

    public long[] solution(int n) {
        long[] result = new long[n];

        for (int i = 0; i < n; i++) {
            result[i] = fibonacci(i);
        }

        return result;
    }

    private long fibonacci(int n) {
        if (n <= 1) {
            return (long) n;
        }

        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        long result = fibonacci(n - 1) + fibonacci(n - 2);
        cache.put(n, result);

        return result;
    }
}
