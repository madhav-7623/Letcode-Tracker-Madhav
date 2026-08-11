// Last updated: 11/08/2026, 21:01:43
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int inject = (mainTank - 1) / 4;
        inject = inject < additionalTank ? inject : additionalTank;
        return (mainTank + inject) * 10;
    }
}