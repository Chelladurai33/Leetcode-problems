class Solution {
    public int kthSmallest(int[][] arr, int k) {
        //int arr[]=new int[nums.length*nums[0].length];

        int[] nums = Arrays.stream(arr).flatMapToInt(Arrays::stream).toArray();
        Arrays.sort(nums);
      return nums[k-1];
}
}