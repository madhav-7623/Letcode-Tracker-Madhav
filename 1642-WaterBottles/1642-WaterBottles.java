// Last updated: 11/08/2026, 21:03:02
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
