class Solution {
    public int sortPermutation(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        boolean isSorted = true;
        for(int i=0;i<n;i++) 
        {
            if(nums[i] != i) 
            {
                isSorted = false;
                ans &= i;
            }
        }
        if(isSorted) 
        {
            return 0;
        }
        return ans;
    }
}