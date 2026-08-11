// Last updated: 11/08/2026, 21:06:30
class Solution {
    public int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            if (n % 2 != 0) {  
                count++;
            }
            n = n / 2;         
        }

        return count;
    }
}
