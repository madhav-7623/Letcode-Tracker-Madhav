// Last updated: 11/08/2026, 21:01:11
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int[] veltanoric = nums;

        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            long sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (firstDigit(sum) == x && sum % 10 == x) {
                    ans++;
                }
            }
        }

        return ans;
    }

    private int firstDigit(long num) {
        while (num >= 10) {
            num /= 10;
        }
        return (int) num;
    }
}