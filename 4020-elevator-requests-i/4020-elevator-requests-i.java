class Solution {
    public int elevatorRequests(int n, int[]arr) {
        int time=arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            int m=Math.abs(arr[i]-arr[i+1]);
            time+=m;
        }
        return time;
    }
}