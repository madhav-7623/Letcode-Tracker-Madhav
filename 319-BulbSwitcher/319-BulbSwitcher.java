// Last updated: 11/08/2026, 21:05:35
class Solution {
    public int bulbSwitch(int n) {
        int count = 0;
        int i = 1;

        while (i * i <= n) {
            count++;
            i++;
        }

        return count;
        
    }
}