// Last updated: 11/08/2026, 21:07:45
class Solution {
    public int searchInsert(int[] nums, int target) {
         int n=nums.length-1;
        int high=n,low=0,flag=0,mid=0;
        while(low<=high) {
			 mid=(high+low)/2;
			if(nums[mid]==target) 
				return mid;
			
			 else if(nums[mid]<target) 
				 low=mid+1;
			 
			 else
				 high=mid-1;
		}
        return low;
        
    }
}