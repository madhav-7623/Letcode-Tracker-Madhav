// Last updated: 11/08/2026, 21:01:29
import java.util.*;

class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];

        // Count frequency of each letter
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        // Sort frequencies
        Arrays.sort(freq);

        int ans = 0;
        int index = 0;

        // Traverse from highest frequency
        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0) continue;

            int cost = (index / 8) + 1;
            ans += freq[i] * cost;
            index++;
        }

        return ans;
    }
}