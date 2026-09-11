// Last updated: 11/09/2026, 09:40:01
class Solution {
    public int maxDistance(String moves) {
        int x = 0, y = 0, blank = 0;

        for (char ch : moves.toCharArray()) {
            if (ch == 'U') y++;
            else if (ch == 'D') y--;
            else if (ch == 'L') x--;
            else if (ch == 'R') x++;
            else blank++;
        }

        return Math.abs(x) + Math.abs(y) + blank;
    }
}