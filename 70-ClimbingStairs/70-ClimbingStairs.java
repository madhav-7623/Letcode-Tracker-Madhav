// Last updated: 11/08/2026, 21:07:22
class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int first = 1;  // ways to reach step 1
        int second = 2; // ways to reach step 2
        int ways = 0;

        for (int i = 3; i <= n; i++) {
            ways = first + second;
            first = second;
            second = ways;
        }

        return second;
    }
}
