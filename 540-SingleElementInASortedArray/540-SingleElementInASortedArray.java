// Last updated: 11/09/2026, 09:48:21
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Make mid even
            if (mid % 2 == 1) {
                mid--;
            }

            // If pair is valid, single element is on the right
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } else {
                // Pair is broken, single element is at mid or left
                right = mid;
            }
        }

        return nums[left];
    }
}