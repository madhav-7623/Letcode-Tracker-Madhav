// Last updated: 11/08/2026, 21:04:22
class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] points = new int[10001];

        for (int num : nums) {
            points[num] += num;
        }

        int prev2 = 0, prev1 = 0;

        for (int i = 0; i <= 10000; i++) {
            int curr = Math.max(prev1, prev2 + points[i]);
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}