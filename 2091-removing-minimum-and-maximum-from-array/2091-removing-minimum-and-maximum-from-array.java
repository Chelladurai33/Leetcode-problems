class Solution {
   public int minimumDeletions(int[] nums) {
    int maxind1 = 0;
    int minind1 = 0;
    int n = nums.length;
    for (int i = 0; i < n; i++) {
        if (nums[i] > nums[maxind1]) {
            maxind1 = i;
        }
        if (nums[i] < nums[minind1]) {
            minind1 = i;
        }
    }
    int leftIndex = Math.min(minind1, maxind1);
    int rightIndex = Math.max(minind1, maxind1);
    int delFront = rightIndex + 1;
    int delBack = n - leftIndex;
    int delBothSides = (leftIndex + 1) + (n - rightIndex);
    return Math.min(delFront, Math.min(delBack, delBothSides));
}
}