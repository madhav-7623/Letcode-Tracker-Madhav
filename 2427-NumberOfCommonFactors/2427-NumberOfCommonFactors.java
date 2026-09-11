// Last updated: 11/09/2026, 09:41:35
class Solution {
    public int commonFactors(int a, int b) {
         int count =0;
        /* int c;
         if(a<b)
         c=b;
         else
         c=a;*/
        for (int i=1; i <= a && i <= b;i++){
       //for (int i=1; i<=c;i++)
            if(a%i==0  && b%i==0)
            count++;
        }
        return count;

    }
}