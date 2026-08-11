// Last updated: 11/08/2026, 21:02:31
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        // Count frequencies in words1
        for (String word : words1) {
            map1.put(word, map1.getOrDefault(word, 0) + 1);
        }

        // Count frequencies in words2
        for (String word : words2) {
            map2.put(word, map2.getOrDefault(word, 0) + 1);
        }

        int count = 0;

        // Count words that appear exactly once in both arrays
        for (String word : map1.keySet()) {
            if (map1.get(word) == 1 && map2.getOrDefault(word, 0) == 1) {
                count++;
            }
        }

        return count;
    }
}