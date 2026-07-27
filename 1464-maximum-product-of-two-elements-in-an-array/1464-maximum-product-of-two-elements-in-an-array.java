class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int m=nums[nums.length-1];
        int n=nums[nums.length-2];
        return (m-1)*(n-1);
    }
}