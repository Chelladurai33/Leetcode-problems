class Solution {
    public int countCommas(int n) {
        int sum=0;
        if(n<1000) return 0;
        for(int i=n;i>=1000;i--)
        {
            sum+=1;
        }
        return sum;
    }
}