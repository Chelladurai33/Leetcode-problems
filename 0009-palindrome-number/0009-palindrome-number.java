class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
           int rev = 0;
        while(temp!=0)
        {
            int mod = temp%10;
            rev = rev *10+mod;
            temp=temp/10;
        }
        System.out.println(rev);
        if(x>=0)
        {
            
           if(x==rev)
           {
            return true;
           }
        }
        
        return false;
    }
}