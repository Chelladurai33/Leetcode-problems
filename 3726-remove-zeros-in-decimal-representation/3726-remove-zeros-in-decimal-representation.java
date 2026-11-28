class Solution {
    public long removeZeros(long n) {
        String s=String.valueOf(n);
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c!='0')
            {
                ans+=c;
            }
        }
        return Long.parseLong(ans);
    }
}