class Solution {
    public int minimumChairs(String s) {
        String m="";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='E')
            {
                count++;
            }
        }
        int max=0;
        int fc=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='E')
            {
                fc++;
                max=Math.max(max,fc);
                count--;
            }
            else
            {
                fc--;
            }
            if(count==0)
            {
                break;
            }
            
        }
        return max;
    }
}