class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
        {
            return nums[0];
        }
        
        return solve(nums);
    }
    public int solve(int [] nums)
    {
        int n=nums.length;
        int prev1=nums[0];
        int prev2=0;
        for(int i=1;i<n;i++)
        {
            int inc=prev2+nums[i];
            int exc=prev1;
            int ans=Math.max(inc,exc);
            prev2=prev1;
            prev1=ans;
        }
        return prev1;
        
    }
}