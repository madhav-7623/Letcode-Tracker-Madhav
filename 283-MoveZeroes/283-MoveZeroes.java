// Last updated: 11/08/2026, 21:05:40
class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos=0;
       for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}