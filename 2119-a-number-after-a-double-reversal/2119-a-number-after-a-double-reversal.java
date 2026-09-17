class Solution {
    public boolean isSameAfterReversals(int num) {
        int a=reverse(num);
        int b=reverse(a);
        if(b==num)
        {
            return true;
        }
        return false;
    }
    public static int reverse(int num)
    {
        int ans=0;
        while(num!=0)
        {
            int rem =num%10;
            ans=ans*10+rem;
            num/=10;
        }
        return ans;
    }
}