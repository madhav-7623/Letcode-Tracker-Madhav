// Last updated: 11/08/2026, 21:03:45
class Solution {
    public int fib(int n) {
        int ans=0,n1=0,n2=1;
     if(n==0)
     return 0;
     if(n==1)
     return 1;
     for(int i=2;i<=n;i++){
        ans=n1+n2;
        n1=n2;
        n2=ans;
     }   
     return ans;
    }
}