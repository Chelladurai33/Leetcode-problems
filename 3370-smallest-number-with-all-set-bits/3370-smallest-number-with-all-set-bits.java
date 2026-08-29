class Solution {
    public int smallestNumber(int n) {
        String a=Integer.toBinaryString(n);
        int b=a.length();
        String ans="";
        for(int i=0;i<b;i++)
        {
            ans+="1";
        }
       return  Integer.parseInt(ans, 2);
        
    }
}