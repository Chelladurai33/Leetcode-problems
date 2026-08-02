class Solution {
    public int hIndex(int[] arr) {
        int nums[]=new int[arr.length];
        int ind=0;
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--)
        {
            nums[ind++]=arr[i];
        }
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (nums[i] >= i + 1)
            {
                     count = i + 1;
            }
            
            else{
                break;
            }
        }
        return count;
    }
}