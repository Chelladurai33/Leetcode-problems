class Solution {
    public String reverseWords(String s) {
        String ans="";
       s = s.trim().replaceAll("\\s+", " ");
        String arr[]=s.split(" ");
       for(int i=arr.length-1;i>=0;i--)
       {
             ans+=arr[i]+" ";
       }
       return ans.trim();
    }
}