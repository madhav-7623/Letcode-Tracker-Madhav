// Last updated: 11/09/2026, 09:42:48
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrank = 0;
        int emptyBottles = 0;

        while (numBottles > 0) {
            totalDrank += numBottles;//13
            emptyBottles += numBottles;//13
            numBottles = emptyBottles / numExchange;// 1/11=1
            emptyBottles = emptyBottles % numExchange;//12%12=0
        }

        return totalDrank;
    }
}
