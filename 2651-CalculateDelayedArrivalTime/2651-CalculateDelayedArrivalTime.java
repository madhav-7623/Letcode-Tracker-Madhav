// Last updated: 11/09/2026, 09:41:07
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return((arrivalTime+delayedTime)%24);
        
    }
}