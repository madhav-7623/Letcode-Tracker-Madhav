// Last updated: 11/09/2026, 09:47:44
class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int high=n-1,low=0,flag=0;
        while(low<=high) {
			int mid=(low+high)/2;
			if(nums[mid]==target) 
				return mid;
			
			 else if(nums[mid]<target) 
				 low=mid+1;
			 
			 else
				 high=mid-1;
		}
        return -1;
	}
}