class Solution {
    public int sumBase(int n, int k) {
        String s=Integer.toString(n,k);
        int sum=0;
        int res=Integer.parseInt(s);
       while(res!=0)
       {
          sum+=res%10;
          res/=10;
       }
        return  sum;
    }
}