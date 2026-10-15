class Solution {
    public boolean areNumbersAscending(String s) {
       s=s.replaceAll("[qwertyuiopasdfghjklzxcvbnm]","");
       s=s.trim();
       String arr[]=s.split(" ");
       int n=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++)
       {
           if(!arr[i].isEmpty())
           {
                int a=Integer.parseInt(arr[i]);
                if(n<a)
                {
                    n=a;
                }
                else
                {
                    return false;
                }
           }
       }
       return true;
    }
}