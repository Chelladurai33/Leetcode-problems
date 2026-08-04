class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        int ind=0;
        for(int i=nums[0];i<nums[nums.length-1];i++)
        {
            if(nums[ind]!=i)
            {
                list.add(i);
                
            }
            else
            {
                ind++;
            }
        }
        return list;
    }
}