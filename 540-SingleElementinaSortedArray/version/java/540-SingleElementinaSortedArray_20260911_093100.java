// Last updated: 11/09/2026, 09:31:00
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int left = 0;
4        int right = nums.length - 1;
5
6        while (left < right) {
7            int mid = left + (right - left) / 2;
8
9            // Make mid even
10            if (mid % 2 == 1) {
11                mid--;
12            }
13
14            // If pair is valid, single element is on the right
15            if (nums[mid] == nums[mid + 1]) {
16                left = mid + 2;
17            } else {
18                // Pair is broken, single element is at mid or left
19                right = mid;
20            }
21        }
22
23        return nums[left];
24    }
25}