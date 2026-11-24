class Solution {
    public int countDominantElements(int[] nums) {
        int count=0;
        int n=nums.length;
        if(n==1) return 1;
        if(nums[0]>=nums[1])
        {
            count++;
        }
        for(int i=1;i<n-1;i++)
        {
            double d=nums[i-1];
            d+=nums[i+1];
            d/=2;
            if(nums[i]>=d)
            {
                count++;
                System.out.println(d);
            }
        }
        if(nums[n-2]<=nums[n-1])
        {
            count++;
        }
        return count;
    }
}