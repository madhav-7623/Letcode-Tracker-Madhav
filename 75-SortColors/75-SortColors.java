// Last updated: 11/08/2026, 21:07:14
class Solution {
    public void sortColors(int[] nums) {
        int c=0,a=0,i,s=0;
        int n=nums.length;
        for( i=0;i<n;i++){
            if (nums[i]==0)
               c++;
            else if(nums[i]==1)
               a++;
            else if(nums[i]==2)
               s++;
        }
        for(i=0;i<c;i++){
        nums[i]=0;
        System.out.print(nums[i]);
        }
        for(i=c;i<(c+a);i++){//(i=2;i<4;i++)
        nums[i]=1;
        System.out.print(nums[i]);
        }

        for(i=c+a;i<n;i++){
        nums[i]=2;
        System.out.print(nums[i]);
        }

    
    }
}