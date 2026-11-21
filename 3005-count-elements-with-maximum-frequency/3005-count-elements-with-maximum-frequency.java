class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max=-1;
        int[] arr=new int[101];
        for(int ele:nums)
        {
            arr[ele]++;
            max=Math.max(max,arr[ele]);
        }
        int count=0;
        for(int ele:arr)
        {
            if(ele==max) 
            {
                count+=max;
            }
        }
        return count;
    }
}