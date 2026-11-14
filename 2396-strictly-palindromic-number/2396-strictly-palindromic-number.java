class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<n-1;i++)
        {
            String a=Integer.toString(n,i);
            if(!check(a))
            {
                return false;
            }
        }
        return true;
    }
    public static boolean check(String n)
    {
        StringBuilder sb =  new  StringBuilder(n);
        sb=sb.reverse();
        String ans=sb.toString();
        return ans.equals(n);
    }
}