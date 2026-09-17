class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arr[]=new int[nums.length];
        int indp=0;
        int indo=1;
        for(int i=0;i<nums.length;i++)
        {
             if(nums[i]>0)
             {
                arr[indp]=nums[i];
                indp=indp+2;
             }
             else
             {
                arr[indo]=nums[i];
                indo=indo+2;
             }
        }
        return arr;
    }
}