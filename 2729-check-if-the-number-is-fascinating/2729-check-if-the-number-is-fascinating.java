class Solution {
    public boolean isFascinating(int n) {
        String ans=Integer.toString(n);
        ans+= 2*n;
        ans+=3*n;
        for(int i=1;i<10;i++)
        {
            char ch = (char)(i + '0');
            if(!ans.contains(ch+"")||ans.indexOf(ch)!=ans.lastIndexOf(ch))
            {
                return false;
            }
        }
        return true;
    }
}
