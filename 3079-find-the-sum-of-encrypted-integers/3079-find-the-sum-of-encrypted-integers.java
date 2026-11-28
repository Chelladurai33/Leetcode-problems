class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int i:nums)
        {
            if(i<10)
            {
                sum+=i;
            }
            else
            {
                int a=check(i);
                sum+=a;
            }
        }
        return sum;
    }
    public static int check (int n)
    {
        int max=0;
        int count=0;
        while(n!=0)
        {
            int rem = n%10;
            if(rem>max)
            {
                max=rem;
            }
            count++;
            n/=10;
        }
        int ans=0;
        while(count!=0)
        {
            ans=ans*10+max;
            count--;
        }
        return ans;
    }
}