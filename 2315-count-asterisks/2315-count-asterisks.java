class Solution {
    public int countAsterisks(String s) {
        String s1="*";
        if(!s.contains(s1))
        {
            return 0;
        }
        String arr[]=s.split("\\|");
        int count=0;
        for(int i=0;i<arr.length;i=i+2)
        {
           String ans=arr[i];
           for(int j=0;j<ans.length();j++)
           {
            System.out.print(s.charAt(j)+" ");
            if(ans.charAt(j)=='*')
            {
                count++;
            }
           }
        }
        return count;
    }
}