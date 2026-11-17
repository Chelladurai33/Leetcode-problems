class Solution {
    public int[] replaceElements(int[] arr) {
        int nums[] = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) 
        {
            nums[i] = fmax(i + 1, arr);
        }
        nums[nums.length - 1] = -1;
        return nums;
    }
    public static int fmax(int m, int arr[]) 
    {
        int max = arr[m];
        for (int i = m + 1; i < arr.length; i++) 
        {
            if (arr[i] > max) 
            {
                max = arr[i];
            }
        }
        return max;
    }
}