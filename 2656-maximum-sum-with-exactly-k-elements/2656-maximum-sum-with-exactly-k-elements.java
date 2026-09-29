class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int num=nums[nums.length-1];
        int sum=0;
        int count=0;
        while(count<k)
        {
            sum+=num+count;
            count++;
        }
        return sum;
    }
}