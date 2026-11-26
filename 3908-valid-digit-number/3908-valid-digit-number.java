class Solution {
    public boolean validDigit(int n, int x) {
        String  s1=String.valueOf(n);
        String s2=String.valueOf(x);
        if((s1.charAt(0)+"").equals(s2))
        {
            return false;
        }
        if(s1.contains(s2))
        {
            return true;
        }
        return false;
    }
}