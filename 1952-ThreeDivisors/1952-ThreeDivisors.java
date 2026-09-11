// Last updated: 11/09/2026, 09:42:04
class Solution {
    public boolean isThree(int n) {
        int count =0;
        for (int i=1;i<=n;i++){
            if(n%i==0)
            count++;
        }
        if(count==3)
        return true;
        else 
        return false;

         
    }
}