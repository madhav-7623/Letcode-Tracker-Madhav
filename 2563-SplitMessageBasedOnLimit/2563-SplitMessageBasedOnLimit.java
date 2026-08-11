// Last updated: 11/08/2026, 21:02:09
class Solution {
    public String[] splitMessage(String message, int limit) {
        int n = message.length();
        int sumDigits = 0;

        for (int parts = 1; parts <= n; parts++) {
            int digits = String.valueOf(parts).length();
            sumDigits += digits;

            int suffixLength = digits * parts + sumDigits + 3 * parts;

            if (limit * parts - suffixLength >= n) {
                String[] ans = new String[parts];
                int idx = 0;

                for (int i = 1; i <= parts; i++) {
                    String suffix = "<" + i + "/" + parts + ">";
                    int take = limit - suffix.length();

                    ans[i - 1] = message.substring(idx, Math.min(n, idx + take)) + suffix;
                    idx += take;
                }

                return ans;
            }
        }

        return new String[0];
    }
}