class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length()>2)
        {
            String ans="";
            for(int i=0;i<s.length()-1;i++)
            {
                ans+=(Integer.parseInt(s.charAt(i)+"")+Integer.parseInt(s.charAt(i+1)+""))%10;
            }
            s=ans;
        }
        int a=Integer.parseInt(s.charAt(0)+"");
        int b=Integer.parseInt(s.charAt(1)+"");
        if(a==b)
        {
            return true;
        }
        return false;
    }
}