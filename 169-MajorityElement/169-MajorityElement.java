// Last updated: 11/08/2026, 21:06:42
class Solution {
    public int majorityElement(int[] nums) {
         Arrays.sort(nums); 
         int count =0,maj=0;
        for(int num:nums){
            if(count==0)
            maj=num;
          if(maj==num)
          count++;
          else
          count--;

        }
        return maj;
    }
}