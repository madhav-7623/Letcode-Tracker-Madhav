// Last updated: 11/09/2026, 09:43:28
class Solution {
    public int subtractProductAndSum(int n) {
        int d,ans1=1,ans2=0;
        while(n!=0){
            d=n%10;
            ans1*=d;
            ans2+=d;
            n=n/10;
        }
        return ans1-ans2;
    }
}