package ArrayAndHashing;

import java.util.Arrays;

public class ValidAnagram {

    private boolean naive(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            int index = t.indexOf(letter);
            if (index < 0) {
                return false;
            }

            t = t.substring(0, index) + t.substring(index + 1);
        }

        return true;
    }

    private boolean solution(String s, String t) {
        char[] arrayS = s.toCharArray();
        char[] arrayT = t.toCharArray();
        Arrays.sort(arrayS);
        Arrays.sort(arrayT);
        String newS = new String(arrayS);
        String newT = new String(arrayT);

        return newS.equals(newT);
    }

    private boolean solution2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int n : store) {
            if (n != 0) {
                return false;
            }
        }

        return true;
    }
}

// Link: https://leetcode.com/problems/valid-anagram/description