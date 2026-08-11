// Last updated: 11/08/2026, 21:05:48
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0,i;
        for( i=0;i<n;i++)
        sum+=nums[i];
        n=n*(n+1)/2;
        n=n-sum;
        return n;    
    }
}