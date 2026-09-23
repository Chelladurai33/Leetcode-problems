class Solution {
    public int firstMatchingIndex(String s) {
        int n=s.length();
        String arr[]=s.split("");
        for(int i=0;i<arr.length;i++)
        {
            
            if(arr[i].equals(arr[n-i-1]))
            {
                return i;
            }
        }
        return -1;
    }
}