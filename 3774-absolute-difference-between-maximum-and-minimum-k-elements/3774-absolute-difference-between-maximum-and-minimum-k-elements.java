class Solution {
    public int absDifference(int[] nums, int k) {
        int lsum=0;
        int sum=0;
        Arrays.sort(nums);
        for(int i=0;i<k;i++)
        {
            lsum+=nums[i];
        }
        int i=nums.length-1;
        while(k!=0)
        {
            sum+=nums[i--];
            k--;
        }
        return Math.abs(lsum-sum);
    }
}