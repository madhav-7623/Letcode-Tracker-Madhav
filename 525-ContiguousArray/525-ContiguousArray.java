// Last updated: 11/08/2026, 21:04:48
import java.util.*;

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0)
                sum -= 1;
            else
                sum += 1;

            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}