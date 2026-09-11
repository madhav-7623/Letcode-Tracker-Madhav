// Last updated: 11/09/2026, 09:40:46
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int inject = (mainTank - 1) / 4;
        inject = inject < additionalTank ? inject : additionalTank;
        return (mainTank + inject) * 10;
    }
}