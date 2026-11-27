class Solution {
    public int splitNum(int num) {
        String s=String.valueOf(num);
        String arr[]=s.split("");
        String s1="";
        String s2="";
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                s1+=arr[i];
            }
            else
            {
                s2+=arr[i];
            }
        }
        return Integer.parseInt(s1)+Integer.parseInt(s2);
    }
}