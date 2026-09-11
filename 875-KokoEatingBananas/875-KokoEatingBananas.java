// Last updated: 11/09/2026, 09:47:11
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        Arrays.sort(piles);
        int high=piles[piles.length-1];
       
        while(low<high){
        int mid=low+(high-low)/2;
         int hours=0;
        for(int pile:piles){
            hours += (pile + mid - 1) / mid;
            }
            if(hours<=h){
                high=mid;
            }
            else
                low=mid+1;
             }
        return low;
    }
}