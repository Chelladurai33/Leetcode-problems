class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long sum = 0; 
        int start=0;
        int n=nums.length;
        int end=n-1;
        while(start<end)
        {
            String s = String.valueOf(nums[start]);
            s+=String.valueOf(nums[end]);
            int ans=Integer.parseInt(s);
            sum+=ans;
            start++;
            end--;
        }
        if(n%2!=0)
        {
            sum+=nums[n/2];
        }
        return sum;
    }
}