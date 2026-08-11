// Last updated: 11/08/2026, 21:01:32
import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int maxFreq = 0;

        for (int freq : map.values()) {
            if (freq > maxFreq) {
                maxFreq = freq;
            }
        }

        int ans = 0;

        for (int freq : map.values()) {
            if (freq == maxFreq) {
                ans += freq;
            }
        }

        return ans;
    }
}