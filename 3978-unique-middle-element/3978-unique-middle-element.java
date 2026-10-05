class Solution {
    public boolean isMiddleElementUnique(int[] arr) {
        if(arr.length==1) return true;
        int n=arr.length/2;
        int a=arr[n];
        int count=0;
        for(int i:arr)
        {
            if(i==a)
            {
                count++;
            }
        }
        if(count==1)
        {
            return true;
        }
        return false;
    }
}