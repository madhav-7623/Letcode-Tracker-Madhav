// Last updated: 11/09/2026, 09:41:19
class Solution {
    public int passThePillow(int n, int time) {
        int cyc=time/(n-1);
        int rs=time%(n-1);
        return cyc%2==0?rs+1:n-rs;

        
    }
}