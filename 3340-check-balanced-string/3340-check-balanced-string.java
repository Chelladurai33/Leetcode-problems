class Solution {
    public boolean isBalanced(String num) {
        String arr[]=num.split("");
        int odd=0;
        int even=0;
        for(int i=0;i<arr.length;i=i+2)
        {
                  int ans1=Integer.parseInt(arr[i]);
                  odd+=ans1;
        }
        for(int i=1;i<arr.length;i=i+2)
        {
                 int ans2=Integer.parseInt(arr[i]);
                 even+=ans2;
        }
        if(odd==even)
        {
            return true;
        }
        return false;
    }
}