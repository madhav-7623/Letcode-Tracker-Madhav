// Last updated: 11/09/2026, 09:42:53
class Solution {
    public int[] runningSum(int[] nums) {
        int i;
        int n=nums.length;
        for(i=1;i<n;i++)
           nums[i]=nums[i]+nums[i-1];
        return nums;
    }
}