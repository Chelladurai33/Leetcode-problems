class Solution {
    public int countPoints(String rings) {
        String arr[]=new String[10];
        for(int i=1;i<rings.length();i=i+2)
        {
            String mn=rings.charAt(i)+"";
            int n=Integer.parseInt(mn);
            arr[n]+=rings.charAt(i-1)+"";
        }
        int maincount=0;
        for(int i=0;i<arr.length;i++)
        {
           String ans=arr[i];
           if(ans!=null && ans.contains("R") && ans.contains("B") && ans.contains("G"))
           {
                maincount++;
           }
        }
        return maincount;
    }
}