package ArrayAndHashing;

import java.util.*;

public class GroupAnagrams {

    private List<List<String>> solution(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] arrayS = str.toCharArray();
            Arrays.sort(arrayS);
            String sortedStr = new String(arrayS);

//            if (map.get(sortedStr) == null) {
//                map.put(sortedStr, new ArrayList<>());
//            }
            map.computeIfAbsent(sortedStr, s -> new ArrayList<>());
            map.get(sortedStr).add(str);
        }

        return new ArrayList<>(map.values());
    }
}

// Link: https://leetcode.com/problems/group-anagrams/description