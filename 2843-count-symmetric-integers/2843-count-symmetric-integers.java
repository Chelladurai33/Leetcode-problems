class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++)
        {
            String s=String.valueOf(i);
            if(s.length()%2==0)
            {
                if(isSym(s))
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean isSym(String s)
    {
        int firstsum=0;
        int lastsum=0;
        for(int i=0;i<s.length()/2;i++)
        {
            firstsum+=Integer.parseInt(s.charAt(i)+"");
        }
        for(int i=s.length()/2;i<s.length();i++)
        {
            lastsum+=Integer.parseInt(s.charAt(i)+"");
        }
        if(firstsum==lastsum)
        {
            return true;
        }
        return false;
    }
}