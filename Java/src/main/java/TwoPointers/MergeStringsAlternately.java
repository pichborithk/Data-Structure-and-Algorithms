package TwoPointers;

public class MergeStringsAlternately {

    public String solution(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }

            if (i < word2.length()) {
                result.append(word2.charAt(i));;
            }

            i++;
        }

        return result.toString();
    }
}

// Link: https://leetcode.com/problems/merge-strings-alternately/description