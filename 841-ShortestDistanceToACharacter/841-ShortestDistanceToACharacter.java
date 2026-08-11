// Last updated: 11/08/2026, 21:04:06
class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int min = n;

            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == c) {
                    int dist = Math.abs(i - j);
                    if (dist < min) {
                        min = dist;
                    }
                }
            }

            ans[i] = min;
        }

        return ans;
    }
}