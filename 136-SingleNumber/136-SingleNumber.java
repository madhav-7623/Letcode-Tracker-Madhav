// Last updated: 11/08/2026, 21:06:59
import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int ans=0,i;
        for(i=0;i<n;i++)
        ans=ans^nums[i];
        return ans;
    }
 }