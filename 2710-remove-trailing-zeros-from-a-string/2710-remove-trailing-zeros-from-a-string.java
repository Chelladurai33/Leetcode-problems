class Solution {
    public String removeTrailingZeros(String num) {
        if(num.length()==1  && num.charAt(0)!='0')
        {
            return num;
        }
        int a=num.length()-1;
        for(int i=num.length()-1;i>=0;i--)
        {
            if(num.charAt(i)!='0')
            {
                a=i;
                break;
            }
        }
        return num.substring(0,a+1);
    }
}