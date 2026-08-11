// Last updated: 11/08/2026, 21:05:11
class Solution {
    public char findTheDifference(String s, String t) {
        char ans = 0;

        for (char c : s.toCharArray()) {
            ans ^= c;
        }

        for (char c : t.toCharArray()) {
            ans ^= c;
        }

        return ans;
    }
}