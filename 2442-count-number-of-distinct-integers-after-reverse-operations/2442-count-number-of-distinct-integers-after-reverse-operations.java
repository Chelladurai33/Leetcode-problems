class Solution {
    public int countDistinctIntegers(int[] nums) {
        int arr[]=new int[nums.length+nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
            arr[i+nums.length]=check(nums[i]);
        }
        Set<Integer> set =  new HashSet<>();
        for(int i:arr)
        {
            set.add(i);
        }
        return set.size();
    }
    public static int check(int n)
    {
        int ans=0;
        while(n!=0)
        {
            int rem=n%10;
            ans=ans*10+rem;
            n/=10;
        }
        return ans;
    }
}