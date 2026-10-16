class Solution {
    public int countSegments(String s) {
        String arr[]=s.split("\\s+");
        int count=0;
        for(String ans:arr)
        {
            if(!ans.isEmpty())
            {
                count++;
            }
        }
        return count;
    }
}