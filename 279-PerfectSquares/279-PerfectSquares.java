// Last updated: 11/08/2026, 21:05:45
class Solution {
    public int numSquares(int n) {

        
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                return 1;
            }
        }

      
        for (int i = 1; i * i <= n; i++) {
            int remaining = n - i * i;
            for (int j = 1; j * j <= remaining; j++) {
                if (j * j == remaining) {
                    return 2;
                }
            }
        }

       
        int temp = n;
        while (temp % 4 == 0) {
            temp /= 4;
        }
        if (temp % 8 == 7) {
            return 4;
        }

        // Case 4: otherwise
        return 3;
    }
}
