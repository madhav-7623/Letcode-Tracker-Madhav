// Last updated: 16/09/2026, 23:28:51
1import java.util.HashMap;
2import java.util.Map;
3
4class Solution {
5    public int subarraysWithKDistinct(int[] nums, int k) {
6        return atMost(nums, k) - atMost(nums, k - 1);
7    }
8
9    private int atMost(int[] nums, int k) {
10        if (k < 0) return 0;
11
12        Map<Integer, Integer> freq = new HashMap<>();
13        int left = 0;
14        int distinct = 0;
15        int count = 0;
16
17        for (int right = 0; right < nums.length; right++) {
18            int num = nums[right];
19
20            if (!freq.containsKey(num) || freq.get(num) == 0) {
21                distinct++;
22            }
23
24            freq.put(num, freq.getOrDefault(num, 0) + 1);
25
26            while (distinct > k) {
27                int leftNum = nums[left];
28                freq.put(leftNum, freq.get(leftNum) - 1);
29
30                if (freq.get(leftNum) == 0) {
31                    distinct--;
32                }
33
34                left++;
35            }
36
37            count += right - left + 1;
38        }
39
40        return count;
41    }
42}