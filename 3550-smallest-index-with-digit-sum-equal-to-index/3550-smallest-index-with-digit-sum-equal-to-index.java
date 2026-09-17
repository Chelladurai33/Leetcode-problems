class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<10)
            {
                if(i==nums[i])
                {
                    return i;
                }
            }
            int ans=check(nums[i]);
            if(ans==i)
            {
                return i;
            }
        }
        return -1;
    }
    public static int check(int num)
    {
        int sum=0;
        
            while(num!=0)
            {
                int rem = num%10;
                sum+=rem;
                num/=10;
            }

        
        return sum;
    }
}