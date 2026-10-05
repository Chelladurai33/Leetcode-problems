class Solution {
    public boolean isPalindromic(String s) {
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            int m=(int)s.charAt(i);
            ans += String.format("%8s", Integer.toString(m, 2)).replace(' ', '0');
        }
       return check(ans);
    }
    public static boolean check(String ans)
    {
        int left=0;
        int right=ans.length()-1;
        while(left<right)
        {
            if(ans.charAt(left)!=ans.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}