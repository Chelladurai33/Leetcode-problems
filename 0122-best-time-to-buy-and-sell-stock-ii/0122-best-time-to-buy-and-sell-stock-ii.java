class Solution {
    public int maxProfit(int[] nums) {
        int sum=0;
        
        for(int i =0;i<nums.length-1;i++)
        {
            int buy=nums[i];
            int sell=nums[i+1];
            if(buy<sell)
            {
                sum=sum+(sell-buy);

            }
        }
        return sum;
    }
}