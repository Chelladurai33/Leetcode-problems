class Solution {
    public int missingMultiple(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%k==0)
            {
                list.add(nums[i]);
            }
        }
        if(list.size()==0)  return k;
        return check(k,list);
    }
    public static int check(int k,ArrayList<Integer> list)
    {
        for(int i=k;i<=1000;i=i+k)
        {
            if(!list.contains(i))
            {
                return i;
            }
        }
        return k;
    }
}