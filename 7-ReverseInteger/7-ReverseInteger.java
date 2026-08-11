// Last updated: 11/08/2026, 21:08:00
class Solution {
    public int reverse(int x) {
        int d;
        int ans = 0;

        while (x != 0) {
            d = x % 10;
            x = x / 10;

            // overflow check condition
            if (ans > Integer.MAX_VALUE / 10 ||
               (ans == Integer.MAX_VALUE / 10 && d > 7)) {
                return 0;
            }
            if (ans < Integer.MIN_VALUE / 10 ||
               (ans == Integer.MIN_VALUE / 10 && d < -8)) {
                return 0;
            }

            ans = ans * 10 + d;
        }
        return ans;
    }
}
