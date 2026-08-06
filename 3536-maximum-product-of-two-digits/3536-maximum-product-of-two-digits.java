class Solution {
    public int maxProduct(int n) {
        String s=String.valueOf(n);
        int arr[]=new int[s.length()];
        for(int i=0;i<arr.length;i++)
        {
            String ans=s.charAt(i)+"";
            arr[i]=Integer.parseInt(ans);
        }
        Arrays.sort(arr);
        return arr[arr.length-1]*arr[arr.length-2];
    }
}