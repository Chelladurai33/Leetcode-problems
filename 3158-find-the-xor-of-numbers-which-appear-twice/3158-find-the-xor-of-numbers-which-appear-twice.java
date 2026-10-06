class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int sum=0;
        Arrays.sort(nums);
        int count=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                count++;
            }
            else if(count==2)
            {
                sum=sum^nums[i];
                count=1;
            }
        }
        if(count==2)
        {
            sum=sum^nums[nums.length-1];
        }
        return sum;
    }
}