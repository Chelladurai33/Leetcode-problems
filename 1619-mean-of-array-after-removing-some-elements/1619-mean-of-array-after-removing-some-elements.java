class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int ans = (5 * arr.length) / 100;
        double sum=0;
        System.out.print(ans);
        for(int i=ans;i<arr.length-ans;i++)
        {
            sum+=arr[i];
        }
        return sum/(arr.length-(2*ans));
    }
}