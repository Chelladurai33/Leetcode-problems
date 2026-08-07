class Solution {
    public String maximumOddBinaryNumber(String s) {
        int arr[]=new int [s.length()];
        for(int i=0;i<s.length();i++)
        {
            arr[i]=Integer.parseInt(s.charAt(i)+"");
        }
        int one=0;
        int zero=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                one++;
            }
            else
            {
                zero++;
            }
        }
        int res[]=new int[arr.length];
        for(int i=0;i<one-1;i++)
        {
            res[i]=1;
        }
        res[arr.length-1]=1;
       String answer="";
       for(int i=0;i<res.length;i++)
       {
        answer+=res[i];
       }
       return answer;
    }
}