class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            char c =s.charAt(i);
            char m= (char) ('z' - (c - 'a'));
            int a=(m-'a')+1;
            ans+=(a*(i+1));
        }
        return ans;
    }
}