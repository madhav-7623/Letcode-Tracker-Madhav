// Last updated: 11/09/2026, 09:43:54
class Solution {
    public int tribonacci(int n) {
     int ans=0,n1=0,n2=1,n3=1,n4=0;
     if(n==1||n==0)
     return n;
     if(n==2)
     return 1;
     for(int i=3;i<=n;i++){
        ans=n1+n2+n3;
        n1=n2;
        n2=n3;
       n3=ans;
     }   
     return ans;
        
    }
}