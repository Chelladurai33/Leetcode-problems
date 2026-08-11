class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                max = max | nums[i];
            }
        }

        return max;
    }
}