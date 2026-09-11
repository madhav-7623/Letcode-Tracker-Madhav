// Last updated: 11/09/2026, 09:43:04
class Solution {
    public int maxPower(String s) {

        int max = 1;
        int count = 1;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }

            if (count > max) {
                max = count;
            }
        }

        return max;
    }
}