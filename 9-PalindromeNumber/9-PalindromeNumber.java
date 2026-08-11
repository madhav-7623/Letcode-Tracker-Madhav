// Last updated: 11/08/2026, 21:07:59
class Solution {
    public boolean isPalindrome(int x) {
        int ans=0,d,temp;
        temp=x;
        while(x!=0){
            d=x%10;
            ans=ans*10+d;
            x=x/10;
        }
        if(temp<0)
        return false;
        else if(ans==temp)
        return true;
        else 
        return false;
    }
}