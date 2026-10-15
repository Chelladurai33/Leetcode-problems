class Solution {
    public int alternateDigitSum(int n) {
        String s=String.valueOf(n);
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            int a=Integer.parseInt(s.charAt(i)+"");
            if(i%2==0)
            {
                sum+=a;
            }
            else
            {
                sum-=a;
            }
        }
        return sum;
    }
}