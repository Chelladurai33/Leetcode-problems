class Solution {
    public int[] evenOddBit(int n) {
        String s=Integer.toString(n,2);
        int odd=0;
        int even=0;
        int arr[]=new int[2];
        int count=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            char c = s.charAt(i);
            if(c=='1')
            {
                if(count%2==0)
                {
                    even++;
                }
                else
                {
                    odd++;
                }
            }
            count++;
        }
        arr[0]=even;
        arr[1]=odd;
        return arr;
        
    }
}