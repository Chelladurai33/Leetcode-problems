class Solution {
    public int removeElement(int[] nums, int val) {
        int index=0;
        int count=0;
        for(int i:nums)
        {
            if(i!=val)
            {
                nums[index++]=i;
                count++;
            }
     
        }
        return count;
    }
}