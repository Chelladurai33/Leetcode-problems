class Solution {
    public int totalMoney(int n) {
        int sum=0;
        if(n<=7)
        {
            for(int i=1;i<=n;i++)
            {
                sum+=i;
            }
            return sum;
        }
        int val=0;
        int temp=1;
        int tar=7;
        while(n!=0)
        {
            if(val==tar)
            {
                val=temp;
                temp++;
                tar++;
            }
            val++;
            n--;
            sum+=val;
        }
        return sum;
    }
}