// Last updated: 11/08/2026, 21:06:17
class Solution {
    public boolean isHappy(int n) {
        int ans,d;
        while(n!=1&&n!=4){
            ans=0;
        while(n!=0){
            d=n%10;
            ans= ans+(d*d);
             n=n/10;
        }
        n=ans;
        }
        if(n==1)
        return true;
        else 
        return false;
    }
}